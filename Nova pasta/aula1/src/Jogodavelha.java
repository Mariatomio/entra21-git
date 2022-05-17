import java.util.Scanner;

public class Jogodavelha {
    public static void main(String[] args) {

    }

    public static void JOGODAVELHA() {
        String jogador1 = "O";
        String jogador2 = "X";
        int CONTROLE = 0;
        Scanner in = new Scanner(System.in);
        boolean posicao = true;
        int linha = 0;
        int coluna = 0;
        while (posicao) {
            System.out.println("Escolha um n de 1 até 9: ");
            int posicao1 = in.nextInt();
            switch (posicao1) {
                case 1 -> {
                    linha = 0;
                    coluna = 0;
                }
                case 2 -> {
                    linha = 0;
                    coluna = 1;
                }
                case 3 -> {
                    linha = 0;
                    coluna = 2;
                }
                case 4 -> {
                    linha = 1;
                    coluna = 0;
                }
                case 5 -> {
                    linha = 1;
                    coluna = 1;
                }
                case 6 -> {
                    linha = 1;
                    coluna = 2;
                }
                case 7 -> {
                    linha = 2;
                    coluna = 0;
                }
                case 8 -> {
                    linha = 2;
                    coluna = 1;
                }
                case 9 -> {
                    linha = 2;
                    coluna = 2;
                }
            }
        }
    }



        public static void mostrar() {
            String[][] mapa = {{"1", "2", "3",}, {"4", "5", "6",}, {"7", "8", "9",}};
            for (int li = 0; li < 3; li++){
                for (int co = 0; co < 3; co++){
                    System.out.printf("  " + mapa[li][co]);
                }
                System.out.println("\n");
            }
        }
    }





