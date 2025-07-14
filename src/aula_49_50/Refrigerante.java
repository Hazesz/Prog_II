package aula_49_50;

public class Refrigerante extends Bebida{
    private String sabor;
    
    public Refrigerante(String marca, String nome, String sabor){
        super(nome, marca);
        this.sabor = sabor;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public String conteudo(){
         return "marca: " +getMarca() + "\n" + "nome: " +getNome() + "\n" + "Sabor do refrigerante: " +getSabor();
    }
}