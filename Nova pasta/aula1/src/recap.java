
import java.util.Locale;
import java.util.Scanner;

public class recap {
    public static void main(String[] args) {
       exegeovanne2();
    }

    public static void exe1() {

// saida de mensagem para usuários
        int var1;
        boolean var2;
        System.out.println(); // exibe e quebra a linha
        System.out.println(""); // exibe e nn quebra linha
        //%d inteiro, %.2f 2 numeros dps da virgula %s texto
        // entrada- pelo usuario PELO CONSOLE
        Scanner in = new Scanner(System.in);
        in.next(); // espera o usuário digitar, pega td o q foi digitado
        in.nextInt(); // espera digitar valores inteiros
        in.nextDouble(); // espera numeros decimais
        in.nextLine();

        // operações aritméticas
        var1 = 10 + 10;
        var1 = 10 - 10;
        var1 = 10 / 10;
        var1 = 10 * 10;
        var1 = 10 % 10; // resto da divisão- modulo

        //operações relacionais - SMPR RETORNAM VALOR BOOLEAN
        var2 = 10 > 10; // maior que
        var2 = 10 >= 10;
        var2 = 10 < 10;
        var2 = 10 <= 10;
        var2 = 10 == 10; // igualdade
        var2 = 10 != 10; // diferente

        // operadores lógicos - comparação entre valores booleanos
        var2 = true && false; // true E false - só verdade quando as duas entradas forem verdades
        var2 = true || false; // true OU false - só vai ser falso qnd ambos são falsos
        var2 = !true; // Não false
        //curiosidade, nn mtt usado
        var2 = true ^ true; // o XOR - só vai ser vdd quando ambas as entradas forem iguais
        var2 = (true && false) || (true && false); // ou exclusivo do java

        //condicionais - estrutura de seleção
        if (true) {
            //se a condição for verdade executa esse trecho do códigio
        } else {
            //executa esse
        }//pd ter if dentro do if


        //if encadeado
        if (var1 == 1) {
            // se a primeira for verdade executa esse trecho do códigio
        } else if (var1 == 2) {
            //senão se a segunda for verdade executa esse trecho do códigio
        } else if (var1 == 3) {
        } else {
            // senão executa isso
        }

        //if alinhado
        if (var2) {
            //se a primeira condição for verdade executa esse trecho de código
        }
        if (var2) {
            //executa esse
        }
        switch (var1) {
            case 1 -> System.out.println("um");
            // se não tiver break, o código continuará sendo executadona na próxima
            case 2 -> System.out.println("Dois"); //""
            case 3 -> System.out.println("Três");
            default -> System.out.println("Não sei");
        }

        // repetição
        //irá repetir um trecho de código por um determinado n de vezes
        // enquanto o código for vdd
        if (var1 == 5) {
            for (int i = 0; i <= 10; i++) { //enq for menor q 10 o código continua sendo executado,
                // "i++" para nn ficar em loop infinito
            } //ou
            for (var1 = 0; var1 <= 10; var1++) { // pode usar uma que ja foi, a variavel, porém atribuir um valor nv
                System.out.println(var1);
            }
        }
        //while = for porém nn sabe qnts vexes vai executar, nº de vezes desconhecidos
        // enquanto o código for vdd
        while (var1 != 0) {
            System.out.println("teste");
            var1 = in.nextInt(); // atualização na variável no while, caso esse valor nn seja atualizado
            //irá gerar um loop infinito
        }

        // qlqr outro código

       /* while (true){
       int i = in.nextint();
       if (i == 0) {
       break;
       } else {
       switch (i) {
       .
       .
       .
       .
       }
        */

        //String - LISTA de char
        String var3 = "djsdhkhs";
        // var1.charAT(); // retornar só uma letra da posição informada

        // System.out.println(var3.lenght()); // lenght() retorna a quantidade total
        // de caracteres no texto

        System.out.println(var3.charAt(0)); // chatAT() retirna o caracter na posição x

        System.out.println(var3.equals("teste")); // comparar as strings = equals(), retorna booleano

        System.out.println(var3.toLowerCase()); // converter tudo em minusculo

        System.out.println(var3.toUpperCase()); // converte para maiusculo, os caracteres

        System.out.println(var3.contains("djsdhkhs")); //contains() checa se o texto informado
        // informado contém  String do parâmetro

        System.out.println(var3.split("")); //["D", "d you know... quebre no numero informado/espaço
        // vai separar toda vez que tiver espaço

        System.out.println(var3.strip()); // strip() remove os espaços do começo e do final do texto

        String[] splitted = var3.split(""); // irá quebrar o texto no delimitador  e tira fora os espaços e retornará uma lista das palavras

        for (String word : splitted) {
            System.out.println(word);
        }

        System.out.println(var3.substring(5, 8)); // pega os valores que estão entre o "5 e 8"

        //concat

        //Array
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // iniciando lista com valores
        int[] numeros2 = new int[10]; // iniciando lista vazia

        System.out.println(numeros[6]); // recuperando um valor da lista
        numeros2[4] = 7; // ou in.nextInt() //inserindo um valor no array
        System.out.println(numeros.length); //pegando a quantidade de itens
        //System.out.println(numeros); //nn vai ler direito, vai aparecer a lista de memória no pc
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //matriz
        int[][] numeros3 = {{0, 1, 2, 3, 4,}, {5, 6, 7, 8, 9}}; // cada uma das chaves de dentro é uma linha e cada nº uma coluna ex:2 linhas e 5 colunas
        int[][] numeros4 = new int[2][5]; //duas linhas e 5 colunas igual a de cima
        System.out.println(numeros3[0][2]); // recuperando um valor de uma matriz
        numeros4[1] = new int[]{7, 8, 9, 0}; // inserindo uma lista em uma linha, colocando um dado em posição certa
        numeros4[0][0] = 9; // inserindo dados em uma posção de matriz

        System.out.println(numeros3.length); // numero de linhas da matriz
        System.out.println(numeros3[0].length); // quantidade de itens na linha da matriz

        for (int i = 0; i < numeros3.length; i++) {
            for (int j = 0; j < numeros3[i].length; j++) {
                System.out.println(numeros3[i][j]);
                ;
            }
        }
    }

