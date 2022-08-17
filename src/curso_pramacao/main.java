package curso_pramacao;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Renda anual com salário: ");
		double salary = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço:");
		double serviceIncome = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital:");
		double capitalGain = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double medicalExpenses = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double educationalExpenses = sc.nextDouble();
		System.out.println("");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("");
		System.out.println("CONSOLIDADO DE RENDA:");
		
		double salaryTax;
		
		if ((salary/12) < 3000) {
			salaryTax = 0;
		}
		
		else if ((salary/12) < 5000){
			salaryTax = salary*0.1;
		}
		else {
			salaryTax = salary*0.2;
		}
		
		double serviceTax = serviceIncome * 0.15;
		
		sc.close();
		
		double capitalGainTax = capitalGain *0.2;
		
		double grossTax = salaryTax + serviceTax + capitalGainTax;
		

		double maxDeductible =  grossTax*0.3;
		double deductibleExpenses =  medicalExpenses + educationalExpenses;
		double rebate;
		
		if (maxDeductible < deductibleExpenses) {
			rebate = maxDeductible;
		}
		else {
			rebate = deductibleExpenses;
		}
		 double impostoDevido = grossTax - rebate;
		
		System.out.printf("Imposto sobre salário: %.2f%n",salaryTax);
		System.out.printf("Imposto sobre serviços: %.2f%n",serviceTax);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n",capitalGainTax);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n",maxDeductible);
		System.out.printf("Gastos dedutíveis: %.2f%n",deductibleExpenses);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n",grossTax);
		System.out.printf("Abatimento:: %.2f%n",rebate);
		System.out.printf("Imposto devido: %.2f%n ",impostoDevido);
		
		sc.close();
	}

}