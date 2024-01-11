package operaciones;

import java.util.Scanner;

public abstract class Menu_clasePadre {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {

            do {
                System.out.println("***********************");
                System.out.println("* SIMULADOR DE CAJERO *");
                System.out.println("***********************");
                System.out.println("Por favor seleccione una opcion: \n[1]Consulta de saldo.\n[2]Retiro Efectivo.\n[3]Deposito Efectivo.\n[4]Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentar por favor");
                    System.out.println("-------------------------------------------------");

                }

            } while (bandera == 0);

            if (seleccion == 1) {

                Menu_clasePadre mensajero = new Saldo_claseHija();
                mensajero.Transacciones();

            } else if (seleccion == 2) {

                Menu_clasePadre mensajero = new Retiro_claseHija();
                mensajero.Transacciones();

            } else if (seleccion == 3) {

                Menu_clasePadre mensajero = new Deposito_claseHija();
                mensajero.Transacciones();

            } else if (seleccion == 4) {
                System.out.println("----------------------");
                System.out.println("Gracias,vuelva pronto.");
                System.out.println("----------------------");
                bandera = 2;
            }

        } while (bandera != 2);
    }

    // Metodo para solicitar cantidad de retiro
    public void Retiro() {
        retiro = entrada.nextInt();
    }

    //Metodo para solicitar deposito   
    public void Deposito() {
        deposito = entrada.nextInt();
    }
    //Metodo abstracto 
    public abstract void Transacciones();

    //Metodo Getter y setter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
