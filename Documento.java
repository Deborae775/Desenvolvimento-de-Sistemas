import java.util.Scanner;

/*
 * Projeto Controle com Classe Documento
 * variáveis: numero int, titulo string e valor double
 * setter e getter
 * metodo construtor
 */
public class Documento {

	Scanner teclado = new Scanner(System.in);
	
	int numero;
	String titulo;
	double valor;
		
	public Documento() {
		super();
		System.out.printf("\nIniciando o cadastro de um novo documento...\n");
		
		System.out.println("Digite o número do documento: ");
		this.numero = teclado.nextInt();
		System.out.println("Digite o título do documento: ");
		this.titulo = teclado.next();
		System.out.println("Digite o valor do documento: ");
		this.valor = teclado.nextDouble();
		
		System.out.printf("Cadastro do novo documento finalizado!\n");
	}

	public Documento(int numero, String titulo, double valor) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
