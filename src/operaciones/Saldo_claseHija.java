
package operaciones;

public class Saldo_claseHija extends Menu_clasePadre{
   
    @Override
    public void Transacciones(){
        System.out.println("-----------------------------------");
        System.out.println("Tu saldo actual es: $" + getSaldo());
        System.out.println("-----------------------------------");
        System.out.println(""); 
    }
    
}
