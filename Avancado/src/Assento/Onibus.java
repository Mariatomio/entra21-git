package Assento;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> listaonibus = new ArrayList<>();
    //usuario informa a qntd de linhar
    private boolean leito;

    public Onibus(int linhasCadeiras) {
        for (int i = 1; i <= 4 * linhasCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus(); //nv obj
            a.setLugar(String.valueOf(i));
            listaonibus.add(a);
        }

    }


    @Override
    public boolean verificaOcupacao(String verifocupa) {
        for (AssentoOnibus assento2 : listaonibus) {
            if (assento2.getLugar().equalsIgnoreCase(verifocupa)) {
                return assento2.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadelivre() {
        int quantidade = 0;
        for (AssentoOnibus assOnibus : listaonibus) {
            if (!assOnibus.isOcupado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    @Override
    public void mostrarAssentos() {


        for (int i = 0; i < listaonibus.size(); i++) {

            if (i % 4 == 0) {
                System.out.println(" ");
            } else if ( i% 2 == 0){
                System.out.print(" || ");
            }
            if (listaonibus.get(i).isOcupado()) {
                System.out.print("[XX]");
            } else if (i<9) {
                System.out.print("[0"+(i+1)+"]");
            }else {
                System.out.print("["+listaonibus.get(i).getLugar()+"]");
            }
        }
    }

    @Override
    public Assento getAssento(String codigo) {
        for (AssentoOnibus asstOnibus : listaonibus) {
            if (asstOnibus.getLugar().equalsIgnoreCase(codigo)) {
                return asstOnibus;
            }
        }
        return null;
    }

    @Override
    public Assento getAssento(String assento, String classe) {
        return null;
    }

    //---------------------------getters and setters--------------------------

    public ArrayList<AssentoOnibus> getListaonibus() {
        return listaonibus;
    }

    public void setListaonibus(ArrayList<AssentoOnibus> listaonibus) {
        this.listaonibus = listaonibus;
    }

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }
}
