
package tabuada;
import java.util.Scanner;

public class Tabuada {

   
    public static void main(String[] args) {
     int tabuada,total=0, erro=0, acerto=0;
      
     Scanner teclado;
     teclado = new Scanner(System.in);
     
        System.out.println("Seja bem-Vinde ao programa de calcular Tabuada de(0 a 10");
        System.out.println("Digite um número: ");
        tabuada = teclado.nextInt();
        
        for(int i=0; i<11; i++){
           total = tabuada * i;
            System.out.println(tabuada+"X"+i+"=");
            
          int resultado = teclado.nextInt();
         
         if(resultado == total)
         {
             System.out.println("Você ACERTOU !!!!!");
             acerto++;
         }
         else 
         {
            System.out.println("Você Errou, melhore!!");   
            erro++;
        }
        }
        System.out.println("A quantidade de Erros: "+erro+" e os Acertos foram: "+acerto);
        
    }
    
}
