import java.util.Scanner;

public class Desafio05 {
/*A rede de supermercados Carre4 está levando a sério as restrições de isolamento social no Brasil. Estão trabalhando para automatizar as portas das unidades, permitindo a entrada apenas das pessoas que estão atendendo às solicitações.
Toda a identificação das medidas necessárias é feita através de câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
As funções são:
•	Temperatura: Clientes com temperatura superior a 37,0 graus não podem entrar no estabelecimento.
•	Máscara: Clientes sem máscara não podem entrar no estabelecimento.
•	Famílias: grupos com mais de 2 pessoas não podem entrar no estabelecimento.
•	Função agregadora: só autoriza a entrada no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
*/
	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
		System.out.println("Digite a temperatura:");
		double temperaturaRecebida = leitor.nextDouble();
		
		System.out.println("A pessoa  está de máscara ?");
		String usandoMascara = leitor.next();
		
		System.out.println("Quantas pessoas tem no grupo ?");
		int quantidade = leitor.nextInt();
		leitor.close();
		
		boolean autorizado = checarTemperatura(temperaturaRecebida) & verificarMascara(usandoMascara) & quantidadedePessoas(quantidade);
		
		if (autorizado){
			System.out.println("Autorizado");
		}else
			System.out.println("Não autorizado !");
		

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
