package GestaoProjectos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoTarefas {
    private Map<Integer, Tarefa> tarefas;
    private Map<Tarefa, List<Tarefa>> dependencias;

    public GrafoTarefas() {
        tarefas = new HashMap<>();
        dependencias = new HashMap<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.put(tarefa.getId(), tarefa);
    }

    public void adicionarDependencia(Tarefa origem, Tarefa destino) {
        List<Tarefa> listaDependencias = dependencias.getOrDefault(origem, new ArrayList<>());
        listaDependencias.add(destino);
        dependencias.put(origem, listaDependencias);
    }

    public Tarefa obterTarefaPorId(int id) {
        return tarefas.get(id);
    }

    public List<Tarefa> obterTarefasCriticas() {
        List<Tarefa> tarefasCriticas = new ArrayList<>();
        for (Tarefa tarefa : tarefas.values()) {
            if (dependencias.containsKey(tarefa)) {
                tarefasCriticas.add(tarefa);
            }
        }
        return tarefasCriticas;
    }

    public List<Tarefa> obterCaminhoMaisCurto(Tarefa origem, Tarefa destino) {
        List<Tarefa> caminhoMaisCurto = new ArrayList<>();
        List<Tarefa> caminhoAtual = new ArrayList<>();
        caminhoAtual.add(origem);
        obterCaminhoMaisCurtoRecursivamente(origem, destino, caminhoAtual, caminhoMaisCurto);
        return caminhoMaisCurto;
    }

    private void obterCaminhoMaisCurtoRecursivamente(Tarefa origem, Tarefa destino, List<Tarefa> caminhoAtual, List<Tarefa> caminhoMaisCurto) {
        if (origem.equals(destino)) {
            if (caminhoMaisCurto.isEmpty() || caminhoAtual.size() < caminhoMaisCurto.size()) {
                caminhoMaisCurto.clear();
                caminhoMaisCurto.addAll(caminhoAtual);
            }
            return;
        }

        List<Tarefa> listaDependencias = dependencias.get(origem);
        if (listaDependencias != null) {
            for (Tarefa tarefa : listaDependencias) {
                caminhoAtual.add(tarefa);
                obterCaminhoMaisCurtoRecursivamente(tarefa, destino, caminhoAtual, caminhoMaisCurto);
                caminhoAtual.remove(tarefa);
            }
        }
    }
}
