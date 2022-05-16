
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;


public class exercicios {
    public static void main(String[] args) {


        exe18();


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

        System.out.println("seu antecessor é " + (--valor));

        System.out.println("Seu antecessor é " + --valor);


    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercicio 3");
        System.out.print("Digite a altura do retângulo");
        double altura = in.nextInt();
        System.out.println(" a altura é " + altura);
        System.out.println("Digite a base do retângulo");
        double base = in.nextInt();
        System.out.println("a base é " + base);
        System.out.println("a área do retângulo é " + base * altura);
        System.out.println("o perímetro é " + (base + base + altura + altura));

        System.out.println();


    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercicio 4");
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
        System.out.println("Exercicio 5");
        System.out.println("Quantos eleitores tem no município?");
        int pessoa = in.nextInt();
        System.out.println("Quantos pessoas votaram em branco?");
        int branco = in.nextInt();
        System.out.println("Quantas pessoas votaram nulo?");
        int nulo = in.nextInt();
        System.out.println("Quantidade de votos validos");
        System.out.println(pessoa - (branco + nulo));

        System.out.print("A porcentagem de pessoas que votaram em branco é de ");
        double var = (branco * 100) / pessoa;
        System.out.println(var + "%");
        System.out.println();
        System.out.print("A porcentagem de pessoas que votaram nulo é de ");
        double var2 = (nulo * 100) / pessoa;
        System.out.println(var2 + "%");
        System.out.println();
        System.out.println();
        System.out.print("A porcentagem de votos válidos é de ");
        double var3 = ((pessoa - (branco + nulo)) * 100) / pessoa;
        System.out.println(var3 + "%");

        System.out.printf("\nA porcentagem de pessoas que votaram em branco é de %.2f", ((branco * 100.0) / pessoa));
        System.out.print("%");
        System.out.printf("\nA porcentagem de pessoas que votaram nulo é de %.2f ", ((nulo * 100.0) / pessoa), "%");
        System.out.print("%");
        System.out.printf("\nA porcentagem de votos válidos é de %.2f ", (((pessoa - (branco + nulo)) * 100.0) / pessoa));
        System.out.print("%\n");

    }

    public static void exe06() {
        Scanner ler = new Scanner(System.in);

        double salario, reajuste, novoSalario;
        System.out.printf("Informe o salário mensal:\n");
        salario = ler.nextDouble();
        System.out.printf("\nInforme o percentual de reajuste:\n");
        reajuste = ler.nextDouble();
        novoSalario = salario + (salario * (reajuste / 100));
        System.out.printf("\n\nSalario novo = R$ %.2f\n", novoSalario);
    }

    public static void exe23() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercicio 6");
        double salario, reajuste, novoSalario;

        System.out.printf("Informe o salario mensal:\n");
        salario = in.nextDouble();

        System.out.printf("\nInforme o percentual de reajuste:\n");
        reajuste = in.nextDouble();

        novoSalario = salario + ((salario * reajuste) / 100);
        System.out.printf(("Salario novo = R$ %.2f\n "), novoSalario);
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercicio 07");
        System.out.println("Qual é o o preço do carro em fábrica?");
        double preco = in.nextInt();
        double carro = preco + (0.28 * preco) + (0.45 * preco);
        System.out.printf("o preço final do carro é R$ %.2f\n ", carro);
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercicio 08");

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

        salariofinal = salario + (carro * vendido) + (0.05 * valores);
        System.out.printf("Seu salário final = R$%.2f\n ", salariofinal);

    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercicio 9");

        System.out.println("Quantos graus está fazendo agora? em Fahrenheit");
        double temperatura = in.nextDouble();

        double celsius = 5 * (temperatura - 32) / 9;
        System.out.println("A temperatura é " + celsius + " ºC");
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Exercico 10");
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
        System.out.println("Exercicio 11");

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário fixo");
        double salario = in.nextDouble();

        System.out.println("Digite o valor das suas vendas efetuadas");
        double vendas = in.nextDouble();

