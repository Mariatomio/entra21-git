package jogo;

import baralho.Baralho;
import playesOption.PlayesOption;

import java.util.ArrayList;

public class Jogo {

    private ArrayList<Carta> handPlayer = new ArrayList<>();
    private ArrayList<Carta> handCPU = new ArrayList<>();

    private Baralho deck = new Baralho();

    private class Carta {
    }
    public void firstRound(){
        // TODO: 30/06/2022
    }
    public void handlePlayerOption(PlayesOption Po){
        // TODO: 30/06/2022
    }
    public void playerWin(){
        // TODO: 30/06/2022
    }
    private void oneMore(){
        // TODO: 30/06/2022
    }
    private void stop(){
        // TODO: 30/06/2022
    }
    private void doubleCard(){
        // TODO: 30/06/2022
    }






    //gETTERS AND sETTERS



    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }


    public void setHandPlayer(ArrayList<Carta> handPlayer) {
        this.handPlayer = handPlayer;
    }

    public void setHandCPU(ArrayList<Carta> handCPU) {
        this.handCPU = handCPU;
    }
    //Getters and Setters dos métodos

}
