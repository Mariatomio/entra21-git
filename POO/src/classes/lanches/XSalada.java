package classes.lanches;

import java.util.Scanner;

public class XSalada extends XBurguer{
    public boolean aberto;

    public XSalada() {

        this.adicionarIngrediente("Alface");
        this.adicionarIngrediente("Tomate");
        this.adicionarIngrediente("Picles");
        this.adicionarIngrediente("Maionese");
        this.setTipo("XSalada");
    }
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        if (this.isAberto()) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }

    @Override
    public void montarDetalhesLanche(Scanner in) {
        super.montarDetalhesLanche(in);
        System.out.println("Lanche aberto? (S/N)");
        String aberto = in.nextLine();
        this.setAberto(aberto.equalsIgnoreCase("S"));
    }
}
