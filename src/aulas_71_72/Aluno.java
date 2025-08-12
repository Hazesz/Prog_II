package aulas_71_72;

/**
 *
 * @author ihenr
 */
public class Aluno {
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
    
}
