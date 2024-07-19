/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       Double deposito,rendimento,total;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite o seu deposito");
	    Double deposito = sc.nextDouble();
	    Double rendimento = deposito*0.7;
	    Double total = deposito+rendimento;
        System.out.println("após um mes seu deposito estara no valor de: "+total);	    
	    }
		 
	}
