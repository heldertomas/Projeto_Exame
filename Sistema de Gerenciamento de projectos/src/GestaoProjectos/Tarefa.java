package GestaoProjectos;

import java.util.Date;

public class Tarefa {
    private int id;
    private String descricao;
    private Date prazo;
    private String responsavel;
    private int prioridade;
    private int complexidade;

    public Tarefa(String descricao, Date prazo, String responsavel) {
        this.id = id;
        this.descricao = descricao;
        this.prazo = prazo;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.complexidade = complexidade;
    }

    // getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }
}
