package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Trapezio {
	
	public double baseMaior;
	public double baseMenor;
	public double altura;
	public double area;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void CalcArea1() {
		System.out.println("Digite a medida da base menor:");
		baseMenor = sc.nextDouble();
		System.out.println("Digite a medida da base maior:");
		baseMaior = sc.nextDouble();
		System.out.println("Digite a medida da altura:");
		altura = sc.nextDouble();
		area = (baseMenor + baseMaior) * altura/2;
		System.out.println(area);
	}
	
	public void CalcArea2(double B, double b, double h) {
		baseMaior = B;
		baseMenor = b;
		altura = h;
		area = (baseMenor + baseMaior) * altura/2;
		System.out.println(area);
	}
	public double CalcArea3(double B, double b, double h) {
		baseMaior = B;
		baseMenor = b;
		altura = h;
		area = (baseMenor + baseMaior) * altura/2;
		return area;
	}
	public void listaAtributos() {
		System.out.println(baseMaior + " " + baseMenor + " " + altura + " " + area);
	
	}
	
}
