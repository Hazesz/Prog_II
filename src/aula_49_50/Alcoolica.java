package aula_49_50;

public class Alcoolica extends Bebida{
    private String teor;
    
    public Alcoolica(String marca, String nome, String teor){
        super(nome, marca);
        this.teor = teor;
    }
    
    public void setTeor(String teor){
        this.teor = teor;
    }   
    public String getTeor(){
        return teor;
    }
    
    @Override
    public String conteudo(){
        return "marca: " +getMarca() + "\n" + "nome: " +getNome() + "\n" + "teor alcoolico: " +getTeor();
    }
}