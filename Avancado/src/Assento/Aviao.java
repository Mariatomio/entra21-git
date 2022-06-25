package Assento;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> listvoo = new ArrayList<>();

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo ocup : listvoo) {
            if (ocup.getCodigo().equalsIgnoreCase(assento))
                return ocup.isOcupado();

        }
        return false;
    }

    @Override
    public int quantidadelivre() {
        int qntd = 0;
        for (AssentoVoo livre: listvoo){
            if (!livre.isOcupado()){
                qntd++;
            }
        }
       return qntd;
    }


    @Override
    public void mostrarAssentos() {

    }
    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo voo: listvoo){
            if (voo.getCodigo().equalsIgnoreCase(assento)) {
                return voo;
            }
    }
        return null;
    }
    public Assento getAssento(String assento, String classe) {
        for (AssentoVoo voo: listvoo){
            if (voo.getCodigo().equalsIgnoreCase(assento) && voo.getClasse().equalsIgnoreCase(classe)){
                return voo;
            }
        }
        return null;
    }

    //---------------------------getters and setters--------------------------
    public void setListvoo(ArrayList<AssentoVoo> listvoo) {
        this.listvoo = listvoo;
    }

    public ArrayList<AssentoVoo> getListvoo() {
        return listvoo;
    }



}
 /*   @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo assento1 : listvoo) {
            if (assento1.getCodigo().equalsIgnoreCase(assento)) {
                return assento1.isOcupado();
            }
        }
        return false;
    }


    @Override
    public int quantidadelivre() {
        int qntd = 0;
        for (AssentoVoo assentoaviao : listvoo) {
            if (!assentoaviao.isOcupado()) {
                qntd++;
            }
        }
        return qntd;
    }

    @Override
    public void mostrarAssentos() {
        for (AssentoVoo mostrar : listvoo) {
            if (!mostrar.isOcupado()) {
                System.out.println(getListvoo());
            }
            System.out.print("- ");
        }
        System.out.println("");
    }


//        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
//            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
//                if (this.ocupacaoAssentos[i][j]) {
//
//                } else {
//                    System.out.print(this.codificacaoAssentos[i][j] + " ");
//                }
//            }
//
//        }
//
//    }

    @Override
    public Assento getAssento(String codigo) {
        for (AssentoVoo assentoAviao : listvoo) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(codigo)) {
                return assentoAviao;
            }
        }
        return null;
    }*/