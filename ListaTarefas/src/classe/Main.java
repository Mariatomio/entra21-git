package classe;

import classe.checklistitem.Checklistitem;
import classe.listaTarefas.ListaTarefa;
import classe.tarefa.Tarefa;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in); //ai consegue usar em mais lugares

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de tarefas da lista: ");
        ListaTarefa lt = new ListaTarefa(in.nextInt());
        in.nextLine();
        System.out.println("Informe um nome para a lista de tarefas: ");
        lt.setNomeLista(in.nextLine());

        while (true){
            Tarefa t = criarTarefa();
            if (!lt.adicionarTarefa(t)) {
                System.err.println("Impossível adicionar tarefa!");
                break;
            }
        System.out.println("Deseja adicionar mais tarefas? (S/N)");
        String add = in.nextLine();
        if (add.equalsIgnoreCase("N")) {
            break;
        }

    }
    }

    public static Tarefa criarTarefa() {
        Tarefa t = new Tarefa();
        //ListaTarefa lt = new ListaTarefa(in.nextInt());

        System.out.println("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());

        System.out.println("Informe a descrição da tarefa: ");
        t.setDescricao(in.nextLine());

        System.out.println("Ordem da tarefa: ");
        t.setOrdem(in.nextInt());
        in.nextLine();

        System.out.println("Tarefa tem checklist? (S/N)");
      String checklist = in.nextLine();
        if (checklist.equalsIgnoreCase("S"))

            System.out.println("Informe o tamanho da checklist: ");
            t.criarChecklist(in.nextInt());
        in.nextLine();
        while (true) {
            Checklistitem item = new Checklistitem();
            System.out.println("informe um nome para o item: ");
            item.setNome(in.nextLine());
            System.out.println("Informe uma descrição para o item: ");
            item.setDescricao(in.nextLine());
t.adicionarChecklistitem(item);
            System.out.println("Deseja adicionar mais itens? (S/N)");
            String add = in.nextLine();
            if (add.equalsIgnoreCase("N")) {
                break;
            }

        }
        return t;
    }
}



