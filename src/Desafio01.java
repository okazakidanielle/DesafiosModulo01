import java.util.Scanner;

public class Desafio01 {
	/*É muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou não. Caso exista, a função deve retornar um boolean true. Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.

	 * */
	public static String [] estados = {"SP", "RJ", "MG", "RS"};
	
	public static boolean verificarEstado(String estado) {
		boolean achou = false;
		
		for (int i =0; i < estados.length; i++){
		
		achou =estados[i].equals(estado);
		if(achou){
		break;
		  }
		}
				
		return achou;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Digite a sigla de um Estado");
		Scanner leitor = new Scanner(System.in);
		String valorDigitado;
		valorDigitado = leitor.next();
		
		boolean achouEstado = verificarEstado(valorDigitado);
		
		if (achouEstado) {
			System.out.println("Encontrou o Estado !");
			
		}
		else {
			System.out.println ("Não encontrou o Estado !");
		}
	}
}
