package src;
import java.util.*;
public class Ejercicio2{
	//metodo principal
	public static void main(String[] args){
		Ejercicio2 objeto = new Ejercicio2();
	}
		//global a mi clase Ejercicio1
		int[] elementos = new int[10];
		Scanner scanner = new Scanner(System.in);

	//constructor
	public Ejercicio2(){
		int mayor;

		for (int i=0;i<10 ; i++) {
			Number(i);	
		}
		mayor = numeroMayor();
			
		int repetido = mayorRepetido(mayor);
		System.out.println("el numero mayor "+mayor+" se repitio :"+repetido);
	}
	//metodo
	public void Number(int numero){
		elementos[numero] = (int)(Math.random()*100);
		System.out.println("numero randon "+(numero+1)+" es : "+elementos[numero]);				
	}
	//metodo
	public int numeroMayor(){
		int mayor=0;
		for (int i =0;i<10 ;i++ ) {
			if (elementos[i]>mayor) {
			mayor = elementos[i];			
			}			
		}		
		return mayor;
	}
	//metodo
	public int mayorRepetido(int mayor){
		int repetido=1;
		for (int i =0;i<10 ;i++ ) {
			if (repetido == mayor) {
				repetido ++;
			}
		}				
		return repetido;
	}
}	