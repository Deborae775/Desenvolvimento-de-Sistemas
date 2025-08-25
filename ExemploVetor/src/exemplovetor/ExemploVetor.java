//Verificação vetor
package exemplovetor;
import java.util.Scanner;
public class ExemploVetor {

   
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int [] vetor = new int[5];
      
      //Leitura de dados
      for (int i = 0; i < 5; i++){
         /* System.out.println("Digite os números p/ o vetor:");*/
          System.out.println("Vetor["+i+"] =");
          vetor[i] = sc.nextInt();
      }    
          //Escrita de dados
      
      for(int i = 0; i< 5; i++){
          /*System.out.println(vetor[i]);*/
           System.out.println("Vetor["+i+"] ="+ vetor[i]);
      }
    }  
}
