import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        //Entrada
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor = (in.nextInt());

        //Processamento
        if (valor > 10){
            System.out.println("É maior que 10!");
        } else {
            //Saída
            System.out.println("Não é maior do que 10!");
        }
    }

// exercicios que perdi de matrix
    //isso é o que eu fiz mas ta errado
public static void matriz() {
    Scanner in = new Scanner(System.in);
    System.out.println("Quantas palavras você deseja informar?");
    int palavras = in.nextInt();
    String[] palavra = new String[palavras];
    for (int plv = 0; plv < palavras; plv++);{
    System.out.println("Informe as palavras");
    palavra[palavras] = in.next();
}
 for (String palavr : palavra) {
     System.out.println(palavr + " , ");
 }
}
}