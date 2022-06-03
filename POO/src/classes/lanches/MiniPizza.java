package classes.lanches;

public class MiniPizza extends Lanche {
    private boolean bordarecheada;
    private String saborborda;
    private String sabor;


    //massa, molho de tomate, mussarela TODAS
    //4 queijos: provolone; cheddar, catupiry
    //freango e catupiry
    //tomate e manjericão: marguerita
    //portuguesa: presunto, ovo, pimentão


    public MiniPizza() {
        this.adicionarIngrediente("Massa de tomate");
        this.adicionarIngrediente("Mozzarella");
        this.adicionarIngrediente("Massa da pizza");
        this.setTipo("Mini pizza");

    }

    public void adicionarSaborEIngredientes(String sabor) {
        this.setSabor(sabor); //mexendo com o atribudo e atualizando o sabor
        switch (sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Provolone");
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Frango");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Mangericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Ovo");
                this.adicionarIngrediente("Ovo");
                break;
        }
       /* switch (tamanho.toUpperCase()) {
            case "XS":
                System.out.println("Broto");
                break;
            case "SM":
                System.out.println("Pequena");
                break;
            case "MD":
                    System.out.println("Média");
        }*/
    }


    //GETTERS & SETTERS-------------------------------------------------------------------------------------------------

    public void setBordarecheada(boolean bordarecheada)
    {
        this.bordarecheada = bordarecheada;
    }

    public boolean isBordarecheada() {
        return this.bordarecheada;
    }

    public void setSaborborda(String saborborda) {
        this.saborborda = saborborda;
    }

    public String getSaborborda() {
        return this.saborborda;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }


}

