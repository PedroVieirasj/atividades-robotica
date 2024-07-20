/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{   	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int soma;
		int v[] = new int[5];
		System.out.println("digite um valor");
		v[2] = sc.nextInt();
		System.out.println("digite outro valor");
		v[4] = sc.nextInt();
		soma = v[2]+v[4];
		System.out.printf("a soma dos dois valores é "+soma);
	}
}