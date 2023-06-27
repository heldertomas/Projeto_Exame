package GestaoProjectos;

public class NoArvore {
    private Tarefa tarefa;
    private NoArvore filhoEsquerda;
    private NoArvore filhoDireita;

    public NoArvore(Tarefa tarefa) {
        this.tarefa = tarefa;
        filhoEsquerda = null;
        filhoDireita = null;
    }

    // getters e setters

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public NoArvore getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(NoArvore filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public NoArvore getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(NoArvore filhoDireita) {
        this.filhoDireita = filhoDireita;
    }
}
