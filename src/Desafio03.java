import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

	 * */
	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println ("Digite o 1º valor");
		int lado1 = leitor.nextInt();
		
		System.out.println ("Digite o 2º valor");
		int lado2 = leitor.nextInt();
		
		System.out.println ("Digite o 3º valor");
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
				return "È um triangulo equilátero !";
						
			}
			
			if (qtdLadosIguais == 2) {
				return "È um triangulo isósceles !";
			}
			
			if (qtdLadosIguais == 1) {
				return "È um triangulo escaleno !";
			}
			
			
		}else {
			
			return "Não é um triângulo!";
		}
		return null;
    }
	
}