    //batalha naval
    public static void batalhanaval() {
        Scanner in = new Scanner(System.in);
        boolean lc = true;
        int coluna1 = 0;
        boolean x = true;
        while (x) {
            System.out.println("Informe uma linha de 0 até 7, caso você digite 9, o código para ");
            int linha = in.nextInt();
            if (linha == 9) {
                break;
            }

            while (lc) {
                System.out.println("Informe uma coluna de A até H");
                String coluna = in.next().toUpperCase();
                switch (coluna) {
                    case "A":
                        coluna1 = 0;
                        lc = false;
                        break;
                    case "B":
                        coluna1 = 1;
                        lc = false;
                        break;
                    case "C":
                        coluna1 = 2;
                        lc = false;
                        break;
                    case "D":
                        coluna1 = 3;
                        lc = false;
                        break;
                    case "E":
                        coluna1 = 4;
                        lc = false;
                        break;
                    case "F":
                        coluna1 = 5;
                        lc = false;
                        break;
                    case "G":
                        coluna1 = 6;
                        lc = false;
                        break;
                    case "H":
                        coluna1 = 7;
                        lc = false;
                        break;
                }
            }

            int[][] mapa = {
                    {0, 1, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 1, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 1, 0, 1, 1, 1},
                    {0, 1, 0, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 1, 0},
                    {0, 1, 0, 1, 0, 0, 0, 0},
            };
            if (mapa[linha][coluna1] == 0) {
                System.out.println("Você acertou a água");
            } else {
                System.out.println("Você acertou o barco");
            }
        }
    }

    public static void exe2() {
        //Escreva um algoritmo que peça o numero
        Scanner in = new Scanner(System.in);

    }

    public static void exe6() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe 5 números, inteiros: ");
            soma += in.nextInt();
        }
        System.out.println("A soma dos 5 números é " + soma);
    }

    /*

           /* while (linha > 7) {
                System.out.println("Linha inválida"); break;
            } if (linha < 0 ) {
                System.out.println("Linha inválida"); continue;
            }else {
                System.out.println("Linha válida");
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Informe uma coluna de 0 até 7");
            int coluna = in.nextInt();

            while (coluna > 7) {
                System.out.println("Coluna inválida"); continue;
            } if (coluna < 0 ) {
                System.out.println("Coluna inválida"); continue;
            }else {
                System.out.println("Coluna válida");
            }
        }
        //int[] sub1 = [1][4]
        //Batalha naval
        int[][] mapa = {
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},

        }; */


    //Escreva um algoritmo que peça ao usuário para digitar uma frase e retorne a quantidade de caracteres " " que existem na frase
    public static void exe() {
        Scanner in = new Scanner(System.in);
        int espacos = 0;
        System.out.println("Digite uma frase");
        String frase = in.nextLine();

        for (int a = 0; a < frase.length(); a++) {
            if (frase.charAt(a) == ' ') {
                espacos++;
            }
        }
        System.out.println("Essa frase possui " + espacos + " espaços");
    }

  /*  public static void exersalaprintsnap() {
        Scanner in = new Scanner(System.in);
        int coluna, linha;
        System.out.print("Infornme o número de linhas: ");
        linha = in.nextInt();
        System.out.print("Infornme o número de colunas: ");
        coluna = in.nextInt();
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna;){
                j++;
                System.out.print("#");
            }

            System.out.println("#");
        }
    } ESSE DEU ERRADO FALTA O MENOS 1 NO FINAÇ */

    public static void exegeovanne() {
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

    public static void exegeovanne2() {
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
}
