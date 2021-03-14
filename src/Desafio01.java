import java.util.Scanner;

public class Desafio01 {
	/*� muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma fun��o que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.

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
			System.out.println ("N�o encontrou o Estado !");
		}
	}
}
