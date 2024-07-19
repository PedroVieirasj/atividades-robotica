/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       int idade;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite sua idade");
	    int idade = sc.nextInt();
	    if (idade>=18){
	        System.out.println("voce é maior de idade");
	    }
	    else{
	        System.out.println("voce é menor de idade");
	    }
	    }
		 
	}
