package classes.lanches;

public class Mistoquente extends Sanduiche{
    public Mistoquente() {
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("Misto Quente");
    }

    @Override
    public void mostrarDetalhesNaComanda() {

    }
}
