package VariaveisEOperadores;
import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário:");
		salario = leia.nextFloat();
		System.out.println("Digite o abono:");
		abono = leia.nextFloat();
		novoSalario = salario + abono;
		System.out.println("O seu novo salário é: "+ novoSalario);
	}

}
