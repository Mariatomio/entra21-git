import java.util.Scanner;

public class jogoForca {

    public static void main(String[] args) {
        //pega a palavra
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a palavra para o jogo: ");
        String palavraDesconhecida = ler.nextLine().toUpperCase();

        //limpa o console
        for (int i = 0; i < 100; i++) {
            System.out.print("\n");
        }

        // Controla os acertos do usuário, coloca todos caracter como 0 e se acertar vira 1.
        char[] acertos = new char[palavraDesconhecida.length()];
        for (int i = 0; i < acertos.length; i++) {
            acertos[i] = 0;
        }

        //Declaração de variaveis
        int chances = 6;
        String letraDigitada = "";
        char letra;

        // Quantidade de underlines por letra da palavra sorteada
        for (int i = 0; i < palavraDesconhecida.length(); i++) {
            System.out.print(" _ ");
        }

        // Declaração do "acertou" fora do FOR como boolean = false para poder colocar dentro do while como condição de parada
        boolean acertou = false;

        // começando o jogo
        while (!acertou && chances > 0) {

            System.out.print("-> Informe uma letra: ");
            letra = ler.next().toUpperCase().charAt(0);
            letraDigitada += " " + letra;

            // Controlador de vidas
            boolean vida = true;
            for (int i = 0; i < acertos.length; i++) {

                if (letra == palavraDesconhecida.charAt(i)) { // Executa se acertar a letra
                    acertos[i] = 1;
                    vida = false;
                }
            }
            boolean tentativa = true;
            while (tentativa) {  /*System.out.print("-> Informe uma letra: ");
                letra = ler.next().toUpperCase().charAt(0);
                letraDigitada += " " + letra; NÃO TA PERGUNTANDO ISSO TODA VEZ*/

                if (vida) {// Executa se errar a letra
                    for (int i = 0; i < 6; i--) { //MARIA: deu meio certo, conferir
                        System.out.print("-> Informe uma letra: ");
                        letra = ler.next().toUpperCase().charAt(0);
                        letraDigitada += " " + letra;
                        if (chances == 6) {
                            System.out.println(".___.");
                            System.out.println("|   |");
                            System.out.println("|___| ");
                            chances--;
                            tentativa = false; //MARIA: criou a cabeça mas nn continuou o código
                            continue;
                        } else if (chances == 5) {
                            System.out.println(".___.");
                            System.out.println("|   |");
                            System.out.println("|___| ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            chances--;
                            tentativa = false;
                            continue;
                        } else if (chances == 4) {
                            System.out.println(".___.");
                            System.out.println("|   |");
                            System.out.println("|___| ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("   \\");
                            System.out.println("    \\");
                            chances--;
                            tentativa = false;
                            continue;
                        }else if (chances == 3) {
                            System.out.println(".___.");
                            System.out.println("|   |");
                            System.out.println("|___| ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println(" / \\");
                            System.out.println("/   \\");
                            chances--;
                            tentativa = false;
                            continue;
                        }else if (chances == 2) {
                            System.out.println(".___.");
                            System.out.println("|   |");
                            System.out.println("|___| ");
                            System.out.println("  |");
                            System.out.println("  | /");
                            System.out.println("  |/");
                            System.out.println("  |");
                            System.out.println(" / \\");
                            System.out.println("/   \\");
                            chances--;
                            tentativa = false;
                            continue;

                        }else if (chances == 1) {
                            System.out.println(".___.");
                            System.out.println("|   |");
                            System.out.println("|___| ");
                            System.out.println("  |");
                            System.out.println("\\ | /");
                            System.out.println(" \\|/");
                            System.out.println("  |");
                            System.out.println(" / \\");
                            System.out.println("/   \\");
                            chances--;
                            tentativa = false;
                            break;
                        }
                        chances--;
                    }
                }
            }
        }

                //ta ficando dps do 'INFORME UMA PALAVRA'


                // Controlador de acertos
                acertou = true;
                for (int i = 0; i < palavraDesconhecida.length(); i++) {

                    if (acertos[i] == 0) { // Se não acertar entra na condição imprime o underline e false pra acerto
                        System.out.print(" _ ");
                        acertou = false;
                    } else { // Então se acertar a letra imprime o caracter da palavra sorteada
                        System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                    }
                }

            if (chances != 0) {
                System.out.println("---> Parabéns, você acertou a palavra!");
            } else {
                System.out.println("---> Você perdeu!");
            }

        }
    }


