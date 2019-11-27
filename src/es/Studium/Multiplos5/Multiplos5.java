package es.Studium.Multiplos5;

import java.util.Scanner;

public class Multiplos5 {

	public static void main(String[] args) {
		
    int numero1, numero2, i;
    
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dime el primer número:");
	 numero1= teclado.nextInt();
	

	 System.out.println("Dame el segundo número:");
	 numero2= teclado.nextInt();
	  teclado.close();
	  
	if (numero1<numero2)
	{  for(i=numero1; i < numero2; i++)
			 {if(i%5==0)
			 {
				 System.out.println(i);
				 }
			 }
	}
	else
	{	 if(numero1>=numero2)
				 
					 System.out.println("Error");
				 

	
}
	}
}

