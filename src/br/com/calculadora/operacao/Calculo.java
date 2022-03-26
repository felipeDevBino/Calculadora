package br.com.calculadora.operacao;

public class Calculo {

	public int numero1;
	public int numero2;
	public int resultado;
	public char sinal;
	
	public void calcular() {
		
		if(sinal == '+' ) {
			resultado = numero1 + numero2;
		}else if(sinal == '-') {
			resultado = numero1 - numero2;
		}else if(sinal == '*') {
			resultado = numero1 * numero2;
		}else if(sinal == '/') {
			resultado = numero1 / numero2;
		}
			
		
	}
	
}
