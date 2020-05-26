package examen.ejercicio2;

import java.util.ArrayList;

import examen.ejercicio2.EmpresaServicios;
import examen.ejercicio2.Pagos;

public class Contratistas extends Empleados 
{
	private ArrayList<SociedadAnonima>sociedades=new ArrayList<>();
	
	public Contratistas(String nombre,String apellido,String fechaContratacion,int numeroCuenta,int salario) throws Exception 
	{
		super(nombre, apellido, fechaContratacion, numeroCuenta, salario);
		
	}

	public void setSociedades(SociedadAnonima sociedades) {
		this.sociedades.add(sociedades);
	}
	
	public void realizacionPagos() 
	{
		System.out.println("Pago a Contratista "+ super.getNombre() );
		
	}
	
	public String toString() 
	{
		return super.getNombre()+ super.getApellido();
	}

}	

	
	