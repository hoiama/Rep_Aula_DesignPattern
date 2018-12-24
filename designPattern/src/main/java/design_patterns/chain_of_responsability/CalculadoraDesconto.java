package design_patterns.chain_of_responsability;

public class CalculadoraDesconto  {

	public double calcular(double valor) {
		Desconto descontoMaiorCincoMil = new DescontoMaisCincoMil();
		Desconto descontoVazio = new DescontoVazio();
		Desconto descontoMaiorDoisMil = new DescontoMaisDoisMil();

		descontoMaiorDoisMil.setProximoDescontoClass(descontoMaiorCincoMil);
		descontoMaiorCincoMil.setProximoDescontoClass(descontoVazio);
		
		return descontoMaiorDoisMil.desconto(valor);
	}
}
