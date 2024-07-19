/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{   float primeiro,segundo,media;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite a nota do primeiro bimestre");
	    float primeiro = sc.nextFloat();
	    System.out.println("digite a nota do segundo bimestre");
	    float segundo = sc.nextFloat();
	    float media = (primeiro+segundo)/2;
	    if (media >= 7){
	        System.out.println("aprovado");
	    }
	    else if (media < 4){
	        System.out.println("reprovado");
	    }
	    else{
	        System.out.println("recuperacao");
	    }
	    
		
	}
}