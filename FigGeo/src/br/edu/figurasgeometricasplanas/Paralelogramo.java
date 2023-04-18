package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Paralelogramo {

	Scanner sc = new Scanner(System.in);
	
	public double base;
	public double altura;
    public double area;
	
	public void CalcArea1() {
		System.out.println("Digite a medida da base:");
		base = sc.nextDouble();
		System.out.println("Digite a medida da altura:");
		altura = sc.nextDouble();
		area = base * altura;
		System.out.println(area);
	}
	
	public void CalcArea2(double b, double h) {
		base = b;
		altura = h;
		area = b * h;
		System.out.println(area);
	}
	public double CalcArea3(double b, double h) {
		base = b;
		altura = h;
		area = b * h;
		return area;
	}
	public void listaAtributos() {
		System.out.println(base + " " + altura + " " + area);
	
	}
	
}
