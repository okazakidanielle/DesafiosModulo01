import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println ("Digite o 1� valor");
		int lado1 = leitor.nextInt();
		
		System.out.println ("Digite o 2� valor");
		int lado2 = leitor.nextInt();
		
		System.out.println ("Digite o 3� valor");
		int lado3 = leitor.nextInt();
		
		String lados = tipoDeTriangulo (lado1, lado2, lado3);
		System.out.println (lados);
		
		leitor.close();
	}
	
	public static boolean ehUmTriangulo(int lado1, int lado2, int lado3) {
		boolean existe=true;
		if (lado1+lado2>lado3 || lado2+lado3>lado1 || lado3+lado1>lado2) {
			existe=true;
		
			
		}else {
			
		existe=false;
		
		}
		
		return existe;
	}
	
	public static String tipoDeTriangulo (int lado1, int lado2, int lado3) {
		boolean verificar=ehUmTriangulo(lado1,lado2,lado3);
		
		int[] valores= {lado1, lado2, lado3};
		int qtdLadosIguais = 1;
		int valorAnterior=0;
		for (int i =0; i < valores.length; i++) {
			if (valorAnterior == valores[i]) {
				qtdLadosIguais += 1;
			}
			valorAnterior = valores[i];	
		}
		
		if (verificar) {
			
			if (qtdLadosIguais == valores.length) {
				return "� um triangulo equil�tero !";
						
			}
			
			if (qtdLadosIguais == 2) {
				return "� um triangulo is�sceles !";
			}
			
			if (qtdLadosIguais == 1) {
				return "� um triangulo escaleno !";
			}
			
			
		}else {
			
			return "N�o � um tri�ngulo!";
		}
		return null;
    }
	
}
