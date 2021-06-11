package src;
import java.util.*;
public class Ejercicio8{

	Scanner read = new Scanner(System.in);
	String[] array = new String[5];
	String[] cadenas2 = new String[5];

	public static void main(String args[]){

		Ejercicio8 nuevo = new Ejercicio8();
	}

	public Ejercicio8(){
		llenarMatriz1();
		llenarMatriz2();
		System.out.println("matriz1");	
		mostrar1();
		System.out.println("matriz2");
		mostrar2();
		System.out.println("");
		comparacion();
	}

	public void llenarMatriz1(){	
		for (int i=0;i<array.length ;i++ ) {			
				System.out.println("ingrese palabra ["+i+"]");				
				array[i]=read.nextLine();													
		}
	}

	public void llenarMatriz2(){	
		for (int i=0;i<cadenas2.length ;i++ ) {			
				System.out.println("ingrese palabra ["+i+"]");				
				cadenas2[i]=read.nextLine();														
		}
	}	

	public void mostrar1(){		
		for (int i=0;i<array.length ;i++ ) {			
				System.out.print("["+array[i]+"]");					
		}
	}

	public void mostrar2(){		
		for (int i=0;i<cadenas2.length ;i++ ) {			
				System.out.print("["+cadenas2[i]+"]");					
		}
	}

	public void comparacion(){		
			if (array[0].equals(cadenas2[0])) {
			System.out.println("son iguales");						
			
		}

	}
}