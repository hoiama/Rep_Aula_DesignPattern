package design_patterns.decorator;

public class ICS extends TemplateImposto {

	public ICS() {
		super();
	}
	
	public ICS(TemplateImposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public boolean condicaoMaximo(double valor) {
		return valor > 15000;
	}

	@Override
	public double maximo(double valor) {
		return valor * 0.20 + CalcularOutroImposto(valor);
	}

	@Override
	public double minimo(double valor) {
		return valor * 0.15 + CalcularOutroImposto(valor);
	}

}
