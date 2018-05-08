package paqTrabajo;

import java.util.Scanner;

public class Suma {

	private int num1, num2, total;
	
	Scanner teclado = new Scanner(System.in);
	
	
	Suma(){
		System.out.println("Datos para realizar una suma");/*nuevo syso*/
		System.out.println("Introduce un número");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro número");
		num2 = teclado.nextInt();
		total = num1+num2;
	}
	
	public void visualizar(){
		System.out.println("El usuario dos (Iluntze) hace un commmit and push pero el archivo no esta actualizado");
		System.out.println("El usuario1 (allende) hace un commit and push");
		System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es de: " + total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Suma obj = new Suma();
		
		NuevaClase3 obj2= new NuevaClase3();
		obj.visualizar();
		obj2.metodo2();
	}

}
