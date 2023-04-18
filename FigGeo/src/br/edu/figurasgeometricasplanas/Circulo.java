package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Circulo {
	public double raio;
	public double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void CalcArea1() {
		System.out.println("Digite a medida do raio:");
		raio = sc.nextDouble();	
		area = 3.14 * Math.pow(raio, 2);
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println(raio + " " + area);
	}
	
}
