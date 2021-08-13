package controller;

public class OperacoesController {

	public OperacoesController() {
		super();

	}

	public void percorreVetor1() {

		int n = 1000;
		int vetor[] = new int[n];

		double tempoInicial = System.nanoTime();

		for (int i = 0; i < n; i++) {
			vetor[i] = i;
		}

		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor de 1000 posições: " + tempoTotal + "s");

	}

	public void percorreVetor2() {

		int n = 10000;
		int vetor[] = new int[n];

		double tempoInicial = System.nanoTime();

		for (int i = 0; i < n; i++) {
			vetor[i] = i;
		}

		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor de 10000 posições: " + tempoTotal + "s");

	}
	
	public void percorreVetor3() {

		int n = 100000;
		int vetor[] = new int[n];

		double tempoInicial = System.nanoTime();

		for (int i = 0; i < n; i++) {
			vetor[i] = i;
		}

		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor de 100000 posições: " + tempoTotal + "s");

	}
	
}
