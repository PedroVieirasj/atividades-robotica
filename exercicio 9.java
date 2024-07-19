/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       String nome;
        double fixo,vendas,sfinal,poncenta;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite o nome do funcionario");
	    String nome = sc.nextLine();
	    System.out.println("qual é o salario fixo desse funcionario");
	    Double fixo = sc.nextDouble();
	    System.out.println("qual foi o total de vendas desse funcionario no mes");
	    Double vendas = sc.nextDouble();
	    Double porcenta = vendas*0.10;
	    Double sfinal = porcenta+fixo;
	    System.out.println("o salario final do funcionario: "+nome+" é: R$"+sfinal);
	    
	    
	    
	    
	   } 
}
