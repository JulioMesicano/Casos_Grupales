package com.Guia1.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Ingrese el radio del circulo ......:");
		float radio = sc.nextInt();
		
		
		float rc = (int) Math.pow(radio,2);
		float area = 3.1416f * rc;
		float perimetro= 2*3.1416f*radio;
		
		
		System.out.println("\n--------------RESULTADOS--------------");
		System.out.println("El area del circulo es..........:" + df.format(area));
		System.out.println("El perimetro del circulo es.....:" + df.format(perimetro));
		
		
		
		

	}

}