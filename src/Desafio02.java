import java.util.Scanner;

public class Desafio02 {
	/*Para um ano ser bissexto ele deve ser múltiplo de 4, mas não ser múltiplo de 100 (com exceção dos anos que forem múltiplos de 400).
Crie um programa com uma função que receba um ano em uma variável inteira, faça os testes para verificar se ele é bissexto, e retorne uma String dizendo “O ano informado é bissexto” ou “O ano informado não é bissexto).
A main do seu programa deve conter a digitação do ano, a chamada da função e a exibição do texto retornado.

	 * */
	
// Exemplo do Professor
	
	
	public static String ehBissexto(int ano) {
		if(ano%4==0) {
			if(ano%100==0) {
				if(ano%400==0) {
					return "O ano é bissexto";
				
			}else {
				   return "O ano não é bissexto";
			}
		}
		return "O ano é bissexto";
	}else {
		return "O ano não é bissexto";
	}
		
    }
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o ano aqui:");
		
		int ano = leitor.nextInt();
		String data = ehBissexto(ano);
		
		System.out.println(data);
		
		leitor.close();
		
}
	}
