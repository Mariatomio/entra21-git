import javax.swing.*;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras você deseja informar?");
        int palavras = in.nextInt();
        String[] palavra = new String[palavras];
        for (int i = 0; i < palavras; i++) {
            System.out.print("informe as palavras");
            palavra[i] = in.next();
        }
        String palavrafinal = "";
        for (int i = 0; i < palavra.length; i ++) {
            if (i == 0) {
                palavrafinal += palavra[i];
            }else{
                palavrafinal +=", "+ palavra[i];
            }
        }
        System.out.println(palavrafinal);
    }
}
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras você deseja informar?");
        int palavras = in.nextInt();
        System.out.println("informe as palavras");
        String[] nn = new String[palavras];
        for (int plv = 0; plv <= palavras; plv++){
        String qual = in.nextLine();}
        for (qual){
            System.out.println([palavras]);
            break;
        }

//2 for

    }
} */
