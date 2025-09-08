
package vetornumeros;
import java.util.Scanner;

public class VetorNumeros {

  
    
    public static void main(String[] args) {
        
         Scanner teclado= new Scanner(System.in);  
 
      int  tamanho;
      int count_par=0 ;
      int count_impar=0 ;
      int x=0, z=0;
      
      
      //Entrada do tamanho do vetor
       System.out.println("Digite o tamanho do vetor que você deseja: ");
         tamanho =  teclado.nextInt();
     
     //Criação dos vetores    
      int [] numeros = new int[tamanho];
      
      
      
      for(int i=0; i<numeros.length; i++){
          System.out.println("Digite os numeros para cada posição do vetor:["+i+"] ");
          numeros[i] = teclado.nextInt();
      }
          
      for(int i=0; i<numeros.length; i++){ 
          if(numeros[i] % 2 == 0){
          count_par++; 
          }
          else {
          count_impar++;    
          }
      }
      
      int [] par = new int[count_par];
      int [] impar = new int[count_impar];
      
      
        for(int i=0; i<numeros.length; i++){ 
          if(numeros[i] % 2 == 0){
         par[x] = numeros[i];
         x++;
          }
          else {
          impar[z] = numeros[i];
          z++;
          }
      }
       
      for(int i=0; i<par.length; i++){  
         System.out.println("No vetor PAR no indice:["+i+"] Está o número: "+ par[i] );
      }
      
       for(int i=0; i<impar.length; i++){  
        System.out.println("No vetor IMPAR no indice:["+i+"] Está o número:"+ impar[i] );
      }
      
      System.out.println("\n A quantidade de numeros que são (Par): "+ count_par);
      System.out.println(" A quantidade de numeros que são (Impar): "+ count_impar);  
     
   }    
}
