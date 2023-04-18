package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Losango {

	Scanner sc = new Scanner(System.in);
	
	public double diagonalMaior;
	public double diagonalMenor;
	public double area;
	
	public void CalcArea1() {
		System.out.println("Digite a medida da diagonal maior:");
		diagonalMaior = sc.nextDouble();
		System.out.println("Digite a medida da altura:");
		diagonalMenor = sc.nextDouble();		
		area = diagonalMaior * diagonalMenor/2;
		System.out.println(area);
	}
	
	public void CalcArea2(double D, double d) {
		diagonalMaior = D;
		diagonalMenor = d;
		area = diagonalMaior * diagonalMenor/2;
		System.out.println(area);
	}
	public double CalcArea3(double D, double d) {
		diagonalMaior = D;
		diagonalMenor = d;
		area = diagonalMaior * diagonalMenor/2;
		return area;
	}
	
	
	public void listaAtributos() {
		System.out.println(diagonalMaior + " " + diagonalMenor + " " + area);
	
	}
	
}
