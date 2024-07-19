/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{       int mes;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("digite o numero de um mes");
	    int mes = sc.nextInt();
	    switch (mes){
	    case 1:
	        System.out.println("o mes é janeiro");
	    break;
	    case 2:
	        System.out.println("o mes é fevereiro");
	    break;
	    case 3:
	        System.out.println("o mes é março");
	    break;
	    case 4:
	        System.out.println("o mes é abril");
	    break;
	    case 5:
	        System.out.println("o mes é maio");
	    break;
	    case 6:
	        System.out.println("o mes é junho");
	    break;
	    case 7:
	        System.out.println("o mes é julho");
	    break;
	    case 8:
	        System.out.println("o mes é agosto");
	    break;
	    case 9:
	        System.out.println("o mes é setembro");
	    break;
	    case 10:
	        System.out.println("o mes é outubro");
	    break;
	    case 11:
	        System.out.println("o mes é novembro");
	    case 12:
	        System.out.println("o mes é dezembro");
	    break;
	    default:
	    System.out.println("esse mes nao existe");
	    
	    }
	} 
	}
