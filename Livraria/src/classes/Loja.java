package classes;

import classes.guardados.Estante;

import java.util.HashMap;

public class Loja {
    private HashMap<String, Estante> listaEstante = new HashMap<>();

    public HashMap<String, Estante> getListaEstante() {
        return listaEstante;
    }

    public void setListaEstante(HashMap<String, Estante> listaEstante) {
        this.listaEstante = listaEstante;
    }
}
//Main add estante, menu principal, add item/ nn da estante (pedir qual vai ser a estante) pedir a capacidade max e o
// identificador para a estante, se já tem uma chave/genero do tipo/ pede para o usuario outro nome
