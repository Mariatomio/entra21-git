/*import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
    /*    Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int escolha = r.nextInt(3); //3 pq ele é exclusivo, até o 2, mas não pega o 3. 0,1,2
            switch (escolha) {
                case 0 -> System.out.println("Pedra"); break;
                case 1 -> System.out.println("Papel");break;
                case 2 -> System.out.println("Tesoura"); break;

                default -> System.out.println("Inválido");
            }
        }
    }BASE----------------------------------------------*/
 /*   }

    public static boolean ppt() {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        int pontuacaoJ1 = 0;
        int pontuacaoJ2 = 0;
        while (pontuacaoJ1 < 10 && pontuacaoJ2 < 10) {
            //usuário
            int escolhaUsuário = -1;
            while (escolhaValida(escolhaUsuário)) { //NÃO PRECISA FAZER COMPARAÇÃO DE BOOLEANO EX: == TRUE E == FALSE
                System.out.println("Escolha (0) Pedra, (1) Papeç ou (2) Tesoura: ");
                escolhaUsuário = in.nextInt();
                if (!escolhaValida(escolhaUsuário)) {
                    System.out.println("Escolha inválida");
                }
            }
            String escolhaeusuarioString = es


            switch (escolha) {
                case 0:
                    return "pedra";
                case 1:
                    return "Papel";
                case 2:
                    return "Tesoura";
                default:
                    return "Escolha inválida";


//SEGURAR CTRL E MOSTRAR O MÉTODO LEVA A LINHA QUE CITA ELE

//RETURN NO SWITCH NN PRECISA DE BREAK

                /*public static boolean escolhaValida ( int escolha = 0){ //fora da main original
                    return escolha > -1 && escolha < 3;  //economiza espaço e não precisa usar o if e else

// PEGAR CÓDIGO DE ALGUÉM QUE COPIOU DA PROJEÇÃO

  */
