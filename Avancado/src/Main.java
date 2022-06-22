import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Exe04();
    }

    public static void exe01() {
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
        // Integer i = 9;
        // i.toString();

    }

    public static void exe02() {
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        arr.add(new ArrayList());
//        arr.add(new ArrayList());
//        arr.add(new ArrayList()); //Matriz n por n. SÓ CURIOSIDADE
//        arr.get(0).get(1);

        //pedir para o usuário informar números inteiros até que seja informado 0
        //Quando informado 0, mostrar os valores que o usuário digitou
        //Mostrar a soma dos números pares e dos números ímpares informados
        // mostrar a média de todos os valores informados

        ArrayList<Integer> inteiros = new ArrayList<>();
        int npar = 0;
        int nimpar = 0;
        double somatotal = 0.0;
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                npar += escolha;
            } else {
                nimpar += escolha;
            }
            somatotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + inteiros);
        System.out.println("Soma dos números pares: " + npar);
        System.out.println("Soma dos números impares: " + nimpar);
        System.out.println("Média: " + (somatotal / inteiros.size()));

    }

    public static void exe03() {
//1- ler o input do usuário ()String até que seja informado SAIR
        //2- Pedir para o usuário um valor inteiro > 0
        //3- Remover da lista as palavras que tenham a quantidade de caracteres menor que o n informado
        //4- Mostrar a lista de palavras
        ArrayList<String> palavras = new ArrayList<>();
        String escolha;
        while (true) {
            System.out.print("Informe uma palavra ou 'sair' para parar: ");
            escolha = in.nextLine().toLowerCase();
            if (escolha.equalsIgnoreCase("SAIR")) {
                break;
            }
            palavras.add(escolha);
        }
        System.out.print("Informe um valor inteiro: ");
        int tamanho = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < tamanho) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Palavras que tenham mais caracteres que o nº informado"+palavras);
        }

        public static void Exe04() {

        }


    }


