package classes.guardados;

import classes.itens.Item;

import java.awt.font.FontRenderContext;

public class Estante {
    private int capMaxima;
    private static Item[] itens;

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
        for (int i = 0; i < capMaxima; i++) {

        }
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() ==this.getCapMaxima();
    }

    public int quantidadeItens() { //vê quantos itens tem
        int contador = 0;
        for (Item i : getItens()) { //NÃO SE PREOCUPA COM POSIÇÃO, NÃO DA PARA COLOCAR UM ARRAY
            if (i != null) {
                contador++;
        }
        }
        return contador;
    }

    public Item buscarItem(String titulo) {
        //ir de posição em posição
        for (Item i : this.getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
               return i;
            }
        }
        return null;
    }


    public boolean adicionarItem(Item item) {
        for (int i = 0; i < this.getItens().length; i++) {
            if (this.getItens()[i] == null) {
                this.getItens()[i] = item;
                return true;
            }
        }
        return false;
      // if (quantidadeItens() != getCapMaxima()) { DARIA PARA FAZER A RETORNA FALSE

       }

    public Item removerItem(int posicao) {
         Item i = this.getItens()[posicao]; // SALVA NA VARIAVEL PARA DEPOIS DEIXAR NULL E RETORNAR
         this.getItens()[posicao] = null;
         return i; //para retornar o valor no caso o nome e mostrar ele, senão ele se perderia
        }

    // GETTERS & SETTERS

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public static Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
