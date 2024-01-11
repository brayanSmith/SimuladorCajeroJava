
package operaciones;




public class Retiro_claseHija extends Menu_clasePadre{
    
    @Override
    public void Transacciones(){
        
        System.out.print("Cuanto desea retirar: ");
        Retiro();
        
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("----------------------------");
            System.out.println("Retiraste: $"+retiro);
            System.out.println("Saldo Actual: $"+getSaldo());
            System.out.println("----------------------------");
            System.out.println(""); 
            
        }else{
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
            System.out.println(""); 
        }
    }
    
}
