import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.source.tree.NewArrayTree;
import jdk.swing.interop.SwingInterOpUtils;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Avantutor {
    public static void exercicio6() {
        /*You have to design the code such that the user has only three tries to guess the correct pin of the account.
        You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.
        ” When incorrect display “Incorrect, try again.”.
         When ran out of tries display “Sorry but you have been locked out.”
         */
        Scanner in = new Scanner(System.in);
        int codeusuario2 = 0;
        String code = "91352";

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o PIN");
            String codeusuario = in.nextLine();
            if (codeusuario.equalsIgnoreCase(code)) {
                System.out.println("Bem vindo");
                break;
            } else {
                System.out.println("Login incorreto. Tente novamente: ");
                codeusuario2++;
            }
            if (codeusuario2 == 3) {
                System.out.println("Você foi bloqueado");             //tem coisa para arrumar
                //CHECAR NOVAMENTE
            }
        }
    }

    public static void codednvcomwhile() {
        Scanner in = new Scanner(System.in);
        //boolean codeusuario = true;
        int tentativa = 0;
        int max = 3;
        String code = "91352";
        int a = 0;
        while (tentativa <= max) {
            System.out.println("Digite o PIN: ");
            String codeusuario1 = in.nextLine();
            if (codeusuario1.equalsIgnoreCase(code)) {
                System.out.println("Bem vindo!");
                break;
            } else {
                System.err.println("Tente novamente");
                tentativa++;
            }
            if (tentativa == max) {
                System.err.println("Você foi bloqueado");
                //codeusuario = false;
                break;
            }
        }
    }

    public static void exegeovanneavantutor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura:");
        int altura = sc.nextInt();
        System.out.println("Largura:");
        int largura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("#");
                if (j == largura - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void exegeovanne2avantutor() {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Escreva um número para calcular fatorial:");
        int num = sc.nextInt();
        for (int i = num - 1; i > 0; i--) {
            res = num * i;
            num = res;
        }
        System.out.println("O fatorial é: " + res);
    }

    public static void fatorialdenumeromeu() {
        //for, um next int e uma saida, isso é o que vai usar
        Scanner in = new Scanner(System.in);
        int multi = 0;
        System.out.println("Escolha um nº para fatorial");
        int fatorial = in.nextInt();
        for (int i = fatorial - 1; i > 0; i--) { //i-- é para decrementar
            multi = fatorial * i;
            fatorial = multi; // POR QUE USOU ISSO?! // pegar ft pq o lucas fez diferente
        }
        System.out.println("O nº fatorial é " + multi);
    }

    public static void avantutorexercicio5() {
/*Suponha que tenhamos um banco de dados composto por dois campos ou colunas (arrays), o primeiro campo é para o nome de usuário (usuário[]) e o outro é para a senha(passe[]) .
É assim que parece:
usuário[0] = "Hassan" ; usuário[1] ="Idris"; usuário[2]="Trevor" ;
E suas senhas correspondem aos seus índices.
passar[0] = "homecomingking"; passar[1] = "turnupcharlie"; passar[2] = "afraidofthedark";
Então, se um deles fez login com sucesso, a saída deve ser:
Digite nome de usuário: Hassan
Digite senha: homecomingking
Olá Hassan!
Mas se não, "Login incorreto!"
Você pode ignorar o caso para o nome de usuário, mas não para a senha.*/
        Scanner in = new Scanner(System.in);
        String[] usuario = {"Hassan", "Idris", "Trevor"};
        String[] senha = {"Senha1", "Senha2", "Senha3"};
        for (int i = 0; i < usuario.length; i++) {
            System.out.println("Informe seu nome de usuário: ");
            String usuario1 = in.nextLine();
            ;
            System.out.println("Informe sua senha: ");
            in.next();
            String senha1 = in.nextLine();
            if (usuario1.equalsIgnoreCase(usuario[i]) && senha1.equals(senha[i])) {
                System.out.println("Seu login é: " + usuario1 +
                        "Sua senha é: " + senha1);
                break;
            } else {
                System.out.println("Login incorreto");
                System.out.println("Senha incorreta");
            }
        }
        System.out.println("Digite seu nome de usuário: ");
        String nome = in.nextLine();
        System.out.println("Digite sua senha: "); //checar
    }

    public static void JOGODAVELHA() {
        String jogador1 = "O";
        String jogador2 = "X";
        //int CONTROLE = 0;
        Scanner in = new Scanner(System.in);
        boolean posicao = true;
        int linha = 0;
        int coluna = 0;
        while (posicao) {
            System.out.println("Escolha um n de 1 até 9: ");
            int posicao1 = in.nextInt();
            switch (posicao1) {
                case 1:
                    linha = 0;
                    coluna = 0;
                    break;
                case 2:
                    linha = 0;
                    coluna = 1;
                    break;
                case 3:
                    linha = 0;
                    coluna = 2;
                    break;
                case 4:
                    linha = 1;
                    coluna = 0;
                    break;
                case 5:
                    linha = 1;
                    coluna = 1;
                    break;
                case 6:
                    linha = 1;
                    coluna = 2;
                    break;
                case 7:
                    linha = 2;
                    coluna = 0;
                    break;
                case 8:
                    linha = 2;
                    coluna = 1;
                    break;
                case 9:
                    linha = 2;
                    coluna = 2;
                    break;

            }

        }
    }
/* String G;
    public String ganhou(int jogadas) {
 String() G= new String(0){}
        return null;
    } */
        String[][] mapa = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

    public String[][] getMapa() {
        return mapa;
    }

    public boolean valido(String p){
            for (int li = 0; li < 3; li++){
                for (int co = 0; co < 3; co++){
                    if (mapa[li][co].equals(p))
                        return true;
                }
            } return false;
      //if ()
    }
            public static void main (String[]args){
        JOGODAVELHA();
 /*System.out.println("Escolher 'O' ou 'X'");
        System.out.println("jogador 1: ");
        String jogador1 = in.nextLine();
        in.next();
        System.out.println("jogador 2: ");
        String jogador2 = in.nextLine();*/
            }

    public static void exercicotestedpsjogodavelha() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        System.out.println("Escolha um nº: ");
        int n = in.nextInt();
        for (int i = n; i > 0; i--){
            soma += i;

        }
        System.out.println("A soma de todos os nº antecessores a esse é " + soma);
    }  /* //for, um next int e uma saida, isso é o que vai usar
    Scanner in = new Scanner(System.in);
    int multi = 0;
        System.out.println("Escolha um nº para fatorial");
    int fatorial = in.nextInt();
        for (int i = fatorial - 1; i > 0; i--){ //i-- é para decrementar
        multi = fatorial * i;
        fatorial = multi; // POR QUE USOU ISSO?! // pegar ft pq o lucas fez diferente
    }
        System.out.println("O nº fatorial é " + multi); */
        }
