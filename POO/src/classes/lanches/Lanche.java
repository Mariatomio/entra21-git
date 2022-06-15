package classes.lanches;

import java.util.ArrayList;

public abstract class Lanche {
    private ArrayList<String> ingredientes = new ArrayList<>();
    private double valor;

    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }


    public abstract void mostrarDetalhesNaComanda(); //força tudo ter a cara dele
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getvalor() {
        return this.valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public ArrayList<String> getIngredientes() {
        return this.ingredientes;
    }
}
