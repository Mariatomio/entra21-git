package exerciciotreinarALcarro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainCarro {
    public static Scanner in = new Scanner(System.in);
  /*  List<Object> list = new ArrayList<>();
    Map<Integer, List<Object>> map = new HashMap<>();
map.put(1,list);*/

    public static void main(String[] args) {
        HashMap<String, ArrayList<Carroexercicio>> produtos = new HashMap<>();
        ArrayList valores = new ArrayList<>();
        boolean executar = true;
        while (executar) {
            System.out.println();
            System.out.println("---------------  Menu:  ---------------");
            System.out.println("1 - Ver a lista de carros disponiveis:");
            System.out.println("2 - Add carro a lista de venda:");
            System.out.println("3 - Vender carro:");
            System.out.println("0 - Sair:");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 1:
                    if (produtos.isEmpty()){
                        System.err.println("Não há carros disponiveis");
                        break;
                    }else {
                        System.out.print("Carros disponiveis: ");
                        System.out.println(produtos);
                        System.out.println("----------------------------------------");
                        break;
                    }
                case 2:
                    System.out.print("Informe a marca do carro: ");
                    String marca = in.nextLine().toLowerCase();
                    System.out.print("Informe o modelo do carro: ");
                    String modelo = in.nextLine();

                    Carroexercicio c = new Carroexercicio();
                    c.setModelo(modelo);
                    if (produtos.containsKey(marca)){
                        produtos.get(marca).add(c);
                    } else {
                        produtos.put(marca, c.getModelo());
                    }
                    System.out.println("Carro adicionado a lista de venda!");
                    break;









                case 3:
                    if (produtos.isEmpty()) {
                    System.err.println("Não há carros registrados");
                } else {
                        System.out.print("Informe o carro que desejas vender: ");
                        String remove = in.nextLine();
                        if (produtos.containsKey(remove)) {
                            produtos.remove(remove);
                            System.out.println("Carro '" + remove + "' vendido");
                        }
                    }
                    break;
                case 0 :
                    executar = false; break;
                default:
                    System.out.println("Escolha uma opção válida!"); break;


            }
        }


    }
}
