package edu.ifrs;

public class Calc {
	
	public Calc() {
		
	}
	
	public int mathOp(int valor1, int valor2, String operacao) {
		int resposta=0;
		
		if("+".equals(operacao)) {
        	resposta = valor1 + valor2;
        }else if("-".equals(operacao)) {
        	resposta = valor1 - valor2;
        }else if("x".equals(operacao)) {
        	resposta = valor1 * valor2;
        }else {
        	resposta = valor1 / valor2;
        }
		
		return resposta;
	}
}
