package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;
import br.edu.figurasgeometricasespaciais.*;
import java.util.Scanner;

public class Principal {
		
	public static void main(String[] args) {
		
		int escolha;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Deseja fazer cálculo de uma figura plana (P) ou espacial(E)?");
	    escolha = sc.nextInt();
	
		
		if (escolha == 1) {
			Triangulo objTrian = new Triangulo();
		
			objTrian.calcArea1();
			
			Quadrado objQuad = new Quadrado();
			
			objQuad.CalcArea1();
			
            Circulo objCirc = new Circulo();
			
			objCirc.CalcArea1();
			
            Trapezio objTrap = new Trapezio();
			
			objTrap.CalcArea1();
			
			Paralelogramo objParalel = new Paralelogramo();
				
		    objParalel.CalcArea1();
				
		    Losango objLosan = new Losango();
					
			objLosan.CalcArea1();
					
		    Retangulo objRetan = new Retangulo();
			
			objRetan.CalcArea1();
			
		}
		
		if (escolha == 2) {
			
			Cubo objCubo = new Cubo();
			
			objCubo.CalcAreaLateral();
			objCubo.CalcAreaTotal();
			objCubo.CalcVolume();
			
			Prisma objPrism = new Prisma();
			
			objPrism.calcAreaBase();
			objPrism.calcAreaFace();
			objPrism.calcAreaLateral();
			objPrism.calcAreaTotal();
			objPrism.calcVolume();
			
			Esfera objEsfera = new Esfera();
			
			objEsfera.calcAreaTotal();
			objEsfera.calcVolume();
			
            Cilindro objCilin = new Cilindro();
			
			objCilin.calcAreaLateral();
			objCilin.calcAreaTotal();
			objCilin.calcVolume();
			
		}	
		
		
			
	}

}
