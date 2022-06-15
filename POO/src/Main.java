import classes.cliente.Cliente;
import classes.lanches.*;
import classes.pedido.Pedido;

import java.util.Scanner;
public class Main {
    public static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.println("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());//metodo não tem atribuição
        for (int i = 0; i < 10; i++) {
           cl.getPedido().adicionarLanche(montarLanche());
           if (i == 9) {
               System.err.println("Número máximo de pedidos atingidos");
               break;
           }
            System.out.println("Deseja mais um lanche? (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Pedido de: " + cl.getNome());
        cl.getPedido().imprimircomanda();


    }
    private static Lanche montarLanche(){
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");
        int escolha = in.nextInt();
        Lanche lanche = null;
        switch (escolha) {
            case 1:
                lanche = new XSalada();

                break;
            case 2:
                lanche = new XBurguer();

                break;
            case 3:
                lanche = new Mistoquente();

                break;
            case 4:
                lanche = new HotDog();

                break;
            case 5:
                lanche = new MiniPizza();

                break;
            case 6:
                lanche = new pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (escolha == 1 || escolha == 2) {
            System.out.println("Lanche aberto? (S/N)");
            in.nextLine();
            String aberto = in.next();
            ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
        }
        if (escolha >= 5) {
            System.out.println("Escolha o sabor da pizza: ");
            System.out.println("(1) - 4 Queijos");
            System.out.println("(2) - Calabresa ");
            System.out.println("(3) -  Frango c/ catupiry");
            System.out.println("(4) -  Marguerita");
            System.out.println("(5) -  Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.adicionarSaborEIngredientes("4 Queijos");
                    break;
                case 2:
                    miniPizza.adicionarSaborEIngredientes("Calabresa");
                    break;
                case 3:
                    miniPizza.adicionarSaborEIngredientes("Frango c/ catupiry");
                    break;
                case 4:
                    miniPizza.adicionarSaborEIngredientes("Marguerita");
                    break;
                case 5:
                    miniPizza.adicionarSaborEIngredientes("Portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor  válido");

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