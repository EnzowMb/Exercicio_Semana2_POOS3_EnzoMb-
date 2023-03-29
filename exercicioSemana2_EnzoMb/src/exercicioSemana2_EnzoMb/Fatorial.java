package exercicioSemana2_EnzoMb;

import java.math.BigInteger;

public class Fatorial {
	
	private BigInteger fat = BigInteger.ONE;
	private int numero;
	private String resultado;

	public Fatorial(int num) {
		this.numero = num;
		if(num < 0) {
			resultado = "Informe um numero Positivo!!";
		}
		if(num == 0 || num == 1) {
			resultado = "1";
		}
		if(num > 1) {
			for(int i = 2; i <= num; i++) {
				BigInteger verif = BigInteger.valueOf(i);
				fat = fat.multiply(verif);
			}
			resultado = fat.toString();
		}
	}
	
	public String toString() {
		return resultado;
	}
	
}
