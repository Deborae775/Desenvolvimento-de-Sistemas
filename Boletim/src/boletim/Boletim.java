
package boletim;
import java.util.Scanner;

public class Boletim {

   
 
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        Nota b1 = new Nota();
        Nota b2 = new Nota();
        Nota b3 = new Nota();
        Nota b4 = new Nota();
  
     //Entrada de dados do primeiro bimestre
      System.out.println("Digite o primeiro Bimestre: ");
      b1.setBimestre(teclado.nextInt());
      
      System.out.println("Digite a nota do primeiro Bimestre: ");
      b1.setValor_nota(teclado.nextDouble());
      
     //Entrada de dados do segundo bimestre
      System.out.println("Digite o segundo Bimestre: ");
      b2.setBimestre(teclado.nextInt());
      
      System.out.println("Digite a nota do segundo Bimestre: ");
      b2.setValor_nota(teclado.nextDouble());
     
      //Entrada de dados do terceiro bimestre
      System.out.println("Digite o terceiro Bimestre: ");
      b3.setBimestre(teclado.nextInt());
      
      System.out.println("Digite a nota do terceiro Bimestre: ");
      b3.setValor_nota(teclado.nextDouble());
      
      //Entrada de dados do quarto bimestre
      System.out.println("Digite o quarto Bimestre: ");
      b4.setBimestre(teclado.nextInt());
      
      System.out.println("Digite a nota do quarto Bimestre: ");
      b4.setValor_nota(teclado.nextDouble());
      
      //Calculo para descobrir qual é a media total
      double Total_Media = (b1.getValor_nota()+b2.getValor_nota()+b3.getValor_nota()+b4.getValor_nota()) / 4;
      
        System.out.println("A média:"+Total_Media);
        
    }
    
}
