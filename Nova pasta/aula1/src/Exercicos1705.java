import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class Exercicos1705 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        //Escrever algo se está vazio, tamanho dele, maiusculo e minusculo
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("lenght: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty()); //CHECAR SE ESTÁ VAZIA
        System.out.println("toUpperCase: " + algo.toUpperCase());
        System.out.println("toLowerCase: " + algo.toLowerCase());
    }

    public static void exe02() {
        //Escreva um programa que leia 2 strings e checa se são iguais e se são iguaias ignorando os casos
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Digite alguma coisa: ");
        String algumaoutracoisa = in.nextLine();
        if (algo.equals(algumaoutracoisa)) {
            System.out.println("São iguais");
        } else if (algo.equalsIgnoreCase(algumaoutracoisa)) {
            System.out.println("Ainda são iguais, desconsiderando maiusculo e minusculo");
        } else {
            System.out.println("Não são iguais");
        }
    }

    public static void exe03() {
        //Escreva um programa que mostre se a primeira string faz parte/está na outra
        System.out.println("Escreva algo: ");
        String algo = in.nextLine();
        System.out.println("Escreva algo: ");
        String outroalgo = in.nextLine();
        if (algo.contains(outroalgo)) {
            System.out.println("Uma faz parte da outra");
        } else if (outroalgo.contains(algo)) {
            System.out.println("Uma faz parte da outra");
        } else {
            System.out.println("Não faz parte da outra");
        }
    }

    public static void exe04() {
        //Escreva um programa que mostre se na primeira string, tem uma palava que é o prefixo da outra
        System.out.println("Escreva algo: ");
        String algo = in.nextLine();
        System.out.println("Escreva algo: ");
        String outroalgo = in.nextLine();
        if (algo.startsWith(outroalgo)) {
            System.out.println("A primeira palavra/frase é o prefixo da outra");
        } else if (outroalgo.startsWith(algo)) {
            System.out.println("A segunda palavra/frase é o prefixo da outra");
        } else {
            System.out.println("A primeira palavra/frase ou a segunda não é o prefixo da outra");
        }
    }

    public static void exe05() {
        //Escreva um programa que mostre se na primeira string, tem uma palava que é o sufixo da outra
        System.out.println("Escreva algo: ");
        String algo = in.nextLine();
        System.out.println("Escreva algo: ");
        String outroalgo = in.nextLine();
        if (algo.endsWith(outroalgo)) {
            System.out.println("A primeira palavra/frase é o sufixo da outra");
        } else if (outroalgo.endsWith(algo)) {
            System.out.println("A segunda palavra/frase é o sufixo da outra");
        } else {
            System.out.println("A primeira ou segunda palavra/frase não é o sufixo da outra");
        }
    }

    public static void exe06() {
        //write a program that prints the index and the character for a given word
        System.out.println("Escreva algo: ");
        String algo = in.nextLine();
        System.out.println("Escreva algo: ");
        String letra = in.nextLine();
        int posicao = algo.indexOf(letra);
        System.out.println("A posição de "+ letra+ " em "+ algo + " é " + posicao);

//     for (int i = 0; i < algo.length(); i++){
//         System.out.println("A posição do caractere "+ algo.charAt(i) + " é " + " = " + i);
        // esse checa a posição de tudo
     }

    public static void exe07() {
//Use a program that replace method to decipher this string
        //lala#lwve#-rwgra22lalang!#<3
        /*
        | code | letter |
        | w | o |
        | # | ' ' (space)|
        | 2 | m |
        | lala | i |
        | - | p | */
        //usar replace, dois parametros uma o que quer substituir e uma o que vaiser inserido
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    public static void exe08() {
        //write a program that reads a sset of integers,
        //and then prints the sum of even and odd integers
        System.out.println("Informe a quantidade de números: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < nums; i++){
            System.out.println("Informe um número: ");
            numeros[i] = in.nextInt();
        }
        int somapar = 0, somaimpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0){
                somapar += valor;
            } else {
                somaimpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: "+ somapar);
        System.out.println("Soma dos valores ímpares: "+ somaimpar);
    }

    public static void exe09() {
        /*1- let the user choose how many words they want to input
        2- read that many words
        3- let the user choose a number bigger than 0
        4- remove all words from the array that are shorter than the given number */
        System.out.println("Informe a quantidade de palavras: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();
        for (int i = 0; i < nums; i++){
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe um número > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++){
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);

            }
        }
    }

    public static void exe10() {
        /* Take two lists as input and return a new list with
        all values of the first list that are not in the second list */
        System.out.println("Informe a quantidade de números da 1º lista: ");
        int quantidade1 = in.nextInt();
        int numeros[] = new int[quantidade1];
        for (int i = 0; i < quantidade1; i++) {
            System.out.println("Informe um número, 1 lista: ");
            numeros[i] = in.nextInt();//Array.asList(palavras)
        }
        System.out.println("Informe a quantidade de números da 2º lista: ");
        int quantidade2 = in.nextInt();
        int numeros2[] = new int[quantidade2];
        for (int i = 0; i < quantidade2; i++) {
            System.out.println("Informe um número, 2º lista: ");
            numeros2[i] = in.nextInt();
        }
        for (int valor1 : numeros) {
            boolean achou = false;
            for (int valor2 : numeros2) {
                if (valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println("Valor não encontrado na lista 2: "+valor1+ " ");
            }
        }
    }




//            for (int i = 0; i < numeros.length; i++) {
//               // System.out.print(valor1+ " ");
//                for (int j = 0; j < numeros2.length; j++) {
//                    // System.out.print(valor1+ " ");
//                    if (numeros[i] != numeros2[j]){
//                        System.out.print(numeros[i]+ " ");
//                    }
//                }
//                System.out.print(numeros[i]+ " ");
//            }
              //  if (numeros.length == numeros2.length){


        }



