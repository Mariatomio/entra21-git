package Assento;

import java.util.Scanner;

public class MainAssento {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Informe a quantidade de linhas");
        Aviao aviao = new Aviao(20,20);
        System.out.println("Escolha uma classe: ");
            aviao.mostrarAssentos();



       // System.out.println("Informe a quantidade de linhas");
      // Onibus o = new Onibus(in.nextInt());


        //o.mostrarAssentos();
    }
}
