package Main;
import Entidades.P3DivisionNumero;

import java.util.*;
public class P3Main {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese dos numeros");



        try {


            int numU = Integer.parseInt(leer.next());
            int numD = leer.nextInt();

            P3DivisionNumero numeros = new P3DivisionNumero(numU, numD);

            System.out.println(numeros.dividirNumeros());


        } catch (InputMismatchException e) {

            System.out.println(" el formato ingresado no es valido");
        } catch ( NumberFormatException e ) {

            System.out.println("solo se admiten numeros");
        }  catch ( Exception e) {
            System.out.println("fallo el programa");
        }







    }




}
