package design_patterns.template_method;

import design_patterns.decorator.ICMS;
import design_patterns.decorator.ICS;
import design_patterns.decorator.TemplateImposto;

public class TemplateMethod {
	
	public static void main(String[] args) {

		/**
		 * TESTES TEMPLATE METHOD
		 */
		System.out.println("INICIANDO TESTE DE: TEMPLATE METHOD ");
		TemplateImposto impostoICMS =  new ICMS();
		TemplateImposto impostoICS = new ICS();
		double valor = 10000;
		System.out.println("Imposto de ICMS é de : " + impostoICMS.calcular(valor));
		System.out.println("Imposto de ICS  é de : " + impostoICS.calcular(valor));
		System.out.println("FINALIZANDO TESTE DE: TEMPLATE METHOD\n");
	}
}
