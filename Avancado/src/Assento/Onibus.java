package Assento;

import java.util.ArrayList;

public class Onibus implements MeioTransporte{
    private ArrayList<AssentoOnibus> listaonibus = new ArrayList<>();

    @Override
    public boolean verificaOcupacao(String verifocupa) {
        return false;
    }

    @Override
    public int quantidadelivre() {
        // TODO: 23/06/2022  
        return 0;
    }

    @Override
    public void mostrarAssentos() {
// TODO: 23/06/2022  
    }

    @Override
    public Assento getAssento(String assento) {
        // TODO: 23/06/2022  
        return null;
    }

    //---------------------------getters and setters--------------------------

    public ArrayList<AssentoOnibus> getListaonibus() {
        return listaonibus;
    }

    public void setListaonibus(ArrayList<AssentoOnibus> listaonibus) {
        this.listaonibus = listaonibus;
    }
}
