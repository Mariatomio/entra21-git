import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTERMO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma palavra de 5 letras");
        String primeirapalavra = in.nextLine().toUpperCase();
        char[] acertos = new char[primeirapalavra.length()];
        for (int i = 0; i < primeirapalavra.length(); i++) {
            acertos[i] = 0;
        }
        //limpa o console
        for (int i = 0; i < 50; i++) {
            System.out.print("\n");
        }
//Declarar variáveis
        int tentativas = 5;
        String palavrausuario;
        String letraDigitada = " ";

//Quantidade de , por letra
        String[] mapa = {"  ", " ", " ", " ", ""};


        boolean acertou = false;
        while (!acertou && tentativas > 0) {

            System.out.print("-> Informe uma palavra: ");
            palavrausuario = in.next().toUpperCase();
            letraDigitada += " " + palavrausuario;

            //Controlador de vida
            boolean vida = true;
            for (int i = 0; i < acertos.length; i++) {
                if (palavrausuario.equals(primeirapalavra.charAt(i))) { // Executa se acertar a letra
                    acertos[i] = 1;
                    vida = false;
                }
            }

            boolean tentativa = true;
            while (tentativa) {
                if (vida) {// Executa se errar a letra
                    for (int i = 0; i < 6; i++) {
                        System.out.println("Informe uma palavra: ");
                        palavrausuario = in.next().toUpperCase();
                        letraDigitada += " " + palavrausuario;

                        if (palavrausuario.equals(primeirapalavra)) {
                            System.out.println("Você acertou a palavra");
                            break;
                        } else {
                            if (palavrausuario.charAt(i) == primeirapalavra.charAt(i)) {
                                System.out.println("Mostrar letra igual: " + palavrausuario.charAt(i) + palavrausuario.charAt(i)
                                        + palavrausuario.charAt(i) + palavrausuario.charAt(i) + palavrausuario.charAt(i));
                            } System.out.println("Palavra incorreta, Tente novamente: ");
                            System.out.println("Informe uma palavra: ");
                            palavrausuario = in.next().toUpperCase();
                            letraDigitada += " " + palavrausuario;
                            tentativas--;
                        }
                    }






                    }
                }
            }



        }
    }
