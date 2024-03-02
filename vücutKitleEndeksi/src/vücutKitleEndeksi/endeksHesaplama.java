package vücutKitleEndeksi;

import java.util.Scanner;


public class endeksHesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double kilo,boy;
		
		System.out.print("Enter your height :");
        boy = input.nextDouble();
        
        System.out.print("Enter your weight :");
        kilo = input.nextDouble();
        
        
        double indeks = (kilo / (boy * boy));
        
        System.out.println("Your body mass index :" + indeks + "!");
        
        if(indeks <= 18.4) {
        	System.out.print("Your are weak !");
        }
        
        else if(indeks >= 18.5 && indeks <= 24.9) {
        	System.out.print("You are ideal !");
        }
        
        else if(indeks >= 25 && indeks <= 29.9) {
        	System.out.print("You are fat !");
        }
        
        else if(indeks >= 30 && indeks <= 34.9) {
        	System.out.print("You are obese !");
        }
        
        else {
        	 
        System.out.print("You are extremly obese !!");
        }
	
	}

}
