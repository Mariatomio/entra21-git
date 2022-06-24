package Assento;

public abstract class Assento {
    private boolean ocupado;
    private double valor;

    //ARRAY LIST CLASSE ASSENTO

    public void ocupar() {
        this.setOcupado(true);
    }

    //1.1 1.N N.1 ARRAYLIST



    //-----------GETTERS AND SETTERS---------------------

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }






}
