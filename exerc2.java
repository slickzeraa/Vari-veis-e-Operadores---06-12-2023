package VariaveisEOperadores;
import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite sua primeira nota:");
		n1 = leia.nextFloat();
		System.out.println("Digite sua segunda nota:");
		n2 = leia.nextFloat();
		System.out.println("Digite sua terceira nota:");
		n3 = leia.nextFloat();
		System.out.println("Digite sua quarta nota:");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Sua média é: "+ media);
		
	}

}
