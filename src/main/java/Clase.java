
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarde
 */
public class Clase {
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner (System.in);
		int a;
		int numero;
		
		
		ArrayList<Integer> MiArrayList = new ArrayList<Integer>();
		
		
		
		for(a=1;a<=10;a++) {
			
		System.out.println("Introduzca un número");
		numero=entrada.nextInt();
		MiArrayList.add(numero);
		}
		
		System.out.println(MiArrayList);
	
		
		
		
	}
}