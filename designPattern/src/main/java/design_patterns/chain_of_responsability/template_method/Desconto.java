package design_patterns.chain_of_responsability.template_method;

public interface Desconto {

	Double desconto (double valor);
	void setProximoDescontoClass(Desconto proximoDescontoClass);
}
