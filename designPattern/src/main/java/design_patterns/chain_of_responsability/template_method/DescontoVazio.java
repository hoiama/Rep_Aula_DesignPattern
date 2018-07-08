package design_patterns.chain_of_responsability.template_method;

public class DescontoVazio extends Template{

	@Override
	protected boolean condicao(double valor) {
		
		return false;
	}

	@Override
	protected double logica(double valor) {
		
		return 0;
	}

}
