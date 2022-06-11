import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Estante e = new Estante(5);

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Escolha uma opção: ");
                System.out.println("(1) - Adicionar item: ");
                System.out.println("(2) - Buscar e tratar retorno");
                System.out.println("    - Avaliar");
                System.out.println("    - Ver avaliações");
                System.out.println("(3) - Remover");
                System.out.println("(4) - Mostrar itens na estante");
                System.out.println("(0) - Sair");
                int escolha = in.nextInt();

                switch (escolha) {

                    case 1:
                        adicionaraItem(e);
                        break;

                    case 2:
                        BuscarETratarretorno();
                        break;
                    case 3:
                        Remover();

                        break;
                    case 4:
                        MostrarAEstante();
                        break;

                    case 0:
                        loop = false;
                        break;
                    default:
                        System.err.println("Escolha uma opção válida!");
                }


                if (i == 5) {
                    System.err.println("Número máximo de pedidos atingidos");
                    break;
                }
                if (escolha == 1) {
                    System.out.println();
                    System.out.println("Deseja continuar? (S/N)");
                    if (in.next().equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
        }
    }

    public static void adicionaraItem(Estante e) {
        if (e.estanteCheia()) {
            System.out.println("Sua estante está cheia! Não é possível adicionar mais itens");
        } else {
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.println("(0) - Livro");
                System.out.println("(1) - DVD");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Escolha uma opção válida!");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            if (i instanceof Livro) {
                Livro l = ((Livro) i);
                System.out.print("Informe o título: ");
                i.setTitulo(in.nextLine());
                System.out.print("Informe o gênero: ");
                i.setGenero(in.nextLine());
                System.out.print("Informe o valor R$: ");
                i.setValor(in.nextDouble());
                in.nextLine();
                System.out.print("Informe o autor(a): ");
                l.setAutor(in.nextLine().toLowerCase());
                System.out.print("Informe a quantidade de páginas: ");
                l.setQtdePaginas(in.nextInt());
                System.out.print("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                System.out.print("Informe a edição: ");
                l.setEdicao(in.nextInt());
                //e.adicionarItem(l);
            } else {
                DVD dvd = ((DVD) i);
                System.out.print("Informe o título: ");
                i.setTitulo(in.nextLine());
                System.out.print("Informe o gênero: ");
                i.setGenero(in.nextLine());
                System.out.print("Informe o valor R$: ");
                i.setValor(in.nextDouble());
                in.nextLine();
                System.out.print("Informe o diretor do DVD: ");
                dvd.setDiretor(in.next());
                in.nextLine();
                System.out.print("Informe a duração do DVD: ");
                dvd.setDuracao(in.nextDouble());
                System.out.print("Informe o ano de lançamento: ");
                dvd.setAnoLancamento(in.nextInt());
                //e.adicionarItem(dvd);
            }
            if (!e.adicionarItem(i)) {
                System.err.println("Não foi possível adicionar item a estante");
            } else {
                System.out.println("Item aficionado com sucesso!");
            }
        }
    }

    public static void BuscarETratarretorno() {

    }

    public static void Remover() {

    }

    //----------------------------------MOSTRAR ESTANTE---------------------------------------------------------------------
    public static void MostrarAEstante() {
        for (Item i : e.getItens()) {
            //System.out.println("[+" + e.getItens() + "+]");
            System.out.print("Título: ");
            System.out.println(i.getTitulo());
            System.out.print("Gênero: ");
            System.out.println(i.getGenero());
            System.out.print("Valor R$: ");
            System.out.println(i.getValor());
            in.nextLine();
            if (i instanceof DVD) {
                System.out.print("Ano de lançamento: ");
                System.out.println(((DVD) i).getAnoLancamento());
                System.out.print("Diretor: ");
                System.out.println(((DVD) i).getDiretor());
                System.out.print("Duração: ");
                System.out.println(((DVD) i).getDuracao());
            }
            if (i instanceof Livro) {
                System.out.print("Autor: ");
                System.out.println(((Livro) i).getAutor());
                System.out.print("Quantidade de página: ");
                System.out.println(((Livro) i).getQtdePaginas());
                System.out.print("Edição: ");
                System.out.println(((Livro) i).getEdicao());
            }
        }
    }
}