        //salário abaixo de 1500
        double
                salarionormal = salario + (vendas * 0.03);
        if (vendas <= 1500) {
            System.out.println("Seu salário final: " + salarionormal);
        }
        double salarioextra = (salarionormal + (0.05 * (vendas - 1500)));
        if (vendas > 1500)
            System.out.println("Seu salário final: " + salarioextra);
        // o erro que ta dando é que nn sabe qnd as vendas são maiores que 1500 pois dai no salário normal ele calcula como 0.03 * ...
    }

    public static void numeromaiorque10() {
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
        System.out.println("Exercicio 12");
        System.out.println("Escolha um número");
        double numero = in.nextDouble();

        if (numero >= 0) {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }

    public static void exe13() {
        System.out.println("Exercicio 13");
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
        System.out.println("Exercicio 14");
        Scanner in = new Scanner(System.in);
        System.out.println("Em que ano você nasceu");
        int nasceu = in.nextInt();

        System.out.println("Em que ano estamos?");
        int ano = in.nextInt();

        if ((ano - nasceu) < 16) {
            System.out.println("Você ainda não pode votar");
        } else {
            System.out.println("Você pode votar");
        }
    }

    public static void exe15() {
        System.out.println("Exercicio 15");
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
        System.out.println("Exercicio 16");
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

    public static void exe17() {
        System.out.println("Exercicio 17");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o horário, inteiro, inicial do jogo de xadrex");
        int ini = in.nextInt();

        System.out.println("Digite o horário, inteiro, final do jogo d xadrex");
        int fin = in.nextInt();

        int tempojogo = fin - ini + 24;
        if (fin < ini) {
            System.out.println("A duração do jogo foi de " + tempojogo + " horas, O jogo acabou no outro dia");
        } else {
            System.out.println("A duração do jogo foi de " + (fin - ini) + " hora(s), O jogo acabou no mesmo dia");
        }
        //duranção do jogo = fin - ini
    }

    public static void exe18() {
        System.out.println("Exercicio 18");
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas horas você trabalhou esse mês?");
        double hr = in.nextDouble();

        System.out.println("Quanto você recebe por hora?");
        double valor = in.nextDouble();

        //calculo do salário normal
        double recebemes;


        // salário sem hora extra
        if (hr <= 160) {
            recebemes = (valor * 160);
            System.out.println("Seu salário final será R$ " + recebemes);
        } else {
            //salário com hora extra
            recebemes = (valor * 160);
            double salarioextra = hr - 160;
            double salariofinalextra = (recebemes + (salarioextra * (valor + valor * 0.50)));
            System.out.println("Seu salário final será R$ " + salariofinalextra);
        }
        //1460 reais de 175 hrs e 8 hrs
    }

    public static void exe19() {
        System.out.println("Exercicio 19");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = in.nextLine();

        System.out.println("Digite a sua altura (use vírgula ao invés de ponto)");
        double altura = in.nextDouble();

        System.out.println("Digite seu gênero: feminino ou masculino");
        in.nextLine();
        String g = in.nextLine();
        if (g.equals("feminino")) {
            System.out.println(nome + " seu peso ideal é " + ((62.1 * altura) - 44.7));
        } else {
            System.out.println(nome + "seu peso ideal é " + ((72.7 * altura) - 58));
        }
    }

    public static void exe20() {
        System.out.println("Exercicio 20");
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário fixo");
        double salario = in.nextDouble();

        System.out.println("Digite o valor das suas vendas efetuadas");
        double vendas = in.nextDouble();

        //salário abaixo de 1500

        if (vendas <= 1500) {
            double salarionormal = salario + (vendas * 0.03);
            System.out.println("Seu salário final: " + salarionormal);
        } else {
            double salarionormal = salario + (1500 * 0.03);
            double salarioextra = salarionormal + ((vendas - 1500) * 0.05);
            System.out.println("Seu salário final: " + salarioextra);
        }
    }

    public static void exe21() {
        System.out.println("Exercicio 21");
        Scanner in = new Scanner(System.in);
        double saldo;
        String cartao;
        double credito;
        double debito;
        double saldoatual;
        System.out.println("Digite o nº do seu cartão");
        cartao = in.nextLine();
        System.out.println("Digite o saldo do seu cartão");
        saldo = in.nextDouble();
        System.out.println("Digite o valor de débito do seu cartão");
        debito = in.nextDouble();
        System.out.println("Digite o valor de crédito do seu cartão");
        credito = in.nextDouble();
        saldoatual = saldo - debito + credito;
        System.out.printf("\nSeu saldo atual: R$ %.2f ", saldoatual);
        if (saldoatual >= 0) {
            System.out.println("Saldo Positivo");
        } else
            System.out.println("Saldo Negativo");
    }

    public static void exe22() {
        System.out.println("Exercicio 22");
        Scanner in = new Scanner(System.in);
        double estoque, maxest, minest, quantidademedia;
        System.out.println("Digite a quantidade atual de estoque");
        estoque = in.nextDouble();
        System.out.println("Digite a quantidade máxima de estoque");
        maxest = in.nextDouble();
        System.out.println("Digite a quantidade mínima de estoque");
        minest = in.nextDouble();
        quantidademedia = ((maxest + minest) / 2);
        System.out.println(quantidademedia);
        if (estoque >= quantidademedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

    }
}

