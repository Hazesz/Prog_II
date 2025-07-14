package aula_49_50;

public class Suco extends Bebida {
    private String fruta;
    
    public Suco(String marca, String nome, String fruta){
        super(nome, marca);
        this.fruta = fruta;
    }
    
    public void setFruta(String fruta){
        this.fruta = fruta;
    }
    public String getFruta(){
        return fruta;
    }
    
    @Override
    public String conteudo(){
        return "marca: " +getMarca() + "\n" + "nome: " +getNome() + "\n" + "Fruta do suco: " +getFruta();
    }
}
