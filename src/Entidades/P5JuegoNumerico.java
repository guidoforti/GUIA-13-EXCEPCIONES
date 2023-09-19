package Entidades;

public class P5JuegoNumerico {


    private int numeroAleatorio;

    public P5JuegoNumerico() {
    }


    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }


    public void generarNumeroAleatorio () {

        this.numeroAleatorio =  (int) ( Math.random() *500 ) + 1 ;
    }


}
