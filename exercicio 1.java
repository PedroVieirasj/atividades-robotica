/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{   float gasolina,distancia,media;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("digite a distancia percorrida");
		float distancia = sc.nextFloat();
		System.out.println("digite a gasolina gasta");
		float gasolina = sc.nextFloat();
		float media = (distancia /gasolina);
		System.out.println("o consumo medio de combustivel do seu veiculo é: "+ media);
		
	}
}