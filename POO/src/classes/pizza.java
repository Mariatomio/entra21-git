package classes;

public class pizza extends MiniPizza {
    private String tamanho;

    public pizza(){
        this.setTipo("Pizza");
    }
    @Override
    public void montarComanda() {
        super.montarComanda();
        System.out.println("Tamanho: " + this.tamanho);
    }

    public void setTamanho(String tamanho) {
    this.tamanho = tamanho;

    }
    public String getTamanho(){
        return this.tamanho;
    }

}