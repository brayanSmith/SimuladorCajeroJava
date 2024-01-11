
package main;
import operaciones.*;

public class ClaseMain {
        
    public static void main(String[] args) {
        Menu_clasePadre mensajero = new Saldo_claseHija();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
      
    }
}
