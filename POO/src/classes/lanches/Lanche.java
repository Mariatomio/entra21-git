package classes.lanches;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;

    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if (this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
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
    public String[] getIngredientes() {
        return this.ingredientes;
    }
}
