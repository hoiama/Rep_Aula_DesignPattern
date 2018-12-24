package design_patterns.decorator;

public class Decorator {

	public static void main (String[] args) {

		/**
		 * DECORATOR
		 */
		System.out.println("INICIANDO TESTE DE: DECORATOR");
		
		double valor = 10000;
		TemplateImposto impostoICMSdecorator =  new ICMS();
		TemplateImposto impostoICSdecorator = new ICS();
		TemplateImposto impostoICMScomICS =  new ICMS(new ICS());
		TemplateImposto impostoSCScomICMS = new ICS(new ICMS());
		TemplateImposto impostoSCScom_ICMScomICS = new ICS(new ICMS(new ICS()));
		
		System.out.println("Imposto de ICMS é de : " + impostoICMSdecorator.calcular(valor));
		System.out.println("Imposto de ICS  é de : " + impostoICSdecorator.calcular(valor));
		System.out.println("Imposto ICMS + ICS é de " +  impostoICMScomICS.calcular(valor));
		System.out.println("Imposto ICS + ICMS é de " +  impostoSCScomICMS.calcular(valor));
		System.out.println("Imposto ICS + (ICMS+ICS) é de " +  impostoSCScom_ICMScomICS.calcular(valor));
		System.out.println("FINALIZANDO TESTE DE: DECORATOR\n");
	}
}
