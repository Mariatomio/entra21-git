package Assento;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> listvoo = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int classeeconomica) {
        /*1  2  3  4
        * 5  6  7  8
        * 9  10 11 12
        * 13 14 15 16
        * 17 18 19 20
        * 21 22 23 24
        * 25 26 27 28
        * 29 30 31 32 */
        int linha = 1;
        for (int i = 1; i < linhasCadeirasLuxo * 4; i++) {
            if (i > linha * 4) {
                linha++;
            }
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse("LUXO");
            if (i % 4 == 0 && i % 2 == 0) {
                assentoVoo.setCodigo("D" + (linha));
            } else if (i % 2 == 0  ) {
                assentoVoo.setCodigo("B" + (linha));
            } else if (i % 3 == 0 || i % i == 0 ) {
                assentoVoo.setCodigo("A" + (linha));
            } else{
                assentoVoo.setCodigo("C" + (linha));
            }
            this.getListvoo().add(assentoVoo);
        }











            /*int linhasCadeiras){
        for (int i = 1; i <= 4*linhasCadeiras; i++) {
            AssentoVoo a = new AssentoVoo(); //nv obj
            a.setCodigo(String.valueOf(i));
            listvoo.add(a);
        }*/

    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo ocup : listvoo) {
            if (ocup.getCodigo().equalsIgnoreCase(assento))
                return ocup.isOcupado();

        }
        return false;
    }

    @Override
    public int quantidadelivre() {
        int qntd = 0;
        for (AssentoVoo livre : listvoo) {
            if (!livre.isOcupado()) {
                qntd++;
            }
        }
        return qntd;
    }


    @Override
    public void mostrarAssentos() {
        for(int i = 0; i < this.getListvoo().size(); i++){
            if(this.getListvoo().get(i).getClasse().equalsIgnoreCase("LUXO")){
                System.out.print("["+getListvoo().get(i).getCodigo()+"]");
                if((i+1)%4==0){
                    System.out.println();
                }
            }
            /*if(this.getListvoo().get(i).getClasse().equalsIgnoreCase("ECONOMICA")){
                System.out.print("["+getListvoo().get(i).getCodigo()+"]");
                if((i+1)%6==0){
                    System.out.println();
                }
            }*/
        }












       /* String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        for (int i = 0; i < listvoo.size(); i++) {
            *//*for (int j = 0; j <= alfabeto.length(); j++)*//*

            if (i % 4 == 0) {
                    System.out.println(" ");
                } else if ( i % 2 == 0){
                    System.out.print(" || ");
                }
                if (listvoo.get(i).isOcupado()) {
                    System.out.print("[XX]");
                }
                if (i<9) {
                    System.out.print(alfabeto.charAt(j)+"0"+(i+1)+" ");
                }else {
                    System.out.print((alfabeto.charAt(j))+listvoo.get(i).getCodigo()+" ");
                }
                *//*System.out.print("[" + alfabeto.charAt(j) +listvoo.get(i).getCodigo() + "]");*//*

                break;
            }
        }
*/
    }


    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo voo: listvoo){
            if (voo.getCodigo().equalsIgnoreCase(assento)) {
                return voo;
            }
    }
        return null;
    }
    public Assento getAssento(String assento, String classe) {
        for (AssentoVoo voo: listvoo){
            if (voo.getCodigo().equalsIgnoreCase(assento) && voo.getClasse().equalsIgnoreCase(classe)){
                return voo;
            }
        }
        return null;
    }

    //---------------------------getters and setters--------------------------
    public void setListvoo(ArrayList<AssentoVoo> listvoo) {
        this.listvoo = listvoo;
    }

    public ArrayList<AssentoVoo> getListvoo() {
        return listvoo;
    }



}
 /*   @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo assento1 : listvoo) {
            if (assento1.getCodigo().equalsIgnoreCase(assento)) {
                return assento1.isOcupado();
            }
        }
        return false;
    }


    @Override
    public int quantidadelivre() {
        int qntd = 0;
        for (AssentoVoo assentoaviao : listvoo) {
            if (!assentoaviao.isOcupado()) {
                qntd++;
            }
        }
        return qntd;
    }

    @Override
    public void mostrarAssentos() {
        for (AssentoVoo mostrar : listvoo) {
            if (!mostrar.isOcupado()) {
                System.out.println(getListvoo());
            }
            System.out.print("- ");
        }
        System.out.println("");
    }


//        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
//            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
//                if (this.ocupacaoAssentos[i][j]) {
//
//                } else {
//                    System.out.print(this.codificacaoAssentos[i][j] + " ");
//                }
//            }
//
//        }
//
//    }

    @Override
    public Assento getAssento(String codigo) {
        for (AssentoVoo assentoAviao : listvoo) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(codigo)) {
                return assentoAviao;
            }
        }
        return null;
    }*/