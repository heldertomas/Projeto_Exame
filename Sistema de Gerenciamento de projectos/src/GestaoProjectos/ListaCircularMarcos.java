package GestaoProjectos;

import java.util.ArrayList;
import java.util.List;

public class ListaCircularMarcos {
    private List<MarcoProjeto> lista;
    private int posicaoAtual;

    public ListaCircularMarcos() {
        lista = new ArrayList<>();
        posicaoAtual = 0;
    }

    public void adicionarMarco(MarcoProjeto marco) {
        lista.add(marco);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public void percorrerMarcos() {
        int tamanho = lista.size();
        for (int i = 0; i < tamanho; i++) {
            MarcoProjeto marco = lista.get(posicaoAtual);
            System.out.println("- " + marco.getDescricao());
            posicaoAtual = (posicaoAtual + 1) % tamanho;
        }
    }
}
