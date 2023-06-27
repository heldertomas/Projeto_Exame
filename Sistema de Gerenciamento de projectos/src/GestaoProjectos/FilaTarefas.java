package GestaoProjectos;

import java.util.LinkedList;
import java.util.Queue;

public class FilaTarefas {
    private Queue<Tarefa> fila;

    public FilaTarefas() {
        fila = new LinkedList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        fila.add(tarefa);
    }

    public Tarefa removerTarefa() {
        return fila.poll();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }
}
