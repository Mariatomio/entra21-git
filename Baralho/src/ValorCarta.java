public enum ValorCarta{
    //string valor tbm
   UM("1"), DOIS("2"), TRES("3"), QUATRO("4"), CINCO("5"),
    SEIS("6"), SETE("7"), OITO("8"), NOVE("9"), DEZ("10"), ONZE("J"),
    DOZE("Q"), TREZE("K");



    private String nCarta;


    ValorCarta(String nCarta) {
       this.nCarta = nCarta;
    }

    public String getnCarta() {
        return nCarta;
    }

    public void setnCarta(String nCarta) {
        this.nCarta = nCarta;
    }
}


