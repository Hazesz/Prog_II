package aula_19_20;

public class Cachorro {
    private String nome;
    private String raca;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    
    public void latir(){
        System.out.println("Auau");
    }
    public void latir(int qnt){
        for(int i = 0; i < qnt; i++){
            latir();
        }
    }
    public void latir(String var){
        System.out.print(var);
    }
}
