package design_patterns.decorator;

public class ICMS extends TemplateImposto {

	public ICMS() {
		super();
	}
	
	public ICMS (TemplateImposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public boolean condicaoMaximo(double valor) {
		return valor > 5000;
	}

	@Override
	public double maximo(double valor) {
		return valor * 0.10 + CalcularOutroImposto(valor);
	}

	@Override
	public double minimo(double valor) {
		return valor * 0.05 + CalcularOutroImposto(valor);
	}
}
