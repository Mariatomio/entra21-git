import java.util.Arrays;
import java.util.Scanner;

public class ExercicioLucas1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome e sobrenome: ");
        String nome = in.nextLine().toUpperCase();
        System.out.println();
        String[] nomes  = nome.split(" ");
        System.out.println("A abreviação do seu nome é: " + nomes[0].charAt(0) + ". " + nomes[1].charAt(0) + ".");
    }

    public static void exercicio2foto() {

    }
}
