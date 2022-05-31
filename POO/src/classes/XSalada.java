package classes;

public class XSalada extends XBurguer{
    public boolean aberto;

    public XSalada() {

        this.adicionarIngrediente("Alface");
        this.adicionarIngrediente("Tomate");
        this.adicionarIngrediente("Picles");
        this.adicionarIngrediente("Maionese");
        this.setTipo("XSalada");
    }
    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("-- LANCHE ABERTO --");
        }


    }
}
