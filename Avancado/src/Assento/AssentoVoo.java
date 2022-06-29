package Assento;

public class AssentoVoo extends Assento {
    private String codigo;
    private ClassesAssentoVoo classe;



    //-----------GETTERS AND SETTERS---------------------
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ClassesAssentoVoo getClasse() {
        return classe;
    }

    public void setClasse(ClassesAssentoVoo classe) {
        this.classe = classe;
    }
}
