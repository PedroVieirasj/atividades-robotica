/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       double fabrica,fina,imposto,revenda ;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("informe o custo de fabrica do veiculo");
	    double fabrica = sc.nextDouble();
	    double imposto = fabrica*0.45;
	    double revenda = fabrica*0.20;
	    double fina = fabrica+imposto+revenda;
	    System.out.println("o valor final do veiculo com os impostos é: $"+fina);
	    
	    
	    }
	    
	    
	    
	    
	    
	    
}
