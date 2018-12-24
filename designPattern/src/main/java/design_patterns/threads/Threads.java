package design_patterns.threads;

public class Threads {

	
	public static void  main (String[] args) {

		/**
		 * @TESTES DE THREADS
		 */
		System.out.println("INICIANDO TESTE DE: THREAD");
		Motor motor1 = new Motor(1);
		Motor motor2 = new Motor(2);
		
		Thread thread1 = new Thread(motor1);
		Thread thread2 = new Thread(motor2);
		
		thread1.start();
		thread2.start();
		System.out.println("FINALIZANDO TESTE DE: TRHEAD\n");
	}
}
