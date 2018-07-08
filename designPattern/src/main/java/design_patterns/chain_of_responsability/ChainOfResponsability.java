package design_patterns.chain_of_responsability;

public class ChainOfResponsability {

	public static void main(String[] args) {
		/**
		 * @TESTES DE CHAIN OF RESPONSABILITY
		 */		
		System.out.println("INICIANDO TESTE DE: CHAIN OF RESPONSABILITY ");
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		System.out.println("Desconto é de :" + calculadora.calcular(3000));
		System.out.println("FINALIZANDO TESTE DE: CHAIN OF RESPONSABILITY \n");
		
		

	}

}
