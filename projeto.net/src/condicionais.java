import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {
        String[] palavras = {"abc", "def", "ghi"};
        char letraProibida = 'A';
        boolean achou = false;
        for (String palavra : palavras) {
            for (int i = 0; i < palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }
        }
        if (achou) {
            System.out.println("Encontrou letra proibida");
        } else {
            System.out.println("Não encontrou letra proibida");
        }
    }

    public static void teste() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma letra aleatória");
        boolean letra = in.nextBoolean();
        String[] palavras = {"maça", "frutas", "abacaxi"};
        char letraProibida = 'e';
        boolean achou = false;
        for (String palavra : palavras) {
            for (int i = 0; i < palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }
        }
        if (achou) {
            System.out.println("Encontrou letra proibida");
        } else {
            System.out.println("Não encontrou letra proibida");
        }
    }
}









   /* public static void main(String[] args) {
        System.out.println(

        forbiddenLetter(new String[]{"abc", "def", "ghi"}, 'a'));
    }
public static boolean forbiddenLetter(String[] palavras, char letraProibida) {
        boolean achou = false;
for (String palavra : palavras) {
    for (int i = 0; i <= palavra.length(); i++) {
        achou = palavras.charAt(i) == letraProibida;
        if (achou) {
            break;
        }
    }
    if (achou) {
        break;
    }
}
return achou;
    }
}
    }*/

