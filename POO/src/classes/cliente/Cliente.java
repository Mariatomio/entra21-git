package classes.cliente;

import classes.pedido.Pedido;

public class Cliente {

    private String nome;
    private Pedido pedido;

    public Cliente() {
        this.setPedido(new Pedido()); // assim o pedido só existe com o cliente e visse e versa
        //new pq toda vez que criar um cliente cria um novo pedido
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
