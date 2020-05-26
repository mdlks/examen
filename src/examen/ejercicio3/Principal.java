package examen.ejercicio3;

import java.util.ArrayList;

import examen.ejercicio3.Asalariados;
import examen.ejercicio3.Contratistas;
import examen.ejercicio3.EmpresaServicios;
import examen.ejercicio3.Pagos;
import examen.ejercicio3.SociedadAnonima;
import examen.ejercicio3.Empleados;

public class Principal {
	Asalariados asal1= new Asalariados(" juan ", " garcia ", " 12-10-2020 ",5673543,1000, 1);
	Contratistas contr1=new Contratistas(" pepe ", " romero ", " 11-08-2020 ",1234567, 1000);
	//contr1.setSociedades(new SociedadAnonima(" limpia.S.A ", " limpieza "));
	EmpresaServicios empr1=new EmpresaServicios(" ktering.Servicios ", " Catering ", 7654321,1000);
	
	ArrayList<Pagos>conjunto=new ArrayList<>();
	conjunto.add(asal1);
	conjunto.add(empr1);
	conjunto.add(contr1);
	
	for(Pagos elemento:conjunto)
	{
		System.out.println(conjunto.toString());
	}
	
	System.out.println(conjunto);
	
	
	
	
	
}
