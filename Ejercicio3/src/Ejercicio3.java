package src;
import java.util.*;
public class Ejercicio3{

	//variable globales
	Scanner read = new Scanner(System.in);
	int[] numero = new int[8];

	public static void main(String args[]){

		Ejercicio3 nuevo = new Ejercicio3();
	}

	public Ejercicio3(){
		int buscar=0;
		boolean encontrado;

		for (int i=0;i<8 ;i++ ) {
			numerosAletorios(i);
		}
					
		System.out.println("que numero quiere buscar");
		buscar=read.nextInt();

		encontrado=buscarNumero(buscar);

		if (encontrado == true) {
			System.out.println("El numero "+buscar+" se encontro");
		}else{
			System.out.println("El numero "+buscar+" no se encontro");
		}

	}

	public void numerosAletorios(int i){
		
			numero[i] = (int)(Math.random()*10);
			System.out.println("numero "+(i+1)+": "+numero[i]);		
	}

	public boolean buscarNumero(int buscar){
		boolean encontrado=false;

		for (int i =0;i<8 ;i++ ) {
			if (buscar==numero[i]) {
				encontrado = true;			
			}			
		}
		
		return encontrado;
	}
}