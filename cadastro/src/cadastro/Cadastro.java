
package cadastro;
import java.util.Scanner;


public class Cadastro {

    
    public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);
    
    pessoa registro1 = new pessoa() ; 
    pessoa registro2 = new pessoa() ;
    pessoa registro3 = new pessoa() ;
     
     System.out.println("Digite o primeiro código: ");
     registro1.setCodigo(teclado.nextInt());
     
     System.out.println("Digite o primeiro Nome: ");
     registro1.setNome(teclado.next());
     
     System.out.println("Digite a primeira Idade: ");
     registro1.setIdade(teclado.nextInt());
     
     System.out.println("Digite o segundo código: ");
     registro2.setCodigo(teclado.nextInt());
     
     System.out.println("Digite o segundo Nome: ");
     registro2.setNome(teclado.next());
     
     System.out.println("Digite a segunda Idade: ");
     registro2.setIdade(teclado.nextInt());
     
     System.out.println("Digite o terceiro código: ");
     registro3.setCodigo(teclado.nextInt());
     
     System.out.println("Digite o terceiro Nome: ");
     registro3.setNome(teclado.next());
     
     System.out.println("Digite a terceira Idade: ");
     registro3.setIdade(teclado.nextInt());
     
     
      
       if(registro1.getIdade() > registro2.getIdade())
   {
       if( registro1.getIdade() >registro3.getIdade())
       {
           System.out.println("NOME: " +registro1.nome+ " Possui a maior idade:" +registro1.idade);
       }
   }
   else if(registro2.getIdade() > registro3.getIdade())
   {
       System.out.println("NOME: " +registro2.nome+ " Possui a maior idade: " +registro2.idade);
   }
   else
   {
        System.out.println("A pessoa pertencente ao Nome: " +registro3.nome+ " Possui a maior idade:" +registro3.idade+"anos");
   }
 
       
    }
    
}
