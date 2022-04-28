import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        exe08();
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
        System.out.println();
    }

    public static void exe06() {
        Scanner ler = new Scanner(System.in);

        double salario, reajuste, novoSalario;

        System.out.printf("Informe o salario mensal:\n");
        salario = ler.nextDouble();

        System.out.printf("\nInforme o percentual de reajuste:\n");
        reajuste = ler.nextDouble();

        novoSalario = salario + ((salario * reajuste) / 100) ;
        System.out.printf("\nSalario novo = R$ " + novoSalario);
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual é o o preço do carro em fábrica?");
       double preco = in.nextInt();
double carro = preco + ( 0.28 * preco) + ( 0.45 * preco);
        System.out.println("o preço final do carro é R$ " + carro);
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos carros você vendeu?");
        int vendido = in.nextInt();

        System.out.println("Qual o valor que você recebe por carro vendido");
        double recebe = in.nextDouble();

        System.out.println("Quanto você recebe de comissão por cada carro vendido?");
        double carro = in.nextDouble();

        System.out.println("Qual foi o valor total de suas vendas?");
        double valores = in.nextDouble();

        System.out.println("Qual o seu salário fixo?");
        double salario = in.nextDouble();

        double salariofinal;

        salariofinal = salario + (carro * vendido) + (0.05 * valores);
        System.out.println("Seu salário final = R$ " + salariofinal);








    }
    }

