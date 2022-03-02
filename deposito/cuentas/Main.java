package cuentas;//Apartado 1: Las clases deberán formar parte del paquete cuentas
public class Main {

    public static void main(String[] args) {
    	
        operativa_cuenta(0);//Apartado 3: Introducir el método operativa_cuenta
        					//Apartado 5: Añadir un nuevo parámetro al método operativa_cuenta, de nombre cantidad y de tipo float
    }

	/**
	 * Apartado 3: Introducir el método operativa_cuenta
	 * Apartado 5: Añadir un nuevo parámetro al método operativa_cuenta, de nombre cantidad y de tipo float
	 * @param cantidad TODO
	 */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;//Apartado 2: Cambiar el nombre de la variable "miCuenta" por "cuenta1"
        double saldoActual;
		cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
