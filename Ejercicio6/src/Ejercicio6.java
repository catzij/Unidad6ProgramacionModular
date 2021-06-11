package src;

public class Ejercicio6{

	int[][] array = new int[3][3];

	public static void main(String args[]){
		Ejercicio6 nuevo = new Ejercicio6();

	}

	public Ejercicio6(){
		System.out.println("matriz");
		llenarMatriz();
	
		System.out.println("matriz multiplicada * 2");
		mostrar();
	}

	public void llenarMatriz(){

		int [][]array ={{5,6,13},{14,2,4},{21,7,6}};

		for (int i=0;i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print("["+array[i][j]+"]");
				
			}			
			System.out.println("");
		}
	}	

	public void mostrar(){

		int [][]array ={{5,6,13},{14,2,4},{21,7,6}};

		for (int i=0;i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print("["+(array[i][j]*2)+"]");
				
			}			
			System.out.println("");
		}
	}
}