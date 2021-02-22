/**
 * 
 */
package net.tecgurus;

import java.util.Scanner;

/**
 * @author Cesar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa la tabla de multiplicar que quieres mostrar: ");
		int tabla = teclado.nextInt();
		for(int i = 0; i <= 10; i++){
			System.out.println(tabla + " * " + i + "= " + multiplicar(tabla, i));
		}
		
	}
	
	public static int multiplicar(int a, int b){
		return a * b;
	}
}