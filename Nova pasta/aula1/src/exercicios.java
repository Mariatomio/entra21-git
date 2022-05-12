import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        exe20();
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
        System.out.println("seu antecessor é " + (--valor));

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
        System.out.println("o perímetro é " + (base + base + altura + altura));
        System.out.println();
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
        double var = (branco * 100) / pessoa;
        System.out.println(var + "%");
        System.out.println();
        System.out.print("A porcentagem de pessoas que votaram nulo é de ");
        double var2 = (nulo * 100) / pessoa;
        System.out.println(var2 + "%");
        System.out.println();
        System.out.println();
        System.out.print("A porcentagem de votos válidos é de " );
        double var3 = ((pessoa - (branco + nulo)) * 100) / pessoa;
        System.out.println(var3 + "%");
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
    public static void exe20() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário fixo");
        double salario = in.nextDouble();

        System.out.println("Digite o valor das suas vendas efetuadas");
        double vendas = in.nextDouble();

        //salário abaixo de 1500
        double
                salarionormal = salario + (vendas * 0.03);
        if (vendas <= 1500){
            System.out.println("Seu salário final: " + salarionormal);
        }
        double salarioextra = (salarionormal + (0.05*(vendas - 1500)));
        if (vendas > 1500)
            System.out.println("Seu salário final: " + salarioextra);
        // o erro que ta dando é que nn sabe qnd as vendas são maiores que 1500 pois dai no salário normal ele calcula como 0.03 * ...
    }
}



