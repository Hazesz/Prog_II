package aula_13_14;

public class Robo {
    private String nome;
    private Ponto posicao;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public Robo(){
        nome = " ";
        posicao = new Ponto();
    }
    public Robo(String nome, Ponto posicao){
        this.nome = nome;
        this.posicao = posicao;
    }
    public Robo(String nome){
        this.nome = nome;
        posicao = new Ponto();
    }
    public void esquerda(){
        posicao.setX(posicao.getX() - 1 );
    }
    public void direita(){
        posicao.setX(posicao.getX() + 1);
    }
    public void cima(){
        posicao.setY(posicao.getY() + 1);
    }
    public void baixo(){
        posicao.setY(posicao.getY() - 1);
    }
    public void teleporte(int x, int y){
        posicao.setX(x);
        posicao.setY(y);
    }
    public String mostrar(){
        return "Posicao: [" + posicao.getX() + "," + posicao.getY() + "]"; 
    }
    
    public void colidiu(){
    }
    public void colidiu(int x, int y){
        posicao.setX(x);
        posicao.setY(y);
    }
}
