package cuentas;//Apartado 1: Las clases deberán formar parte del paquete cuentas
/**
 * @author pedro molina
 * @version 1.0.
 * Clase CCuenta con los atributos de la cuenta y los métodos necesarios
 */
public class CCuenta {

	/**
	 * Declaración de atributos:
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteros;//He cambiado el nombre que daba un error por uso de caracteres no permitidos

    public CCuenta()
    {
    }
    /**
     * 
     * @param nom nombre del cliente
     * @param cue cuenta del cliente
     * @param sal saldo de la cuenta
     * @param tipo tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * 
     * @return <code>double</code> salde de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad dinero que se ingresa en cuenta
     * @throws Exception Se utiliza para indicar si la cantidad introducida es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad dinero que se retira de la cuenta
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Apartado 4: Encapsular los atributos de la clase CCuenta.
     */
    /**
     * 
     * métodos Getters and Setters para los atributos de la clase CCuenta
     */
	private double getTipoInteros() {
		return tipoInteros;
	}
	private void setTipoInteros(double tipoInteros) {
		this.tipoInteros = tipoInteros;
	}
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private String getCuenta() {
		return cuenta;
	}
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
