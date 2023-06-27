package GestaoProjectos;

import java.util.Stack;

public class PilhaAcoes {
    private Stack<String> pilha;

    public PilhaAcoes() {
        pilha = new Stack<>();
    }

    public void realizarAcao(String acao) {
        pilha.push(acao);
    }

    public String desfazerAcao() {
        return pilha.pop();
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }
}
