package Assento;

import java.util.ArrayList;
import java.util.HashMap;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> listvoo = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        /*1  2  3  4
        * 5  6  7  8
        * 9  10 11 12
        * 13 14 15 16
        * 17 18 19 20
        * 21 22 23 24
        * 25 26 27 28
        * 29 30 31 32 */
      /*  String[] listaLuxo = {"A", "B", "C", "D"};
        for (int i = 1; i <= linhasCadeirasLuxos; i++) {
AssentoVoo a = new AssentoVoo();
a.setClasse(ClassesAssentoVoo.LUXO);
listvoo.add(a);
        }
            for (int j = 0; j < 4; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setClasse(ClassesAssentoVoo.LUXO);
                if (i < 10){
                    a.setCodigo(listaLuxo[j]+"0"+i);
                    listvoo.add(a);
                }else {
                    a.setCodigo(listaLuxo[j] + i);
                    listvoo.add(a);
                }

            }


        String[] listaEconomica = {"A", "B", "C", "D", "E", "F"};
        for (int i = 1; i <= linhasCadeirasEconomicas; i++) {
            //for (int j = 0; j < listaEconomica.length; j++) {
                for (int j = 0; j < 6*linhasCadeirasEconomicas; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setClasse(ClassesAssentoVoo.ECONOMICA);
                a.setCodigo(listaEconomica[j] + i);
                listvoo.add(a);
            }
        }
*/
        String codigoAssentos = "ABCD";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < linhasCadeirasLuxo; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClassesAssentoVoo.LUXO);
                listvoo.add(a);
            }
        }
        codigoAssentos = "ABCDEF";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < linhasCadeirasEconomicas; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
                a.setClasse(ClassesAssentoVoo.ECONOMICA);
                listvoo.add(a);
            }
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
            int contadorLuxo = 0;
            int contadorEconomica = 0;
            for (AssentoVoo a : listvoo) {
                if (a.getClasse().equals("luxo")) {
                    System.out.println("----------------Classe LUXO----------------");
                    contadorLuxo++;
                    if (a.isOcupado()){
                        System.out.println("[XX]");
                    } /*else {
                        if (a.getCodigo().contains("A") || a.getCodigo().contains("[XX]")){
                            System.out.print("     ");
                        }*/
                        if ((contadorLuxo % 4 == 0)) {
                            System.out.print("[" + a.getCodigo() + "]\n");
                        } else {
                            System.out.print("[" + a.getCodigo() + "] ");
                        }
                    }


                if (a.getClasse().equals("economico")) {
                    contadorEconomica++;
                    if (a.isOcupado()){
                        System.out.println("[XX]");
                    } else {
                        if ((contadorEconomica % 6 == 0)) {
                            System.out.print("[" + a.getCodigo() + "]\n");
                        } else {
                            System.out.print("[" + a.getCodigo() + "] ");
                        }
                    }
                }

                if(contadorLuxo % 2 == 0 && contadorLuxo % 4 != 0){
                    System.out.print("|| ");
                }

                if (contadorEconomica % 3 == 0 && contadorEconomica % 6 != 0){
                    System.out.print("|| ");
                }
            }
        }



     /*   for(int i = 0; i < this.getListvoo().size(); i++){
            if(this.getListvoo().get(i).getClasse().equalsIgnoreCase("LUXO")){
                System.out.print("["+getListvoo().get(i).getCodigo()+"]");
                if(i%4==0 ){
                    System.out.println(" ");
                }
                if (listvoo.get(i).isOcupado()) {
                    System.out.print("[XX]");
                }

            }*/
            /*if(this.getListvoo().get(i).getClasse().equalsIgnoreCase("ECONOMICA")){
                System.out.print("["+getListvoo().get(i).getCodigo()+"]");
                if((i+1)%6==0){
                    System.out.println();
                }
            }*/
      //  }
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
   // }


    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo voo: listvoo){
            if (voo.getCodigo().equalsIgnoreCase(assento)) {
                return voo;
            }
    }
        return null;
    }

    @Override
    public Assento getAssento(String assento, String classe) {
        return null;
    }

    public Assento getAssento(String assento, ClassesAssentoVoo classe) {
        for (AssentoVoo voo: listvoo){
            if (voo.getCodigo().equalsIgnoreCase(assento) && voo.getClasse().equals(classe)){
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