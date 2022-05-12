import java.util.Scanner;

public class TICTACTOE {
    String[][] mapa = {{"|1", "2", "3|"}, {"|4", "5", "6|"}, {"|7", "8", "9|"}};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jogadas = 0;
        int validas = 0;
        JV jogo = new JV();
        String posições;
        while (true) { //--------------------------------------------------------------
            System.out.println(":: JOGO DA VELHA ::");
            jogo.Mostrar();

            do {//jogador1..............................................
                System.out.println("Informe um posição, Jogador 1: ");
                posições = in.next();
                while (!jogo.Valido(posições)) {
                    System.err.println("Jogada inválida," +
                            " Tente novamente");
                    System.out.println("Informe um posição, Jogador 1: ");
                    posições = in.next();
                    validas = 0;
                }
                jogo.Jogada(posições, "O");
                validas = 1;

            }
            while (validas == 0);//fim jogador1......................
            jogadas++;
            validas = 0;
            jogo.Mostrar();
            if (!jogo.Ganhou(jogadas).equals("null")) {
                break;
            }
            do {//jogador2..............................................
                System.out.println("Informe um posição, Jogador 2: ");
                posições = in.next();
                while (!jogo.Valido(posições)) {
                    System.err.println("Jogada inválida," +
                            " Tente novamente");
                    System.out.println("Informe um posição, Jogador 2: ");
                    posições = in.next();
                    validas = 0;
                }
                jogo.Jogada(posições, "X");
                validas = 1;
            }
            while (validas == 0);//fim jogador 2--------------------------------------------------------------------------
            jogadas++;
            validas = 0;
            jogo.Mostrar();
            if (!jogo.Ganhou(jogadas).equals("null")) {
                break;
            }
        }
        System.out.println("O " + jogo.Ganhou(jogadas)+ " venceu!");
    }
}

    /*public String Mostrar() {
        for (int li = 0; li < 3; li++) {
            for (int co = 0; co < 3; co++) {
                System.out.printf("   " + mapa[li][co]);
            }

            System.out.println("\n");
        }
        return null;
    }

    //------------------------------------------------------------
    public boolean Valido(String p) {
        for (int li = 0; li < 3; li++) {
            for (int co = 0; co < 3; co++) {
                if (mapa[li][co].equals(p))
                    return true;
            }
        }
        return false;
    }//-------------------------------------------------------------

    public void Jogada(String p, String Jogador) {
        if (p.equals("1"))
            mapa[0][0] = Jogador;
        else if (p.equals("2"))
            mapa[0][1] = Jogador;
        else if (p.equals("3"))
            mapa[0][2] = Jogador;
        else if (p.equals("4"))
            mapa[1][0] = Jogador;
        else if (p.equals("5"))
            mapa[1][1] = Jogador;
        else if (p.equals("6"))
            mapa[1][2] = Jogador;
        else if (p.equals("7"))
            mapa[2][0] = Jogador;
        else if (p.equals("8"))
            mapa[2][1] = Jogador;
        else if (p.equals("9"))
            mapa[2][2] = Jogador;
    }//------------------------------------------------

    public String Ganhou(int jogadas) {
        String[] G = new String[8];
        String vencedor = "null";
        if (jogadas == 9) {
            vencedor = "Empate!";
        } //vencer linha
        G[0] = mapa[0][0] + mapa[0][1] + mapa[0][2];
        G[1] = mapa[1][0] + mapa[1][1] + mapa[1][2];
        G[2] = mapa[0][0] + mapa[0][1] + mapa[0][2];
        //vencer coluna
        G[3] = mapa[0][0] + mapa[1][0] + mapa[2][0];
        G[4] = mapa[0][1] + mapa[1][1] + mapa[2][1];
        G[5] = mapa[0][2] + mapa[1][2] + mapa[2][2];
        //vencer diagonal
        G[6] = mapa[0][0] + mapa[1][1] + mapa[2][2];
        G[7] = mapa[0][2] + mapa[1][1] + mapa[2][0];
        for (int i = 0; i < G.length; i++) {
            if (G[i].equals("OOO")) {
                vencedor = "Jogador 1";
            } else if (G[i].equals("XXX")) {
                vencedor = "Jogador 2";
            }
        }
        return vencedor; */
    /*00; 01; 02;
     10; 11; 12
     20; 21; 22*/
