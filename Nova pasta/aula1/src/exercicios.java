import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        exe05();
    }
    //exercise 1
    public static void exe01() {
        int varA = 10;
        int varB = 20;
        int varC = varA;
        varA = varB;
        varA = varC;
        System.out.println("exercicio1");
        System.out.println(varA);
        System.out.println(varB);


    }
    //exercise2
    public static void exe02(){
        Scanner in = new Scanner(System.in);
        System.out.println("exercicio2");
        System.out.print("Digite um valor");
        int valor = in.nextInt();
        System.out.println(--valor);

    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a altura do retângulo");
        double altura = in.nextInt();
        System.out.println(" a altura é " + altura);
        System.out.println("Digite a base do retângulo");
        double base = in.nextInt();
        System.out.println("a base é " + base);
        System.out.println("a área do retângulo é " + base * altura);
        System.out.print("o perímetro é " + (base + base + altura + altura));
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int anos = in.nextInt();
        System.out.println("Quantos meses você tem?");
        int meses = in.nextInt();
        System.out.println("Quantos dias você tem?");
        int dias = in.nextInt();
        int var1ano = 365;
        int var1mes = 30;
        int vardia = 1;
        System.out.println("Você tem " + (var1ano * anos + var1mes * meses + dias) + " dias de vida");
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos eleitores tem no município?");
        int pessoa = in.nextInt();
        System.out.println("Quantos pessoas votaram em branco?");
        int branco = in.nextInt();
        System.out.println("Quantas pessoas votaram nulo?");
        int nulo = in.nextInt();
        System.out.println("Quantidade de votos validos");
        System.out.println(pessoa - (branco + nulo));
        System.out.print("A porcentagem de pessoas que votaram em branco é de ");
        double var = (branco * 100.0) / pessoa;
        System.out.printf(var + "%");
        System.out.println();
        System.out.print("A porcentagem de pessoas que votaram nulo é de ");
     double var2 = (nulo * 100.0) / pessoa;
        System.out.printf(var2 + "%");
        System.out.println();
        System.out.println();
        System.out.print("A porcentagem de votos válidos é de " );
double var3 = ((pessoa - (branco + nulo)) * 100.0) / pessoa;
        System.out.printf(var3 2.f + "%");
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);

    }
    }

