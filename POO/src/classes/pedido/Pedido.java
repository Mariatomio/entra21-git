package classes.pedido;

import classes.lanches.*;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void imprimircomanda() {
        for (Lanche l : this.getLanches()) {

            l.mostrarDetalhesComanda();
            System.out.println("-INGREDIENTES-");
            for (String ingrediente : l.getIngredientes()) {
                System.out.println(ingrediente);
            }
            System.out.println();
            System.out.println("------------------------------------");
            System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
            System.out.println("------------------------------------");
        }
    }


    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            vlrTotal += l.getvalor();
        }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }


//Agregação -> tem um
//Composição -> é parte
//herança -> é um

    private void getLanches() {
    }
}