package ExHeranca;

public class Pessoa {
    private int codigo;
    private String nome;
    
    public Pessoa(){
       codigo = 0;
       nome = "";
    }
    public Pessoa(int codigo, String nome){
        codigo = 0;
        nome = "";
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
}
