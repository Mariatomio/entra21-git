package classes.pedido;

import classes.lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public  void imprimircomanda() {
        for (Lanche l : this.getLanches()) {
            if (l != null) {
                System.out.println();
                if (l instanceof MiniPizza) {
                    MiniPizza mp = (MiniPizza) l;
                    System.out.println("====" + mp.getTipo() + " - " + mp.getSabor() + "====");
                    if (mp.isBordarecheada()) {
                        System.out.println("-- COM BORDA RECHEADA: " + mp.getSaborborda().toUpperCase() + " --");
                    }
                    if (l instanceof pizza) {
                        System.out.println("Tamanho: " + ((pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("====" + l.getTipo() + "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("-- LANCHE ABERTO --");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", l.getvalor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getAdicionais()[0] != null) {
                        System.out.println("-ADICIONAIS-");
                        for (String adicional : s.getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional);
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("------------------------------------");
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("------------------------------------");
    }


    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            if (l != null) {
                vlrTotal += l.getvalor();
            }
        }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
            }
        }
}
public Lanche[] getLanches() {
    return this.lanches;
    }
}

//Agregação -> tem um
//Composição -> é parte
//herança -> é um