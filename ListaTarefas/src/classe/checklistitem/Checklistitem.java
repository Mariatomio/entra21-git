package classe.checklistitem;

import java.util.UUID;

public class Checklistitem {
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;
  /*  private int ordem;*/

    public Checklistitem() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {
        setCompleta(true);
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public boolean isCompleta() {
        return this.completa;
    }

}

