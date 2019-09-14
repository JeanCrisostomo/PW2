package edu.ifrs;

import javax.ejb.Stateless;

@Stateless
public class CalcBean {
	
	public CalcBean() {
		
	}
	
	public int calculate(int valor1, int valor2, String operacao) {
			int resposta=0;
			
			if(operacao=="+") {
	        	resposta = valor1 + valor2;
	        } if(operacao=="-") {
	        	resposta = valor1 - valor2;
	        } if(operacao=="x") {
	        	resposta = valor1 * valor2;
	        } if (operacao == "/") {
	        	resposta = valor1 / valor2;
	        }
			
			return resposta;
		}
}