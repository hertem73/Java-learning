package ders2;

import java.util.Scanner;

public class FoorLoop8 {

	public static void main(String[] args) {
		// Kullan�cadan bir String isteyin ve Stringi terse �eviren bir method yaz�n

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen tersinden yazd�racak bir yaz� giriniz.");
		String str=scan.nextLine();
		
		System.out.println(tersineCevir(str));
		
			scan.close();
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for ( int i = str.length()-1; i >=0; i--)  {
			
	
			
			tersStr+=str.substring(i, i+1);
			
		}
		
				
			return tersStr;
		}
		
				
	}
	


