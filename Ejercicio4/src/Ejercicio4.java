package src;

public class Ejercicio4{

	int[] array = new int[10];

	public static void main(String args[]){
		Ejercicio4 nuevo = new Ejercicio4();
	}

	public Ejercicio4(){
		int mayor;

		for (int i =0;i<10 ;i++ ) {
			aleatorio(i);			
		}
		mayor = numeroMayor();

		for (int i =0;i<10 ;i++ ) {
			distancia(i,mayor);			
		}
		

	}

	public void aleatorio(int i){

		array[i]=(int)(Math.random()*100);
	}
	public int numeroMayor(){
		int mayor=0;
		for (int i =0;i<10 ;i++ ) {
			if (array[i]>mayor) {
			mayor = array[i];			
			}			
		}		
		return mayor;
	}
	public void distancia(int i, int mayor){

		int operacion=mayor - array[i];
		System.out.println("el numero "+array[i]+" esta a una distancia de "+operacion+"del # "+mayor);
	}

}