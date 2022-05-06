import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class recap {
    public static void main(String[] args) {

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
        System.out.println(var3.strip()); // strip() remove os espaços do começo e do final do texto

        String[] splitted = var3.split(""); // irá quebrar o texto no delimitador  e tira fora os espaços e retornará uma lista das palavras

        for (String word : splitted) {
            System.out.println(word);
        }

        System.out.println(var3.substring(5, 8)); // pega os valores que estãp entre o "5 e 8"

        //concat


    }
        }
