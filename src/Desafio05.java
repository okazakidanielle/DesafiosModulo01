import java.util.Scanner;

public class Desafio05 {
/*A rede de supermercados Carre4 est� levando a s�rio as restri��es de isolamento social no Brasil. Est�o trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s solicita��es.
Toda a identifica��o das medidas necess�rias � feita atrav�s de c�meras e sensores de temperaturas. Sua tarefa � criar as fun��es que recebam essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
As fun��es s�o:
�	Temperatura: Clientes com temperatura superior a 37,0 graus n�o podem entrar no estabelecimento.
�	M�scara: Clientes sem m�scara n�o podem entrar no estabelecimento.
�	Fam�lias: grupos com mais de 2 pessoas n�o podem entrar no estabelecimento.
�	Fun��o agregadora: s� autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
*/
	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
		System.out.println("Digite a temperatura:");
		double temperaturaRecebida = leitor.nextDouble();
		
		System.out.println("A pessoa  est� de m�scara ?");
		String usandoMascara = leitor.next();
		
		System.out.println("Quantas pessoas tem no grupo ?");
		int quantidade = leitor.nextInt();
		leitor.close();
		
		boolean autorizado = checarTemperatura(temperaturaRecebida) & verificarMascara(usandoMascara) & quantidadedePessoas(quantidade);
		
		if (autorizado){
			System.out.println("Autorizado");
		}else
			System.out.println("N�o autorizado !");
		

	}

	public static boolean checarTemperatura(double temperaturaRecebida) {
		double temperaturaNormal = 37.0;
		
	    
	    if (temperaturaRecebida > temperaturaNormal) {
	    	return false;
	    } else
	    	return true;
	
	}
	
	public static boolean verificarMascara(String usandoMascara) {
		
		
		if (usandoMascara.equals("Sim")) {
			return true;
		} else
			return false;
			
	}
	
	public static boolean quantidadedePessoas(int quantidade) {
		int quantidadePermitida = 2;
						
		
		if (quantidade <=  quantidadePermitida) {
			return true;
		} else
			return false;	
		
	}
	
}
