

/*
 * Instanciar 5 documentos usando o construtor
 * Imprimir titulo e valor menor e maior;
 * Imprimir soma de todos valores e média
 */
public class Controle {

	public static void main(String[] args) {
		
		Documento doc1 = new Documento();
		Documento doc2 = new Documento();
		Documento doc3 = new Documento();
		Documento doc4 = new Documento();
		Documento doc5 = new Documento();

		/*
		 * Verificar o maior e menor
		 * Criar variaveis menor e maior
		 * As duas recebem o valor do doc1
		 * depois compara ela com o restante
		 * Faz o mesmo com a menor
		 */
		//Verificando o maior
		double maior = doc1.getValor();
		int docMaior = 1;
		if (maior < doc2.getValor()) {
			maior = doc2.getValor();
			docMaior = 2;
		}
		if (maior < doc3.getValor()) {
			maior = doc3.getValor();
			docMaior = 3;
		}
		if (maior < doc4.getValor()) {
			maior = doc4.getValor();
			docMaior = 4;
		}
		if (maior < doc5.getValor()) {
			maior = doc5.getValor();
			docMaior = 5;
		}
		//Verificando o maior
		double menor = doc1.getValor();
		int docMenor = 1;
		if (menor > doc2.getValor()) {
			menor = doc2.getValor();
			docMenor = 2;
		}
		if (menor > doc3.getValor()) {
			menor = doc3.getValor();
			docMenor = 3;
		}
		if (menor > doc4.getValor()) {
			menor = doc4.getValor();
			docMenor = 4;
		}
		if (menor > doc5.getValor()) {
			menor = doc5.getValor();
			docMenor = 5;
		}
		
		/*
		 *Fazer a soma 
		 */
		double soma = 0;
		soma = doc1.getValor()+
				doc2.getValor()+
				doc3.getValor()+
				doc4.getValor()+
				doc5.getValor();
		
		/*
		 * Fazer a média
		 * Pegar o resultado da soma e dividir por 5 
		 */
		double media = soma/5;
		
		//Exibindo resultados
		//Primeiro o maior
		if (docMaior == 1) {
			System.out.println("\nO documento com o maior valor registrado foi do título: "+
								doc1.getTitulo()+
								". E seu valor foi: "+
								doc1.getValor()+
								".");
		}else if (docMaior == 2) {
			System.out.println("\nO documento com o maior valor registrado foi do título: "+
					doc2.getTitulo()+
					". E seu valor foi: "+
					doc2.getValor()+
					".");
		}else if (docMaior == 3) {
			System.out.println("\nO documento com o maior valor registrado foi do título: "+
					doc3.getTitulo()+
					". E seu valor foi: "+
					doc3.getValor()+
					".");
		}else if (docMaior == 4) {
			System.out.println("\nO documento com o maior valor registrado foi do título: "+
					doc4.getTitulo()+
					". E seu valor foi: "+
					doc4.getValor()+
					".");
		}else{
			System.out.println("\nO documento com o maior valor registrado foi do título: "+
					doc5.getTitulo()+
					". E seu valor foi: "+
					doc5.getValor()+
					".");
		}
		
		//Agora o menor
		if (docMenor == 1) {
			System.out.println("\nO documento com o menor valor registrado foi do título: "+
								doc1.getTitulo()+
								". E seu valor foi: "+
								doc1.getValor()+
								".");
		}else if (docMenor == 2) {
			System.out.println("\nO documento com o menor valor registrado foi do título: "+
					doc2.getTitulo()+
					". E seu valor foi: "+
					doc2.getValor()+
					".");
		}else if (docMenor == 3) {
			System.out.println("\nO documento com o menor valor registrado foi do título: "+
					doc3.getTitulo()+
					". E seu valor foi: "+
					doc3.getValor()+
					".");
		}else if (docMenor == 4) {
			System.out.println("\nO documento com o menor valor registrado foi do título: "+
					doc4.getTitulo()+
					". E seu valor foi: "+
					doc4.getValor()+
					".");
		}else{
			System.out.println("\nO documento com o menor valor registrado foi do título: "+
					doc5.getTitulo()+
					". E seu valor foi: "+
					doc5.getValor()+
					".");
		}
		
		//Exibindo a soma
		System.out.println("\nA soma de todos os valores foi: "+soma+".");
		
		//Exibindo a média
		System.out.println("\nA média dos valores foi: "+media+".");
	}

}
