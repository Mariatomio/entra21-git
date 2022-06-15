import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.util.Arrays;
<<<<<<< HEAD
import java.util.IllegalFormatCodePointException;
=======
>>>>>>> a95c1ecbd4a618e2c7c090383395c65b472fb09c
import java.util.Scanner;

import static classes.guardados.Estante.*;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Estante e = new Estante(5);
    int contador = 0;

    public static void main(String[] args) {
        boolean loop = true;
<<<<<<< HEAD
        while (loop) {
            for (int i = 0; i < 5; i++) {
                System.out.println("----- Escolha uma opção: ----- ");
                System.out.println("(1) - Adicionar item: ");
                System.out.println("(2) - Buscar e tratar retorno");
                System.out.println("    - Avaliar");
                System.out.println("    - Ver avaliações");
                System.out.println("(3) - Remover");
                System.out.println("(4) - Mostrar itens na estante");
                System.out.println("(0) - Sair");
                System.out.println("------------------------------");
                int escolha = in.nextInt();
=======
>>>>>>> a95c1ecbd4a618e2c7c090383395c65b472fb09c

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
            while (loop) {
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
                        loop = false;
                        System.err.println("Escolha uma opção válida!");
                }
                if (escolha == 0) {
<<<<<<< HEAD
                    System.out.print("Obrigada, volte sempre!");
                    break;
                }
=======
                    loop = false;
                    break;
                }

>>>>>>> a95c1ecbd4a618e2c7c090383395c65b472fb09c
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
<<<<<<< HEAD
                if (escolha == 3) {
                    System.out.println("Estante atualizada!");
                    System.out.println("----------------------");
                    MostrarAEstante();
=======
                    }
            if (escolha == 4) {
                System.out.println("Deseja retornar ao menu? (S/N)");
                if (in.nextLine().equalsIgnoreCase("S")){
                    break;
>>>>>>> a95c1ecbd4a618e2c7c090383395c65b472fb09c
                }
            }

        }
    }

    public static void adicionaraItem(Estante e) {
        if (e.estanteCheia()) {
            System.err.println("Sua estante está cheia! Não é possível adicionar mais itens");
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
                in.nextLine();
            }
            if (!e.adicionarItem(i)) {
                System.err.println("Não foi possível adicionar item a estante");
            } else {
                System.out.println("Item adicionado com sucesso!");
<<<<<<< HEAD
=======
                System.out.println();
>>>>>>> a95c1ecbd4a618e2c7c090383395c65b472fb09c
            }
        }
    }

    public static void BuscarETratarretorno() {
        System.out.print("Informe o título da obra: ");
        String titulo = in.next();
        in.nextLine();
        int contador = 0;
<<<<<<< HEAD
        for (Item i : e.getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("------------------------");
                System.out.println("Posição na estante: " +contador);
                System.out.println("Título: " + i.getTitulo());
                System.out.println("Gênero: " + i.getGenero());
                System.out.println("Valor: R$" + i.getValor());
                if (i instanceof DVD) {
                    System.out.print("Ano de lançamento: ");
                    System.out.println(((DVD) i).getAnoLancamento());
                    System.out.print("Diretor: ");
                    System.out.println(((DVD) i).getDiretor());
                    System.out.print("Duração: ");
                    System.out.println(((DVD) i).getDuracao());
                } else if (i instanceof Livro) {
                    System.out.print("Autor: ");
                    System.out.println(((Livro) i).getAutor());
                    System.out.print("Ano de publicação: ");
                    System.out.println(((Livro) i).getAnoPublicacao());
                    System.out.print("Quantidade de Páginas: ");
                    System.out.println(((Livro) i).getQtdePaginas());
                    System.out.print("Edição: ");
                    System.out.println(((Livro) i).getEdicao());
                }
                System.out.println("------------------------");
                System.out.println("(1) Avaliar '" + i.getTitulo() + "'");
                System.out.println("(2) Ver as avaliações de '" + i.getTitulo() + "'");
                System.out.println("(3) Voltar ao menu");
                System.out.print("Escolha: ");
                int escolha = in.nextInt();
                in.nextLine();
                if (escolha == 1) {
                    i.avaliar();
                    break;
                } else if (escolha == 2) {
                    i.getAvaliacoes();

                    break;
                } else {
                    break;
                }
            }
            contador++;
        }
        if(contador==5){
            System.err.println("Item não encontrado!");
        }
    }



    public static void Remover() {
            System.out.println("Qual a posição da obra que desejas remover: ");
            int posicaoremover = in.nextInt();
        for (int i = posicaoremover; i < getItens().length - 1; i++) {
            getItens()[i] = getItens()[i + 1];
        }
       posicaoremover--;
        }

    //----------------------------------MOSTRAR ESTANTE---------------------------------------------------------------------
    public static void MostrarAEstante() {
        int contador = -1;
        for (Item i : Estante.getItens()) {
            contador++;
            if (i == null) {
                break;
            }
            if (i instanceof DVD) {
                System.out.println("Posição na estante: {" + contador + "}");
                System.out.print("Título: ");
                System.out.println(i.getTitulo());
                System.out.print("Gênero: ");
                System.out.println(i.getGenero());
                System.out.print("Valor R$: ");
                System.out.println(i.getValor());
                System.out.print("Ano de lançamento: ");
                System.out.println(((DVD) i).getAnoLancamento());
                System.out.print("Diretor: ");
                System.out.println(((DVD) i).getDiretor());
                System.out.print("Duração: ");
                System.out.println(((DVD) i).getDuracao());
                System.out.println("----------------------------");
            }
            if (i instanceof Livro) {
                System.out.println("Posição na estante: {" + contador + "}");
                System.out.print("Título: ");
                System.out.println(i.getTitulo());
                System.out.print("Gênero: ");
                System.out.println(i.getGenero());
                System.out.print("Valor R$: ");
                System.out.println(i.getValor());
                System.out.print("Autor: ");
                System.out.println(((Livro) i).getAutor());
                System.out.print("Quantidade de página: ");
                System.out.println(((Livro) i).getQtdePaginas());
                System.out.print("Edição: ");
                System.out.println(((Livro) i).getEdicao());
                System.out.println("----------------------------");
=======
        for (Item i : Estante.getItens()) {
            contador++;
            if (i != null) {
                break;
            }
            if (!i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.err.println("TÍTULO INEXISTENTE!");
                break;
            }
            if (i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("------------------------");
                System.out.println("Posição na estante: " + contador);
                System.out.println("Título: " + i.getTitulo());
                System.out.println("Gênero: " + i.getGenero());
                System.out.println("Valor: R$" + i.getValor());
                if (i instanceof DVD) {
                    System.out.print("Ano de lançamento: ");
                    System.out.println(((DVD) i).getAnoLancamento());
                    System.out.print("Diretor: ");
                    System.out.println(((DVD) i).getDiretor());
                    System.out.print("Duração: ");
                    System.out.println(((DVD) i).getDuracao());
                } else if (i instanceof Livro) {
                    System.out.print("Autor: ");
                    System.out.println(((Livro) i).getAutor());
                    System.out.print("Ano de publicação: ");
                    System.out.println(((Livro) i).getAnoPublicacao());
                    System.out.print("Quantidade de Páginas: ");
                    System.out.println(((Livro) i).getQtdePaginas());
                    System.out.print("Edição: ");
                    System.out.println(((Livro) i).getEdicao());
                }
                System.out.println("Você gostaria de" +
                        " (1) Avaliar " + i.getTitulo() +
                        " (2) Ver avaliação " + i.getTitulo() +
                        " (3) Menu: ");
                System.out.print("Escolha: ");
                int escolhaavaliacao = in.nextInt();
                if (escolhaavaliacao == 1) {
                    i.avaliar();
                    System.out.println("Desejas avaliar novamente? (S/N)");
                    if (in.nextLine().equalsIgnoreCase("N")) {
                        break;
                    }
                } else if (escolhaavaliacao == 2) {
                    Avaliacao avaliacao = new Avaliacao();
                    System.out.println((Arrays.toString(i.getAvaliacoes())));
                    System.out.println(avaliacao.getRating());
                    System.out.println(avaliacao.getFeedback());
                    System.out.println(i.getTotalRating());
                    break;
                } else {
                    break;
                }
>>>>>>> a95c1ecbd4a618e2c7c090383395c65b472fb09c
            }
        }
    }



    public static void Remover() {
        for (int i = 0; i < e.getCapMaxima(); i++) {
            System.out.println("Qual o título da obra que desejas remover: ");
            String titulo = in.nextLine().toLowerCase();
            if (Estante.getItens()[i] != null){
                break;
            }
            if (Estante.getItens()[i].getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                continue;
            }else {
                System.out.println("Obra inexistente");
            }
            if (Estante.getItens()[i] != null && Estante.getItens()[i].getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                Estante.getItens()[i] = null;
                System.out.println("Obra removida!");
                break;
            }

            }
        }



    //----------------------------------MOSTRAR ESTANTE---------------------------------------------------------------------
    public static void MostrarAEstante() {
        int contador = 0;
        for (Item i : Estante.getItens()) {
            contador++;
            if (i == null) {
                break;
            }
                if (i instanceof DVD) {
                    System.out.println("Posição na estante: {" + contador + "}");
                    System.out.print("Título: ");
                    System.out.println(i.getTitulo());
                    System.out.print("Gênero: ");
                    System.out.println(i.getGenero());
                    System.out.print("Valor R$: ");
                    System.out.println(i.getValor());
                    System.out.print("Ano de lançamento: ");
                    System.out.println(((DVD) i).getAnoLancamento());
                    System.out.print("Diretor: ");
                    System.out.println(((DVD) i).getDiretor());
                    System.out.print("Duração: ");
                    System.out.println(((DVD) i).getDuracao());
                    System.out.println("----------------------------");
                }
                if (i instanceof Livro) {
                    System.out.println("Posição na estante: {" + contador + "}");
                    System.out.print("Título: ");
                    System.out.println(i.getTitulo());
                    System.out.print("Gênero: ");
                    System.out.println(i.getGenero());
                    System.out.print("Valor R$: ");
                    System.out.println(i.getValor());
                    System.out.print("Autor: ");
                    System.out.println(((Livro) i).getAutor());
                    System.out.print("Quantidade de página: ");
                    System.out.println(((Livro) i).getQtdePaginas());
                    System.out.print("Edição: ");
                    System.out.println(((Livro) i).getEdicao());
                    System.out.println("----------------------------");
                }
                }
            }
        }





