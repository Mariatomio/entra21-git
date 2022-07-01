package baralho;

import java.util.ArrayList;
import java.util.Collection;

public class Baralho {

    private ArrayList<Carta> cartas = new ArrayList<>();

    Baralho(){
        for (Naipe n : Naipe.values()){
            Carta c = new Carta();
        }
        shuffle();
    }
 public void shuffle(){
     Collection.shuffle(this.cartas); //embaralha
 }
 public Carta getFromTop(){
     return this.cartas.remove(0);

 }
 public Carta getFromBottom(){
     return this.cartas.remove(this.cartas.size()-1);
 }
 public Carta searchCard(Naipe naipe, ValorCarta valor){
return this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) &&
        valor.equals(carta.getValor())).findFirst().orElse(null);
 }
 public Carta searchCard(Naipe naipe, int valorReal){
     return this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) &&
             carta.getValorReal() == valorReal).findFirst().orElse(null);
 }




    //----------------------GETTERS AND SETTERS


    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    private class Carta {
    }

    private static class Naipe {
    }

    private class ValorCarta {
    }
}

