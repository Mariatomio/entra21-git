import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;


public class exercicios {
    public static void main(String[] args) {
        exe12();
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
    public static void exe02() {
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
        System.out.print("A porcentagem de votos válidos é de ");
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

        novoSalario = salario + ((salario * reajuste) / 100);
        System.out.printf(("Salario novo = R$ %.2f\n "), novoSalario);
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual é o o preço do carro em fábrica?");
        double preco = in.nextInt();
        double carro = preco + (0.28 * preco) + (0.45 * preco);
        System.out.println("o preço final do carro é R$ " + carro);
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos carros você vendeu?");
        int vendido = in.nextInt();

        System.out.println("Qual o valor que você recebe por carro vendido");
        double recebe = in.nextDouble();

        System.out.println("Quanto você recebe de comissão fixa por cada carro vendido?");
        double carro = in.nextDouble();

        System.out.println("Qual foi o valor total de suas vendas?");
        double valores = in.nextDouble();

        System.out.println("Qual o seu salário fixo?");
        double salario = in.nextDouble();

        double salariofinal;

        salariofinal = salario + (carro * recebe) + (0.05 * valores);
        System.out.println("Seu salário final = R$ " + salariofinal);

    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos graus está fazendo agora? em Fahrenheit");
        double temperatura = in.nextDouble();

        double celsius = 5 * (temperatura - 32) / 9;
        System.out.println("A temperatura é " + celsius + " ºC");
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanto você tirou na 1º prova?");
        double primeiro = in.nextDouble();

        System.out.println("Quanto você tirou na 2º prova?");
        double segunda = in.nextDouble();

        System.out.println("Quanto você tirou na 3º prova");
        double terceira = in.nextDouble();

        double mediaFinal = ((primeiro * 2) + (segunda * 3) + (terceira * 5) / 10);
        System.out.println("Sua média final ficou " + mediaFinal);
    }

    public static void exe11() {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha um número");
        double num = in.nextDouble();

        if (num >= 10) {
            System.out.println("é maior que 10!");
        } else {
            System.out.println("é menor que 10!");
        }
        System.out.println();
    }

    public static void exe12() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um número");
        double numero = in.nextDouble();

        if (numero >= 0) {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }

    public static void exe13() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas maçãs você comprou?");
        int maca = in.nextInt();

        if (maca < 11) {
            double preco = 1.30 * maca;
            System.out.printf("O custo total da compra é de R$ %.2f\n ", preco);
        } else {
            System.out.println("O custo total da compra é de R$ " + maca);
        }
    }

    public static void exe14() {
        Scanner in = new Scanner(System.in);
        System.out.println("Em que ano você nasceu");
        int nasceu = in.nextInt();

        System.out.println("Em que ano estamos?");
        int ano = in.nextInt();

        if (nasceu < 16) {
            System.out.println("Você ainda não pode votar");
        } else {
            System.out.println("Você pode votar");
        }
    }

    public static void exe15() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um número");
        int valor1 = in.nextInt();

        System.out.println("Escolha outro número, diferente do primeiro");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }

    public static void exe16() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um nº");
        double n1 = in.nextDouble();

        System.out.println("Escolha outro nº, diferente do primeiro");
        double n2 = in.nextDouble();

        if (n1 > n2) {
            System.out.println(n1 + ", " + n2);
        } else {
            System.out.println(n2 + ", " + n1);

        }
    }
}