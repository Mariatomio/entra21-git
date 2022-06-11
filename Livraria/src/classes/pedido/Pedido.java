package classes.pedido;

import classes.Loja;
import classes.itens.Item;

public class Pedido {
    private String nomeCliente;
    private Item[] itens;

    public void finalizar(Loja loja) {

    }

    //GETTERS E SETTERS------------------------------------------------------------------------
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }


    public Item[] getItens() {
        return itens;
    }




}
