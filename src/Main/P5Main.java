package Main;

import Entidades.P5JuegoNumerico;
import Servicios.P5Servicio;

public class P5Main {
    public static void main(String[] args) {

        P5Servicio sv = new P5Servicio();
        P5JuegoNumerico juegoNuevo = sv.crearJuego();

        System.out.println(sv.comprobarNumero(juegoNuevo));

    }
}
