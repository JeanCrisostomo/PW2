package edu.ifrs;

public class Calc {
	
	public Calc() {
		
	}
	
	public int mathOp(int valor1, int valor2, String operacao) {
		int resposta=0;
		
		if(operacao=="+") {
        	resposta = valor1 + valor2;
        }else if(operacao=="-") {
        	resposta = valor1 - valor2;
        }else if(operacao=="x") {
        	resposta = valor1 * valor2;
        }else {
        	resposta = valor1 / valor2;
        }
		
		return resposta;
	}
}
