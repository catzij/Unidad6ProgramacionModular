package src;

public class Ejercicio7{

	int[][] array = new int[4][3];

	public static void main(String args[]){
		Ejercicio7 nuevo = new Ejercicio7();

	}

	public Ejercicio7(){
		System.out.println("matriz");
		llenarMatriz();
		System.out.println("culumna par");
		mostrar();
		
	}

	public void llenarMatriz(){	

		for (int i=0;i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				array[i][j]=(int)(Math.random()*555);
				System.out.print("["+array[i][j]+"]");				
			}			
			System.out.println("");
		}
	}	

	public void mostrar(){

		int suma = 0;

		for (int i=0;i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				if (j==0) {
					
				}else if (j%2==0) {
					
				}else {
					System.out.print("["+(array[i][j])+"]");
					suma = suma +array[i][j];
				}
				
			}			
			System.out.println("");
		}
			System.out.println("la summa es "+suma);
	}
}