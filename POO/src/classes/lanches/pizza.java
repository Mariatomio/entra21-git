package classes.lanches;

public class pizza extends MiniPizza {
    private String tamanho;

    public pizza(){
        this.setTipo("Pizza");
    }


    public void setTamanho(String tamanho) {
    this.tamanho = tamanho;

    }
    public String getTamanho(){
        return this.tamanho;
    }

}