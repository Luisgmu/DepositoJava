package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual );

        operativa_cuenta(cuenta1, null);
    }
    public static void operativa_cuenta(CCuenta cuenta, Float cantidad) {
        try {
            cuenta.retirar(2300);
            System.out.println("Retiro realizado");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            cuenta.ingresar(605);
            System.out.println("Ingreso en cuenta realizado");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}


