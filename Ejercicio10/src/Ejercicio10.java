package src;
import java.util.*;
public class Ejercicio10{

	Scanner read = new Scanner(System.in);
	int[][] matrizuno = new int[3][4];
	int[][] matrizdos = new int[4][3];


	public static void main(String args[]){

		Ejercicio10 nuevo = new Ejercicio10();
	}

	public Ejercicio10(){

		System.out.println("matriz");	
		llenarMatriz1();
		System.out.println("Transpuesta");
		llenarMatriz2();		
		
		
	}
		
	public void llenarMatriz1(){	

		for (int i=0;i<matrizuno.length ;i++ ) {			
			for (int j=0;j<matrizuno[i].length ;j++ ) {				
				matrizuno[i][j]=(int)(Math.random()*10);
				System.out.print("["+matrizuno[i][j]+"]");
			}
			System.out.println("");
		}
	}

	public void llenarMatriz2(){	
		for (int i=0;i<matrizdos.length ;i++ ) {			
			for (int j=0;j<matrizdos[i].length ;j++ ) {				
				matrizdos[i][j]=matrizuno[j][i];
				System.out.print("["+matrizdos[i][j]+"]");
			}		
			System.out.println("");
		}
	}

	
}