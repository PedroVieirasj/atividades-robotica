/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       double cel,f,k,re,ra;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("converter temperatura de celsius para outras.");
	    System.out.println("digite a temperatura em celsius");
	    double cel = sc.nextDouble();
	    double f = cel*1.8+32;
	    double k = cel+273.15;
	    double re = cel*0.8;
	    double ra = f+459.67;
	    System.out.println("a temperatura em Fahrenheit é: "+f);
	    System.out.println("a temperatura em Kelvin é: "+k);
	    System.out.println("a temperatura em Réamur é: "+re);
	    System.out.println("a temperatura em Rankine é: "+ra);
	    }
	    
	    
	    
	    
	    
	    
}
