package Assento;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> listvoo = new ArrayList<>();

    @Override
    public boolean verificaOcupacao(String assento) {
        for (int i = 0; i < this.listvoo.size(); i++) {
                if (this.listvoo.get(i)) {
                    return this.getAssento(assento);
                }
            }
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
    public void setListvoo(ArrayList<AssentoVoo> listvoo) {
        this.listvoo = listvoo;
    }
    public ArrayList<AssentoVoo> getListvoo() {
        return listvoo;
    }

  
}
