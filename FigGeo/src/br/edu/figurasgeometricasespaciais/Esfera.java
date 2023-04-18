package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

public class Esfera {

	Scanner sc = new Scanner(System.in);
	
	public double raio;
	public double area;
	public double volume;
	
	public void calcAreaTotal() {
		area = 4 * 3.14 * Math.pow(raio, 2);
		System.out.println("ÁREA = " + area);
	}
	public void calcVolume() {
		volume = 4/3 * 3.14 * Math.pow(raio, 3);
		System.out.println("VOLUME = " + volume);
	}
}
