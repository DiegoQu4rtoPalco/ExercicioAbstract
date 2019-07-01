package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.pessoaFisica;
import entities.pessoaJuridica;

public class Program {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do imposto # " + i +" de renda");
			System.out.print("Fisica ou Juridica (f/j): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new pessoaFisica(name, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Numeros de empregados: ");
				int numeroFuncionario = sc.nextInt();
				list.add(new pessoaJuridica(name, rendaAnual, numeroFuncionario));
			}
		}
		
		System.out.println("");
		System.out.println("IMPOSTO PAGOS");
		double sum = 0.0;
		
		for( Contribuinte contri : list) {
			System.out.printf(contri.getName() + ": $ " + String.format("%.2f%n", contri.imposto()));
			sum += contri.imposto();
		}
		
		System.out.printf("TOTAL DE IMPOSTOS: $ %.2f", sum);
		
		
		sc.close();
	}

}
