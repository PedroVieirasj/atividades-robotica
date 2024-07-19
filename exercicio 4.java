/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       float um,dois;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite um valor");
	    float um = sc.nextFloat();
	    System.out.println("digite outro valor");
	    float dois = sc.nextFloat();
	    if (um>dois){
	        System.out.println(um+" é o maior valor");
	    }
	    else if(dois>um){
	        System.out.println(dois+" é o maior valor");
	    }
	    else{
	        System.out.println("o valor é igual");
	    }
		 
	}
}