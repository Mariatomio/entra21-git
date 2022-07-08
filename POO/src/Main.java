import classes.cliente.Cliente;
import classes.lanches.*;
import classes.pedido.Pedido;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if(in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: "+cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        Lanche lanche = null;
        while (lanche == null) {
            System.out.println("-MENU: Escolha uma opção-");
            System.out.println("(1) - X-Salada");
            System.out.println("(2) - X-Burguer");
            System.out.println("(3) - Misto Quente");
            System.out.println("(4) - Hot Dog");
            System.out.println("(5) - Mini Pizza");
            System.out.println("(6) - Pizza");
            int escolha = 0;
            try {
                escolha = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha um lanche válido!");
            } finally {
                in.nextLine();
            }
            public static ELanche escolherOpcao(ELanche ) {
                ELanche escolha = null;
                while (escolha == null) {
                    if (item != null) {
                        while (escolha == null) {
                            System.out.println(item.getTitulo() + " encontrado! Ações disponíveis: ");
                            for (ELanche i : ELanche.values()) {
                                System.out.printf("(%d) %s\n", i.getValorOpcao(), i.getDescricao());
                            }
                            escolha = ELanche.getByValorOpcao(in.nextInt());
                            if (escolha == null) {
                                System.err.println("Selecione uma opção válida");
                            }
                        }
                    } else {
                        System.out.println("Selecione uma opção");
        }
            switch (escolha) {
                case ELanche.XSALADA -> lanche = new XSalada();
                case 2 -> lanche = new XBurguer();
                case 3 -> lanche = new Mistoquente();
                case 4 -> lanche = new HotDog();
                case 5 -> lanche = new MiniPizza();
                case 6 -> lanche = new pizza();
                default -> System.err.println("Escolha uma opção válida!");
            }
        }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) "+lanche.getTipo()+": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }
}
//GET pegar um valor q ja foi dado, se booleano is+nomedafunçâo
//SET tu vai dar um valor a variável