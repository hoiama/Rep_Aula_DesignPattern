package design_patterns.chain_of_responsability.template_method;

public abstract class Template implements Desconto{
	Desconto proximaClass;
	
	public Double desconto(double valor) {
		if(condicao(valor)) {
			return logica(valor);
		}else{
			return proximaClass.desconto(valor);
			}
	}

	public void setProximoDescontoClass(Desconto proximoClass) {
		this.proximaClass = proximoClass;
	}
	
	protected abstract boolean condicao(double valor);
	protected abstract double logica(double valor);
	
}
