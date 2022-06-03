package classes.lanches;

public class XSalada extends XBurguer{
    public boolean aberto;

    public XSalada() {

        this.adicionarIngrediente("Alface");
        this.adicionarIngrediente("Tomate");
        this.adicionarIngrediente("Picles");
        this.adicionarIngrediente("Maionese");
        this.setTipo("XSalada");
    }

}
