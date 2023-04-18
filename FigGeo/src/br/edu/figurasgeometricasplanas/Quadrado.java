package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Quadrado {
    
	public double lado;
	public double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void CalcArea1() {
		System.out.println("Digite a medida do lado:");
		lado = sc.nextDouble();
		area = Math.pow(lado, 2);
		System.out.println("ÁREA = " + area);
	}
	
	public void CalcArea2(double l) {
		lado = l;
		area = l * l;
		System.out.println(area);
	}
	
	public double CalcArea3(double l) {
		lado = l;
		area = l * l;
		return area;
	}
	public void listaAtributos() {
		System.out.println(lado);
	}
		
}
