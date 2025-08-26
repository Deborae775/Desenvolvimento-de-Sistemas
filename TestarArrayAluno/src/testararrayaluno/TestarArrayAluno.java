
package testararrayaluno;
import java.util.Scanner;


public class TestarArrayAluno {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        Aluno [] Turma = new Aluno[5];
        
         for (int i = 0; i < 5; i++){
         Turma [i] = new Aluno (); 
             
          System.out.println("Digite o Nome do Aluno: ");
          Turma [i].setNome (teclado.next());
          
          System.out.println("Digite a nota 1: ");
          Turma [i].setNota1 (teclado.nextDouble());
          
          System.out.println("Digite a nota 2: ");
          Turma [i].setNota2 (teclado.nextDouble());
          
         }    
         for (int i = 0; i < 5; i++){
          System.out.println("ALUNO(A)["+i+"]: "+Turma [i].getNome()+" MÉDIA: "+Turma [i].calcularmedia());
         }
 }
         
         
         
  
        
       
       
        
        
        
        
        
        
        
        
    }
    
}
