package prog_ii.buscacep;

/**
 *
 * @author ihenr
 */
public class Cliente {
   private static Integer numerador = 0;
   private Integer codigo;
   private String nome;
   private Endereco endereco;
   private String telefone;

    public Cliente(String nome, Endereco endereco, String telefone) {
        this.numerador++;
        codigo = numerador;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
   
}
