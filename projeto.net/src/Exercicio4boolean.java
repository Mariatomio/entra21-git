import java.util.Scanner;

public class Exercicio4boolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber?");
        int valor = in.nextInt();
        while (valor != 0) {
            for (int tabuada = 0; tabuada <= 10; tabuada++) {
                System.out.println(tabuada * valor);
            }
            System.out.println("Digite um número");
            valor = in.nextInt();
        }
    }
}
