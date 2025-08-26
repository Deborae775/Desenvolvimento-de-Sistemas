
package testearraycontatos;


public class Contato {
    private String nome;
    private String telefone;
    //inserir código e colocar construtor

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
     //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
   
