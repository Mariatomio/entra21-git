package jogo;

import baralho.Baralho;
import playesOption.PlayesOption;

public class Jogo {
    private Carta handPlayer;

private Carta handCPU;
private Baralho deck;
private int palyerWins;


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

    public Carta getHandPlayer() {
        return handPlayer;
    }

    public void setHandPlayer(Carta handPlayer) {
        this.handPlayer = handPlayer;
    }

    public Carta getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(Carta handCPU) {
        this.handCPU = handCPU;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPalyerWins() {
        return palyerWins;
    }

    public void setPalyerWins(int palyerWins) {
        this.palyerWins = palyerWins;
    }

    //Getters and Setters dos métodos

}
