public enum Naipe {
    //naipe string
    PAUS("♣"),
    OURO("♦"),
    ESPADA("♠"),
    COPAS("♥");

    private final String naipe;

    Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return this.naipe;
    }
}
