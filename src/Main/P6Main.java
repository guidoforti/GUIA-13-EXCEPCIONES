package Main;

import Entidades.P6ClaseDos;
import Entidades.P6ClaseTres;
import Entidades.P6ClaseUno;

public class P6Main {
    public static void main(String[] args) {
        P6ClaseUno cUno = new P6ClaseUno();
        P6ClaseDos cDos = new P6ClaseDos();
        P6ClaseTres cT = new P6ClaseTres();
        try {
            System.out.println (cT.metodo()) ;
        }catch(Exception e) {
            System.err.println("Excepcion en metodo() ") ;
            e.printStackTrace();
        }
    }
}
