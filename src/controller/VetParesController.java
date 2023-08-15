package controller;

public class VetParesController {

	public VetParesController() {
		super();
	}
	public int VetPares(int vet[], int i, int b) {
		if (i < 0) {
// "i" serve como referência para busca pelo vetor, quando ele for menor que 0, a chamada da função será encerrada
			return b;
		}
		else {
			if (vet[i] % 2 == 0) {
				b ++;
// se o resto da divisão de "vet[i]" por 2 for igual á zero, significa que ele é par, adicionando assim +1 no valor de "b"
			}
			return VetPares(vet, i - 1, b);
		}
	}
}
