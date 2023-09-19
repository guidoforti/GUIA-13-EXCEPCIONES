package Entidades;

public class P3DivisionNumero {

    private Integer numUno;
    private Integer numDos;

    public P3DivisionNumero(Integer numUno, Integer numDos) {
        this.numUno = numUno;
        this.numDos = numDos;
    }


    public Integer getNumUno() {
        return numUno;
    }

    public void setNumUno(Integer numUno) {
        this.numUno = numUno;
    }

    public Integer getNumDos() {
        return numDos;
    }

    public void setNumDos(Integer numDos) {
        this.numDos = numDos;
    }


    public Integer dividirNumeros() throws ArithmeticException {
        Integer resultado = null;

        try {
            resultado = this.numUno / this.numDos;

        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir por 0");


        }
        return resultado;
    }





}
