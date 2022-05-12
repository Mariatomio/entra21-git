import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        //informe a abreviação e retorna se é vdd e onde pertence
        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Informe  abreviação da Classe Healer: ");
            String clazz = in.nextLine().toUpperCase(Locale.ROOT);
            if (clazz.length() != 3) {
                System.err.println("Não é uma abreviação válida");
continue; // continuar pedindo as abreviaçãp
            }
            switch (clazz) {
                case "PLD", "WAR", "DKN", "GNB":
                    System.out.println("Tank");
                    break;
                case "WHM", "SCH", "AST", "SAG":
                    System.out.println("Heder");
                    break;
                case "MNR", "DRG", "NJA", "SMR", "RPR", "BRP", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("DPS");
                    break;
                default:
                    System.err.println("Não é Healer");
                   // isHealer = false; SE COLOCAR ISSO NN PERGUNTA DNV
                    continue;

            }

            }
        }
    }
