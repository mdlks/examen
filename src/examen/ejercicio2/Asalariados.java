package examen.ejercicio2;

import examen.ejercicio2.EmpresaServicios;
import examen.ejercicio2.Pagos;

public class Asalariados extends Empleados 
	{
	private int departamento;

		public Asalariados(String nombre,String apellido,String fechaContratacion,int numeroCuenta,int salario, int departamento) throws Exception {
			super( nombre, apellido, fechaContratacion, numeroCuenta, salario);
			this.departamento=departamento;
			
		}

		public void realizacionPagos() 
		{
			System.out.println("Pago nomina "+ super.getNombre() );
			
		}

		public String toString() 
		{
			return super.getNombre()+ super.getApellido()+departamento;
		}

		

		
		
	}


