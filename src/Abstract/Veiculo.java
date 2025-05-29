package Abstract;

public abstract class Veiculo{
    private String marca;
    private double valor;
    
    public Veiculo(){
    marca = "";
    valor = 0;
}   

    public abstract double calcularIPVA();
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    public String getMarca(){
        return marca;
    }
    public double getValor(){
        return valor;
    }
}
