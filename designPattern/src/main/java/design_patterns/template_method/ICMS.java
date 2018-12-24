package design_patterns.template_method;

public class ICMS extends Template {

	@Override
	public boolean condicaoMaximo(double valor) {
		return valor > 5000;
	}

	@Override
	public double maximo(double valor) {
		return valor * 0.10;
	}

	@Override
	public double minimo(double valor) {
		return valor * 0.05;
	}
}
