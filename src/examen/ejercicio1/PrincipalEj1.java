package examen.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class PrincipalEj1 {

	public static void main(String[] args) {
		
		try
		{
			File fil=new File("/home/m_dlks/Escritorio/examen.txt");
			FileReader fib=new FileReader(fil);
	
			BufferedReader br=new BufferedReader(fib);
			String linea;
			linea=br.readLine();
			TreeSet<String> compuestos= new TreeSet<>();
			Set<String>elementos=new HashSet<>();
			String[] palabras;
			String[] quimicos;
			String linea2;
			while (linea!=null)
			{
				compuestos.add(linea);
				palabras=linea.split(":");
				if(palabras.length>1) {
					//linea2=palabras[1];
					quimicos=palabras[1].split(" ");
					System.out.println(palabras[1]);
					for(int i=0;i<quimicos.length;i++)
					{
						if(!elementos.contains(quimicos[i])) {
							elementos.add(quimicos[i]);
						}
					}
				}
				
				linea=br.readLine();
				
			}
			
			for(String cadena:compuestos)
			{
				System.out.println(cadena);
			}
			
			System.out.println("---------------");
			
			compuestos.forEach(nombre->System.out.println(nombre));
			
			System.out.println("---------------");
			
			Iterator <String>i = compuestos.iterator();
				while(i.hasNext())
			{
				String nombre = i.next();
				System.out.println(nombre);
			}
				System.out.println("---------------");
				
				for(String cadena:elementos)
				{
					System.out.println(cadena);
				}
			
			fib.close();
			
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		
		

	}

}
