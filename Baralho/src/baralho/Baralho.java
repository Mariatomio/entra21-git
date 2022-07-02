package baralho;

import jogo.Jogo;

import java.util.ArrayList;

public class Baralho {

    private ArrayList<> cartas = new ArrayList<>();

    public Baralho() {
        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta vc : ValorCarta.values()) {
                Jogo.Carta c = new Jogo.Carta();
                c.setValor(vc);
                c.setNaipe(n);
                c.setValorReal(valorCarta);
                cartas.add(c);
                valorCarta++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(this.cartas);
    }

    public Carta getFromTop() {
        return this.cartas.remove(0);
    }

    public Carta getFromBottom() {
        return this.cartas.remove(this.cartas.size()-1);
    }

    public Carta searchCard(Naipe naipe, ValorCarta valor) {
        return this.cartas.stream().filter(
                carta -> naipe.equals(carta.getNaipe()) &&
                        valor.equals(carta.getValor())
        ).findFirst().orElse(null);
    }

    public Carta searchCard(Naipe naipe, int valorReal) {
        return this.cartas.stream().filter(
                carta -> naipe.equals(carta.getNaipe()) &&
                        carta.getValorReal() == valorReal
        ).findFirst().orElse(null);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}

