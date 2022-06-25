package Assento;

public interface MeioTransporte {

    boolean verificaOcupacao(String assento);
        // TODO: 23/06/2022  

    int quantidadelivre();
        // TODO: 23/06/2022

    void mostrarAssentos();
        // TODO: 23/06/2022  

    Assento getAssento(String assento);

    Assento getAssento(String assento, String classe);
// TODO: 23/06/2022  




}
