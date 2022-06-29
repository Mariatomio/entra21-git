public enum Naipe {
    //naipe string
    COPAS("Copas"), PAUS("Paus"), ESPADAS("Espadas"), OURO("ouro");
    private String Naipes;
    Naipe (String Naipes){
        this.Naipes = Naipes;
    }

    public String getNaipes() {
        return Naipes;
    }

    public void setNaipes(String naipes) {
        Naipes = naipes;
    }
}
