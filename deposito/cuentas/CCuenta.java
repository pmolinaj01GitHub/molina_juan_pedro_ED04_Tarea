package cuentas;//Apartado 1: Las clases deberán formar parte del paquete cuentas
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

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

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

