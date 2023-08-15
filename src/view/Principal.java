package view;

import controller.VetParesController;

public class Principal {

	public static void main(String[] args) {
		VetParesController pc = new VetParesController();
		int vet[] = {1,2,3,4,5,6,7,8,9,10};
		int i = vet.length - 1;
		int resultado = pc.VetPares(vet, i, 0);
		System.out.println("quantidade de pares no vetor = "+resultado);

	}

}
