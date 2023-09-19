package Entidades;

public class P6ClaseDos {

        public int metodo() {
            int valor=0;
            try{
                valor = valor + 1;
                valor = valor + Integer.parseInt ("W");
                valor = valor + 1;
                System.out.println("Valor final del try: " + valor) ;
            } catch ( NumberFormatException e ) {
                valor = valor + Integer.parseInt ("42");
                System.out.println("Valor final del catch: "+ valor) ;
            } finally {
                valor = valor + 1;
                System.out.println("Valor final del finally: "  + valor) ;
            }
            valor = valor + 1;
            System.out.println("Valor antes del return: " + valor) ;
            return valor;
        }
}
