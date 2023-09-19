package Main;

import Entidades.P2Numeros;

public class P2Main {
    public static void main(String[] args) {


        P2Numeros numero = new P2Numeros(2);



        try {
        for ( int i = 0 ; i < 4 ; i ++) {

            numero.getNumeros()[i] = 1 ;
        }
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }

}
