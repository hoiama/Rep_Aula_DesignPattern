package design_patterns.chain_of_responsability.template_method;

public class DescontoMaisDoisMil extends Template{

	@Override
	protected boolean condicao(double valor) {
		return valor > 2000 && valor < 5000;
	}

	@Override
	protected double logica(double valor) {
		return valor * 0.05;
	}

}
