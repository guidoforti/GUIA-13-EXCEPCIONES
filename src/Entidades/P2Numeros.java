package Entidades;

public class P2Numeros {

    private int [] numeros;


    public P2Numeros (int cantidadNumeros) {
        numeros = new int[cantidadNumeros];
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
