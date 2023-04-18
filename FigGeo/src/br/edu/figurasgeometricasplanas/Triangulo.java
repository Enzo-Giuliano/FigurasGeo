package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Triangulo {
   
	public double base;
	public double altura;
	public double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void calcArea1() {
		System.out.println("Digite a medida da base: ");
		base = sc.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = sc.nextDouble();
		area = (base * altura)/2;
	    System.out.println("ÁREA = " + area);
	}
	
	public void calcArea2(double h, double b) {
		base = b;
		altura = h;
		area = (base * altura)/2;
		System.out.println(area);
	}
	
	public double calcArea3(double h, double b) {
		base = b;
		altura = h;
		area = (base * altura)/2;
		return area;
	}
	

	public void listaAtributos() {
		System.out.println(base + " " + altura);
	
	}
}
