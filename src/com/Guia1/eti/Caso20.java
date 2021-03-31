package com.Guia1.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de venta................ :");
		float vn = sc.nextFloat();
		
		float aumentado = vn * 1.42f;
		
		System.out.println("\n-----------------RESULTADOS---------------");
		System.out.println("El valor de venta incrementado en 42 % es de " + aumentado);
		
		

	}

}
