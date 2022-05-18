import java.util.Random;
import java.util.Scanner;

public class ExerciciousandoFOR {
    public static Scanner in = new Scanner(System.in); //todos os métodos podem acessar ele

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        System.out.println("Informe um número: ");
        String numero = String.valueOf(in.nextInt());
        //String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--) { //como quer inverter tem que ir decrementando
            // -1 PORQUE O .LENGHT PEGA +1 DO QUE ERA PARA PEGAR, ENT COLOCA MENOS 1,
            // MAIOR OU IGUAL A ZERO PARA PEGAR A POSIÇÃO 0

            // inverso = inverso + String.valueOf(numero.charAt(i)); da para fazzer assim mas nn precisa
            System.out.print(numero.charAt(i));
        }
    }

    public static void exe02() {
        /* write a program to enter the numbers till the user wants and at end
         the program should display the largest and smallest number entered */
        int maior = 0, menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (parada != 0) {
            //int paradaAnt = parada;
            System.out.println("Informe um número (0 para sair): ");
            parada = in.nextInt();
            if (primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false; //Não é mais o primeiro ciclo vai para o else
            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
            }
        }
        System.out.println("Menor número informado: " + menor);
        System.out.println("Maior número informado : " + maior);
    }

    public static void exe03() {
        Random r = new Random();
        int randomico = r.nextInt(101); // exclusivo por isso só vai até 100
        //se eu quiser definir valores tp 10 15 20 25, tem que criar um array nome.lenght e chegar de 0 até 3 nesse caso
        int chutes = 0; //quantas vezes o usuário chutou
        while (true) {
            System.out.println("Informe um nº: ");
            int valorInformado = in.nextInt();
            chutes++;
            if (valorInformado == randomico) {
                System.out.println("Acertou mizera");
                break;
            } else if (valorInformado > randomico) {
                System.out.println("Chute muito alto, tente novamente!");
            } else { //não precisa colocar o menor pq se ele não é igual e não é maior, ele só pode ser menor
                System.out.println("Chutou muito baixo, tente novamente!");
            }
        }
        System.out.println("Você tentou " + chutes + " vezes");
    }

    public static void exe04() {
        for (int li = 0; li < 4; li++) {
            for (int co = 0; co < 10; co++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println("");
        }
            System.out.println("");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i + j < 4 || j - i > 4) {
                        System.out.print(" ");
                    } else if (j > 4){
                        System.out.print(Math.abs(j -3));//abs = absoluto nn fica negativo
                    } else {
                        System.out.print(Math.abs(j-5));
                    }
                }

                System.out.println("");

            } /* *********
             *******
             *****
             ***
             *
             */
        }
    }





