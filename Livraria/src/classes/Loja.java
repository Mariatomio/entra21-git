package classes;

import classes.guardados.Estante;

import java.util.HashMap;

public class Loja {

    private HashMap<String, Estante> estantes = new HashMap<>();

    public HashMap<String, Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(HashMap<String, Estante> estantes) {
        this.estantes = estantes;
    }
}
//Main add estante, menu principal, add item/ nn da estante (pedir qual vai ser a estante) pedir a capacidade max e o
// identificador para a estante, se já tem uma chave/genero do tipo/ pede para o usuario outro nome
