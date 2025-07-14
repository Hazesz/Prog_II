package aula_49_50;

public abstract class Bebida{
    private String marca;
    private String nome;
    
    public Bebida(){
        nome = "";
        marca = "";
    }
    public Bebida(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public abstract String conteudo();
}