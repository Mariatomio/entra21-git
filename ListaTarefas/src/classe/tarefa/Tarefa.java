package classe.tarefa;

import classe.checklistitem.Checklistitem;

import java.util.UUID;

public class Tarefa {
   private Checklistitem[] checklistitem;
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa; //completa ss ou nn
    private int ordem;

    public Tarefa() { // deve popular o atributo UUID automaticamente
        this.setUuid(UUID.randomUUID().toString());

    }
    public void completar() { //vai marcar a tarefa como completa
        this.setCompleta(true);
        for (Checklistitem item : this.getChecklistitem()){
            if (item != null){
                item.completar();
            }
        }
    }
    public boolean temChecklist(){
        return this.getChecklistitem() != null;
    }
    public void criarChecklist(int tamanho){
        this.setChecklistitem(new Checklistitem[tamanho]);

    }
    public boolean adicionarChecklistitem(Checklistitem item){
        for (int i = 0; i < this.getChecklistitem().length; i++) {
            if (this.getChecklistitem()[i] == null) {
                this.getChecklistitem()[i] = item;
                return true;
            }
        }
        return false;
    }
    //GETTERS AND SETTERS-----------------------------------------------------------------------------------------------


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

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getOrdem() {
        return this.ordem;
    }
    public void setChecklistitem(Checklistitem[] checklistitem) {
        this.checklistitem = checklistitem;
    }
    public Checklistitem[] getChecklistitem() {
        return this.checklistitem;
    }


}
