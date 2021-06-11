package src;
import java.util.*;
public class Ejercicio5{

	int[] aray = new int[100];
	Scanner read = new Scanner(System.in);

	public static void main(String args[]){

		Ejercicio5 nuevo = new Ejercicio5();

	}

	public Ejercicio5(){

		int salir;

		do{		
			int totalNotas;

			totalNotas = ingresaDatos();

			notaMedia(totalNotas);
			System.out.println("1. salir  ");
			System.out.println("2. seguir ");
			salir = read.nextInt();
		}while(salir!=1);

	}

	public int ingresaDatos(){
		int i=0;


		do{
			i++;
			System.out.println("ingrese nota");
			aray[i]=read.nextInt();
			
		}while(aray[i]!=-50);

		return i;
	}

	public void notaMedia(int totalNotas){

		float media=0;
		float suma=0;

		if (totalNotas>0) {
			for (int i=0;i<totalNotas ;i++ ) {
				suma=suma+aray[i];			
			}			
			media=suma/(float)(totalNotas-1);
		}
		System.out.println("la media de notas es: "+media);

	}
}