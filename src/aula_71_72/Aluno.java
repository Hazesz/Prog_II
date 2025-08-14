package aula_71_72;

/**
 *
 * @author ihenr
 */
public class Aluno extends Dupla<Integer, String>{
    private Integer matricula;
    private String nome;
    
    public Aluno(){
        this.matricula = 0;
        this.nome = "";
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean checkLista(Number[] lista, Number key) {
        for(Number elemento : lista){
        if(elemento.equals(key)){
            return true;
        }
        }
       return false; 
    }

}