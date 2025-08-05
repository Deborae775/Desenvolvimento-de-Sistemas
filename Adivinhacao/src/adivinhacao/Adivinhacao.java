
package adivinhacao;
import java.util.Scanner;


public class Adivinhacao {

  
    public static void main(String[] args) {
       int segredo=0, numero=0, tentativa=0;
       
       Scanner teclado;
       teclado = new Scanner(System.in);
       
       
        System.out.println("Digite um número: ");
        segredo = teclado.nextInt();
        
        do
        {
            System.out.println("Digite um número :");
            numero = teclado.nextInt();
            tentativa++;
            
        }while(numero!= segredo);
        
        System.out.println("A quantidade de tentativas foram de: "+tentativa+ "\n O numero que estava escondido era: "+segredo);
    
    }
    
}
