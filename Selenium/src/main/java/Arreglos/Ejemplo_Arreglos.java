package Arreglos;

public class Ejemplo_Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarar array int de 2 formas
		int intArray[];
		int [] intArray2;
		
		//Declarar array de string
		String [] arr;
		//definir tamaño
		arr = new String [5];
		
		//asignar elemento
		arr[0] = "cero";
		arr[1] = "Uno ";
		arr[2] = "Dos";
		arr[3] = "Tres";
		arr[4] = "Cuatro";
		
		for(int i=0;i<arr.length;i++)
		System.out.println("Elemento en el indice "+(i+1)+" Es:" + arr[i]);
		
	}

}
