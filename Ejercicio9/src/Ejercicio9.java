package src;
import java.util.*;
public class Ejercicio9{

	Scanner read = new Scanner(System.in);
	int[][] matrizuno = new int[2][2];
	int[][] matrizdos = new int[2][2];
	int[][] suma = new int[2][2];

	public static void main(String args[]){

		Ejercicio9 nuevo = new Ejercicio9();
	}

	public Ejercicio9(){


		System.out.println("matriz1");	
		llenarMatriz1();
		System.out.println("matriz2");
		llenarMatriz2();
		
		
		
		
		System.out.println("suma delas dos matrices");
		operacion();
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
				matrizdos[i][j]=(int)(Math.random()*10);
				System.out.print("["+matrizdos[i][j]+"]");
			}		
			System.out.println("");
		}
	}

	public void operacion(){	
		for (int i=0;i<suma.length ;i++ ) {
			for (int j=0;j<suma[i].length ;j++ ) {	
				suma[i][j]=matrizdos[i][j]+matrizuno[i][j];
				System.out.print("["+suma[i][j]+"]");
			}
			System.out.println("");
		}
	}
}