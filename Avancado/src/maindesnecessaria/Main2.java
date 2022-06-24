package maindesnecessaria;

import java.util.*;
public class Main2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //nome do produto é a chave e o valor é p numero
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;
 /*       produtos.put("Maça ", 1.6);
        produtos.put("Banana ", 0.4);
        produtos.put("abacate ", 1.5);
        System.out.println(produtos);*/
/*       for (String key: produtos.keySet()){ PROCURAR A POSIÇÃO
           System.out.println(key + produtos.get(key));*/
        while (executa) {
            System.out.println("Menu: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - Mostar lista de produtos");
            System.out.println("4 - Remover item");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                executa = false; break;
                case 1:
                    System.out.print("Informe o nome do produto: ");
                    String nome = in.nextLine().toLowerCase();
                    if (produtos.containsKey(nome)) {
                        System.out.println("Produto já existente, deseja atualizar o valor (S/N)");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.print("Informe o valor: ");
                    Double valor = in.nextDouble();
                    in.nextLine();
                    produtos.put(nome, valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        System.out.print("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                        } else {
                            System.err.println("Produto '" + busca + "' não encontrado");
                        }
                    }
                    break;
                case 3 :  System.out.println(produtos);
                System.out.println("Desejas continuar (S/N)");
if (in.nextLine().equalsIgnoreCase("N")) {
    executa = false; break;
}
                    break;
                case 4 :
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    } else {
                        System.out.print("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                            System.out.println(busca + " : " + produtos.get(busca));
                        } else {
                            System.err.println("Produto '" + busca + "' não encontrado");
                        }
                    }

                    break;
                default: System.err.println("INFORME UMA OPÇÃO VÁLIDA!");
                    break;
            }
        }

    }
}






