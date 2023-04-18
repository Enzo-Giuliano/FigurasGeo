package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Retangulo {
  
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
	
	
}
