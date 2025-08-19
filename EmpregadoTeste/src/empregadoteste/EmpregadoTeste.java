
package empregadoteste;
import java.util.Scanner;

public class EmpregadoTeste {

   
    public static void main(String[] args) {
       
        
       Empregado empregado1 = new Empregado() ; 
       Empregado empregado2 = new Empregado() ; 
       
       Scanner teclado = new Scanner(System.in);
               
       
       //Entrada de dados do primeiro empregado
       System.out.println("Digite seu código utilizado : ");
       empregado1.setCodigo(teclado.nextInt());
       
       System.out.println("Digite seu nome : ");
       empregado1.setNome(teclado.next());
       
       System.out.println("Digite seu nome sobrenome: ");
       empregado1.setSobrenome(teclado.next());
       
       System.out.println("Digite seu salário atual: ");
       empregado1.setSalario_mensal(teclado.nextDouble());
       
       //Entrada de dados do segundo empregado
        System.out.println("Digite seu código utilizado : ");
       empregado2.setCodigo(teclado.nextInt());
       
       System.out.println("Digite seu nome : ");
       empregado2.setNome(teclado.next());
       
       System.out.println("Digite seu nome sobrenome: ");
       empregado2.setSobrenome(teclado.next());
       
       System.out.println("Digite seu salário atual: ");
       empregado2.setSalario_mensal(teclado.nextDouble());
       
       //Saida do nome e do salário dos 2 funcionários
        System.out.println("O salário atual da(o) funcionaria(o) 1: "+empregado1.getNome()+ " O salário recebido foi equivalente a: "+empregado1.getSalario_mensal()* 12 );
        System.out.println("O salário atual da(o) funcionaria(o) 2: "+empregado2.getNome()+ " O salário recebido foi equivalente a: "+empregado2.getSalario_mensal()* 12 );
       
       
       
         
         
     
    }
    
}
