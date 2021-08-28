package Condicionales;

import java.util.Scanner;

public class Ejemplo_If {

	public static void main(String[] args) {
		
		Scanner entrada;	

		entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		int i= 10;
		int pesomanuel;
		float alturamanuel;
		
		System.out.print("Ingrese su peso Manuel: "); 
		
		
		pesomanuel = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Ingrese su altura Manuel en Cm: "); 
		
		
		alturamanuel = Integer.parseInt(entrada.nextLine());
		if (pesomanuel>95) {
			
			if (alturamanuel>195) {
				System.out.println("No es manuel Sino Gordanuel");
			}else {
				System.out.println("Es una Enana Gorda");
			}
						
		}else {
			System.out.println("La estupida adelgazó");
		}
		
		
		
		
		/*String paredes="Regay";
		
		
		if (paredes=="Regay") {
			
			System.out.print("Paredes es: "+paredes);
		}
		else {
			
			System.out.print("Paredes me la chupa igual");
		
		if (i < 15) {
			
			System.out.print("Paredes me la chupa");
		}else {
			
			System.out.print("Paredes me la chupa igual");
		}*/

	}

}

