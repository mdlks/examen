package examen.ejercicio2;



public abstract class Empleados implements Pagos , Comparable<Empleados> 
{
	private String nombre;
	private String apellido;
	private String fechaContratacion; 
	private int numeroCuenta;
	private int salario;
	
	public Empleados(String nombre,String apellido,String fechaContratacion,int numeroCuenta,int salario) throws Exception
	{
		this.apellido=apellido;
		this.nombre=nombre;
		this.fechaContratacion=fechaContratacion;
		this.numeroCuenta=numeroCuenta;
		if (salario<0) {throw new Exception();}
		else {
			this.salario=salario;
		}
		
		
	}
	
	public void realizacionPagos() 
	{
		System.out.println("Pago Nómina "+ nombre + apellido);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public String toString() 
	{
		return nombre+ apellido;
	}
	
	final public int compareTo(Empleados emp) {
		int resultado=apellido.compareTo(emp.getApellido());
		if (resultado==0) {
			if (nombre.compareTo(emp.getNombre())==0) {
				resultado=0;
			}
			else if (nombre.compareTo(emp.getNombre())>0) {
				resultado=1;
			}
			else resultado=-1;
		}
		return resultado;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) throws Exception {
		if (salario<0) {throw new Exception();}
		else {
			this.salario=salario;
		}
	}
	
}