package examen.ejercicio2;

import examen.ejercicio2.EmpresaServicios;
import examen.ejercicio2.Pagos;

public class EmpresaServicios implements Pagos , Comparable<EmpresaServicios>
{

	private String nombre;
	private String tipoServicio;
	private int numeroCuenta;
	private int importeMensual;
	
	public EmpresaServicios(String nombre, String tipoServicio, int numeroCuenta, int importeMensual) throws Exception 
	{
		
		this.nombre=nombre;
		this.numeroCuenta=numeroCuenta;
		this.tipoServicio=tipoServicio;
		if (importeMensual<0) {throw new Exception();}
		else {
			this.importeMensual=importeMensual;
		}
	
	}

	public void realizacionPagos() 
	{
		System.out.println("Pago por servicios. "+ nombre + tipoServicio);
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	@Override
	public int compareTo(EmpresaServicios o) {
	
		return 0;
	}
	
	public String toString() 
	{
		return nombre+ tipoServicio;
	}

	public int getImporteMensual() {
		return importeMensual;
	}

	public void setImporteMensual(int importeMensual) throws Exception {
		if (importeMensual<0) {throw new Exception();}
		else {
			this.importeMensual=importeMensual;
		}
	}

	
	
}
