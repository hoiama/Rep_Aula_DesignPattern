package design_patterns.chain_of_responsability.template_method;

public class CalculadoraDesconto  {

	public double calcular(double valor) {
		Template descontoMaiorDoisMil = new DescontoMaisDoisMil();
		Template descontoMaiorCincoMil = new DescontoMaisCincoMil();
		Template descontoVazio = new DescontoVazio();
		
		descontoMaiorDoisMil.setProximoDescontoClass(descontoMaiorCincoMil);
		descontoMaiorCincoMil.setProximoDescontoClass(descontoVazio);
		
		return descontoMaiorDoisMil.desconto(valor);
	}
}
