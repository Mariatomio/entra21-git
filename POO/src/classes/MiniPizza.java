package classes;

public class MiniPizza extends Lanche {
    public boolean bordarecheada;
public String saborborda;
    public MiniPizza() {
        this.adicionarIngrediente("calabresa");
        this.adicionarIngrediente("massa de tomate");
        this.adicionarIngrediente("queijo");
        this.adicionarIngrediente("massa da pizza");
        this.adicionarIngrediente("orégano");
        this.tipo = "Mini pizza";

    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordarecheada) {
            System.out.println("borda recheada: "+ saborborda);
        }
    }
}
