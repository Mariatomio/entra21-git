public enum ELanche {
    XSALADA(1, "X-Salada"),
    XBURGER(2, "X-Burguer"),
    MISTOQUENTE(3,"Misto Quente"),
    HOTDOG(4,"Hot Dog"),
    MINIPIZZA(5,"Mini Pizza"),
    PIZZA(6,"Pizza");

    private int valorOpcao;
    private String descricao;



    ELanche(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static ELanche getByValorOpcao(int escolha) {
        for (ELanche e : ELanche.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        throw new RuntimeException();
    }
    //------------------------------GETERRS AND SETTERS------------------------------
    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
