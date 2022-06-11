package classe.listaTarefas;

import classe.tarefa.Tarefa;

public class ListaTarefa {
    private int tamanhoLista;

    private String nomeLista;

    private Tarefa[] tarefas; //LISTA DE TAREFAS

    //------------------------------------------------------------------------------------------------------------------
    public ListaTarefa(int tamanhoLista) { //CONSTRUTOR
        this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]);

    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        if (tarefa.getOrdem() < 0 ||
                tarefa.getOrdem() >= this.getTamanhoLista()) {
            return false;
        }
        for (int i = 0; i < this.getTamanhoLista(); i++) {
            if (this.getTarefas()[i] == null) {
                this.getTarefas()[i] = tarefa;
                return true;
            } else if (this.tarefas[i].getOrdem() == tarefa.getOrdem()) {
                break;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int posicao) {
        for (Tarefa t: this.getTarefas()) {
            if (t != null && t.getOrdem() == posicao) {
                return t;
            }
            }
        return null;
        }
     /*   return this.tarefas[posicao]*/;


    public boolean alterarOrdemTarefa(int antigaOrdem, int novaOrdem) {
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem); //ENTENDI MAIS OU MENOS ESSA PARTE
        Tarefa tarefaNova = buscarTarefa(novaOrdem);
        if (tarefaAntiga == null || tarefaNova == null) {
            return false;
        }

         tarefaAntiga.setOrdem(novaOrdem);
         tarefaNova.setOrdem(antigaOrdem);
        return true;
    }

    //GETTERS AND SETTERS-----------------------------------------------------------------------------------------------
    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public int getTamanhoLista() {
        return this.tamanhoLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public String getNomeLista() {
        return this.nomeLista;
    }

    public Tarefa[] getTarefas() {
        return this.tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}

