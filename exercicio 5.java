/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       float valor;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite um valor entre 100 e 200");
	    float valor = sc.nextFloat();
	    if (valor>100 && valor<200){
	        System.out.println("o valor esta entre 100 e 200");
	    }
	    else{
	        System.out.println("o valor nao esta entre 100 e 200");
	    }
	    
	    }
		 
	}
