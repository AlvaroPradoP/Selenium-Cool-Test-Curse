package Arreglos;

public class Ejemplo_Arreglo2dimensiones {
	
	public static void main(String[] args) {
		
		//Ejemplo arreglo 1 dimension.
		int [] intArray = new int[] {1,2,3,4,5};
		
		//Ejemplo arreglo 2 dimensiones.
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9,10}};
		
		
		for (int i=0; i< arr.length;i++) {
			
			for (int j=0; j< arr[j].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
