package GestaoProjectos;

import java.util.Date;

// Classe que representa um marco de projeto
class MarcoProjeto {
    private String descricao;
    private Date prazo;

    public MarcoProjeto(String descricao, Date prazo) {
        this.descricao = descricao;
        this.prazo = prazo;
    }

    // Getters e setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }
}