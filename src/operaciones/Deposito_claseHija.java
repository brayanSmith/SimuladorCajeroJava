
package operaciones;




public class Deposito_claseHija extends Menu_clasePadre{

@Override
    public void Transacciones(){
         
        System.out.print("Cuanto deseas depositar: $");
         Deposito();
         
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        
        System.out.println("------------------------------");
        System.out.println("Depositaste: $"+ deposito);
        System.out.println("Saldo actual: $"+ getSaldo());
        System.out.println("------------------------------");
        System.out.println(""); 
    }
            
}
