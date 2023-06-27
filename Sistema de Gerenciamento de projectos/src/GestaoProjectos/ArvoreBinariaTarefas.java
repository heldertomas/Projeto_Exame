package GestaoProjectos;

public class ArvoreBinariaTarefas {
    private NoArvore raiz;

    public ArvoreBinariaTarefas() {
        raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public void inserirTarefa(Tarefa tarefa) {
        if (isEmpty()) {
            raiz = new NoArvore(tarefa);
        } else {
            inserirRecursivamente(raiz, tarefa);
        }
    }

    private void inserirRecursivamente(NoArvore nodo, Tarefa tarefa) {
        if (tarefa.getPrioridade() <= nodo.getTarefa().getPrioridade()) {
            if (nodo.getFilhoEsquerda() == null) {
                nodo.setFilhoEsquerda(new NoArvore(tarefa));
            } else {
                inserirRecursivamente(nodo.getFilhoEsquerda(), tarefa);
            }
        } else {
            if (nodo.getFilhoDireita() == null) {
                nodo.setFilhoDireita(new NoArvore(tarefa));
            } else {
                inserirRecursivamente(nodo.getFilhoDireita(), tarefa);
            }
        }
    }

    public void percorrerArvore() {
        percorrerEmOrdem(raiz);
    }

    private void percorrerEmOrdem(NoArvore nodo) {
        if (nodo != null) {
            percorrerEmOrdem(nodo.getFilhoEsquerda());
            System.out.println("- " + nodo.getTarefa().getDescricao());
            percorrerEmOrdem(nodo.getFilhoDireita());
        }
    }
}
