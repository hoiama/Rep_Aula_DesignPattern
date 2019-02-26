package design_patterns.template_method;

public abstract class Template {
	
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
