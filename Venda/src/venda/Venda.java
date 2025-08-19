
package venda;
import java.util.Scanner;

public class Venda {

    
    public static void main(String[] args) {
     
     Scanner teclado = new Scanner(System.in);
        
     
     Produto item1 = new Produto();
     Produto item2 = new Produto();
     Produto item3 = new Produto();
     Produto item4 = new Produto();
     Produto item5 = new Produto();
     
        //Entrada de dados do Primeiro produto
        System.out.println("Digite o número referente ao primeiro produto:");
        item1.setNumero(teclado.nextInt());
        
        System.out.println("Digite a descrição do primeiro produto:");
        item1.setDescricao(teclado.next());
        
        System.out.println("Digite o preço do primeiro produto:");
        item1.setPreco(teclado.nextDouble());
        
        //Entrada de dados do segundo produto
        System.out.println("Digite o número referente ao segundo produto:");
        item2.setNumero(teclado.nextInt());
        
        System.out.println("Digite a descrição do segundo produto:");
        item2.setDescricao(teclado.next());
        
        System.out.println("Digite o preço do segundo produto:");
        item2.setPreco(teclado.nextDouble());
        
        
        //Entrada de dados do terceiro produto
        System.out.println("Digite o número referente ao terceiro produto:");
        item3.setNumero(teclado.nextInt());
        
        System.out.println("Digite a descrição do terceiro produto:");
        item3.setDescricao(teclado.next());
        
        System.out.println("Digite o preço do terceiro produto:");
        item3.setPreco(teclado.nextDouble());
        
        //Entrada de dados do quarto produto
        System.out.println("Digite o número referente ao quarto produto:");
        item4.setNumero(teclado.nextInt());
        
        System.out.println("Digite a descrição do quarto produto:");
        item4.setDescricao(teclado.next());
        
        System.out.println("Digite o preço do quarto produto:");
        item4.setPreco(teclado.nextDouble());
        
        //Entrada de dados do quinto produto
        System.out.println("Digite o número referente ao quinto produto:");
        item5.setNumero(teclado.nextInt());
        
        System.out.println("Digite a descrição do quinto produto:");
        item5.setDescricao(teclado.next());
        
        System.out.println("Digite o preço do quinto produto:");
        item5.setPreco(teclado.nextDouble());
     
       //Saída do valor total da compra
        double Total_compra = +item1.getPreco()+item2.getPreco()+ item3.getPreco()+item4.getPreco()+ item5.getPreco();
        
        System.out.println("O Valor total referentes aos produtos selecionados são : "+Total_compra);
        
  
       
        
        
    }
    
}
