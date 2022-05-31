import classes.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
            if (lanche instanceof pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - broto");
                System.out.println("SM - pequena");
                System.out.println("MD - média");
                System.out.println("LG - grande");
                System.out.println("XL - família");
                ((pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }

            System.out.println("Borda recheada? (S/N)");
            String borda = in.nextLine();
            miniPizza.setBordarecheada(borda.equalsIgnoreCase("S"));
            if (miniPizza.isBordarecheada()) {
                System.out.println("Qual o sabor da borda?");
                //String saborborda = in.next();
                miniPizza.setSaborborda(in.nextLine());
            }
        }

        if (lanche instanceof Sanduiche) {
            Sanduiche add = ((Sanduiche) lanche);

            System.out.println("Gostaria de adicional? S/N");
            in.nextLine();
            String adicional = in.nextLine();
            if (adicional.equalsIgnoreCase("S")) {
                System.out.println("Deseja quantos adicionais?");
                int quantidadeadd = in.nextInt();
                in.nextLine();
                for (int i = 0; i < quantidadeadd; i++) {
                    System.out.println("Qual adicional você quer colocar?");
                    ((Sanduiche) lanche).adicionarIngredientes(in.nextLine());
                    if (i == 9) {
                        System.err.println("Quantidade máxima de adicionais");
                        break;
                    }
                }
            }
        }

        System.out.print("Informe o valor de " + lanche.getTipo() + ": R$");
        lanche.setValor(in.nextDouble());
        lanche.montarComanda();
    }
}
//GET pegar um valor q ja foi dado, se booleano is+nomedafunçâo
//SET tu vai dar um valor a variável