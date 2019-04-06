package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {

        Filho filhoUm = new Filho("Maria", "Jorge", "Jose");
        Filho filhoDois = new Filho("Maria", "Vitor", "Ana");


        System.out.println(saoMeioIrmaos(filhoUm, filhoDois));


    }


    public static String maeDe(Filho novoFilho) {

        return novoFilho.getMae();

    }


    public static String paiDe(Filho novoFilho) {

        return novoFilho.getPai();
    }


    public static boolean mesmaMae(Filho filhoUm, Filho filhodois) {
        return maeDe(filhoUm) == maeDe(filhodois);
    }

    public static boolean mesmoPai(Filho filhoUm, Filho filhodois) {
//        return maeDe(filhoUm) == maeDe(filhodois);

        if (paiDe(filhoUm) == paiDe(filhodois)) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean saoMeioIrmaos(Filho filhoUm, Filho filhoDois) {

        return mesmaMae(filhoUm, filhoDois) && !mesmoPai(filhoUm, filhoDois)
                || !mesmaMae(filhoUm, filhoDois) && mesmoPai(filhoUm, filhoDois);

    }

}

// Testando alteracao