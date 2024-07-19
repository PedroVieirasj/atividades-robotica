/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       float horas;
        int nivel;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite as horas trabalhadas do professor");
	    float horas = sc.nextFloat();
	    System.out.println("informe o nivel do professor");
	    int nivel = sc.nextInt();
	    switch (nivel){
	        case 1:
	            System.out.println("o salario do professor nivel um é: "+horas*25);
	        break;
	        case 2:
	            System.out.println("o salario do professor nivel 2 é: "+horas*30);
	        break;
	        case 3:
	            System.out.println("o salario do professor nivel 3 é: "+horas*38);
	        break;
	        default:
	            System.out.println("o nivel informado nao é um nivel valido");
	        break;
	    }
	    
	    
	    
	    
	    
	   } 
}
