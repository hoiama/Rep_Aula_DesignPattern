package design_patterns.chain_of_responsability.template_method;

public class DescontoMaisCincoMil extends Template{

	@Override
	protected boolean condicao(double valor) {
		return valor > 5000 ;
	}

	@Override
	protected double logica(double valor) {
		return valor * 0.02;
	}

	
}
