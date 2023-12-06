package VariaveisEOperadores;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Qual o seu salário bruto?");
		salarioBruto = leia.nextFloat();
		System.out.println("Qual é o adicional noturno?");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Quantas horas extras?");
		horasExtras = leia.nextFloat();
		System.out.println("Qual os descontos?");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		
		System.out.println("O salário líquido é: R$ "+ salarioLiquido);
		
	}

}
