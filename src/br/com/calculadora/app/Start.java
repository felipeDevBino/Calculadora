package br.com.calculadora.app;

import br.com.calculadora.operacao.Calculo;

public class Start {

	public static void main(String[] args) {
	
		Calculo calculo = new Calculo();
		
		calculo.numero1 = 10;
		calculo.numero2 = 20;
		calculo.sinal = '+';
		calculo.calcular();
		
		System.out.println(calculo.resultado);
	}

}
