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





