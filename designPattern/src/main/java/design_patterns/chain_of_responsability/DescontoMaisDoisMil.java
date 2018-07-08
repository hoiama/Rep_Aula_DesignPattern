package design_patterns.chain_of_responsability;

public class DescontoMaisDoisMil implements Desconto{

	Desconto proximoDescontoClass;
	
	public Double desconto(double valor) {
		if( valor > 2000 && valor < 5000) {
			double desconto = valor * 0.05;
			return desconto;
		}else{
			return proximoDescontoClass.desconto(valor);
			}
	}

	public void setProximoDescontoClass(Desconto proximoDescontoClass) {
		this.proximoDescontoClass = proximoDescontoClass;
	}
	
	
}
