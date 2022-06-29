import java.awt.font.FontRenderContext;
import java.util.ArrayList;

public class Carta {
    ArrayList<Object> Cartas = new ArrayList<>();
    //override da carta metodo tostring
   /* private String Naipe;
    private String ValorCarta;*/

    public static Naipe escolherNaipe(){
        /*Naipe escolha = null;*/
        Carta c = new Carta();
        c.Cartas.add(Naipe.values());
        for (Naipe naipe : Naipe.values()){
            System.out.println(c.naipe.getNaipes());
        }
        return escolha;
    }
}
