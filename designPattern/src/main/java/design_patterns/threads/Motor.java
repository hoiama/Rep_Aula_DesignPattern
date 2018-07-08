package design_patterns.threads;

public class Motor implements Runnable{
	int numero;
	
	public Motor(int numero) {
		this.numero = numero;	
	}
	
	public synchronized void run() {
		System.out.println("Rodando motor de numero (" + numero + ") : run");
	}
	
} 

