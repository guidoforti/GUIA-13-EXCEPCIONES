package Servicios;

import Entidades.P5JuegoNumerico;

import java.util.*;

public class P5Servicio {

    Scanner leer = new Scanner(System.in);

    public P5JuegoNumerico crearJuego() {

        P5JuegoNumerico juegoNuevo = new P5JuegoNumerico();

        juegoNuevo.generarNumeroAleatorio();

        return juegoNuevo;
    }


    public int comprobarNumero(P5JuegoNumerico juego) throws InputMismatchException{

        int numeroIngresado = 0;
        int intentos = 0;

        do {
            System.out.println(juego.getNumeroAleatorio());
            System.out.println("ingrese un numero entre 1 y 500");

            try {
                intentos += 1;
                numeroIngresado = leer.nextInt();

                if (numeroIngresado < 1 || numeroIngresado > 500) {
                    System.out.println("debe ingresar un numero entre 1 y 500");
                } else if (numeroIngresado < juego.getNumeroAleatorio()) {
                    System.out.println(" el numero ingresado es menor al numero ");

                } else if (numeroIngresado > juego.getNumeroAleatorio()) {
                    System.out.println(" el numero ingresado es mayor al numero ");

                }

            } catch (InputMismatchException e) {
                System.out.println("debe ingresar un numero valido");
                leer.next();

            } catch (Exception e) {
                System.out.println("error inesperado");
            }

        } while (numeroIngresado != juego.getNumeroAleatorio());

        System.out.println(" usted adivino el numero que era " + juego.getNumeroAleatorio());
        return intentos;
    }
}
