package design_patterns.decorator;

public abstract class TemplateImposto {
	
	private TemplateImposto outroImposto;
	public TemplateImposto() {
		outroImposto = null;
	}
	
	public TemplateImposto(TemplateImposto outroImposto) {
		this.outroImposto =  outroImposto;
	}

	public double CalcularOutroImposto (double valor) {

		if(outroImposto == null) {
			return 0;

		}else {
			return outroImposto.calcular(valor);	
		}
	}
	
	public double calcular(double valor) {

		if(condicaoMaximo(valor)) {
			return maximo(valor);

		}else {
			return minimo(valor);
		}
	}
	
	protected abstract boolean condicaoMaximo(double valor);
	protected abstract double maximo(double valor);
	protected abstract double minimo(double valor);
}
