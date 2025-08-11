
package numeros;
import java.util.Scanner;


public class Numeros {

   
    public static void main(String[] args)
    {
        int leituras=0, numero=0, maior=0, menor=0, count=1;
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de leituras que foi realizada esse ano:");
        leituras =teclado.nextInt();
        
         System.out.println("Digite um numero:");
         numero = teclado.nextInt();
         
         maior = numero;
         menor = numero;
        
        do{
         System.out.println("Digite um numero:");
         numero = teclado.nextInt();
         
         if(numero > maior)
         {
             maior=numero;
         }
         else if(numero < menor) 
         {
             menor = numero;
         }
           count++;
         
        }while(count <leituras);
               
        System.out.println("O maior é:"+maior+" O menor é:"+menor);
    }
}
