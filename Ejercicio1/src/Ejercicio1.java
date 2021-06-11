package src;
import java.util.*;
public class Ejercicio1{

	//metodo principal
	public static void main(String[] args){

		Ejercicio1 t = new Ejercicio1();
	}//fin metodo principal

	//global a mi clase Ejercicio1

	int[] elementos = new int[5];

	Scanner scanner = new Scanner(System.in);

	//fin declaracion variables globales

	//inicio constructor
	public Ejercicio1(){

		for(int i = 0 ; i<5; i++){

			pedirValor(i);
		}		

		for(int i = 0 ; i<5; i++){

			mostrarDato(i);
		}		
	}//fin constructor
	// metodo mostrar dato		
	public void mostrarDato(int numero){

		System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
	}//fin metodo mostrar dato	
	//metodo pedirValor
	public void pedirValor(int numero){

		System.out.print("Ingres el valor No. "+numero+": ");
		elementos[numero] = scanner.nextInt();
	}//fin metodo pedirValor
}