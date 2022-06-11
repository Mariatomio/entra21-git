import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        exe04();
    }

    public static void exe1() {
        //level1
        Scanner in = new Scanner(System.in);
        double comp, alt;
        System.out.println("Digite o comprimento");
        comp = in.nextDouble();
        System.out.println("Digite a altura");
        alt = in.nextDouble();
        if (comp == alt) {
            System.out.println("Quadrado");
        } else {
            System.out.println("Retângulo");
        }
    }


    public static void exe2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int v1 = in.nextInt();
        System.out.println("Digite um número inteiro, diferente do primeiro");
        int v2 = in.nextInt();
        if (v1 > v2) {
            System.out.println("nº " + v1 + " é maior");
        } else {
            System.out.println("nº " + v2 + " é maior");
        }
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de peças que você vai comprar");
        int pecas = in.nextInt();
        // se for superior a 1000 o gasto, a loja da desconto de 10%, 1 peça vale 100
        if ((pecas * 100) > 1000){
            System.out.println("Você ganha um desconto de 10% e o seu custo total vai ser R$" +
                    (pecas*100 - (0.1 *(pecas * 100))));
        } else
            System.out.println("sem desconto e você vai pagar R$ "+ (pecas * 100));
    }

    public static void exe04() {

    }
}