package Abstract;

public class Carro extends Veiculo {

    @Override
    public double calcularIPVA() {
        setValor(1200);
        getValor();
        double valor;
        valor = getValor() * 0.04;
        return valor;
    }

    public String marca(){
        String marca;
        setMarca("marcinhoSpeedrun");
        marca = getMarca();
        
        return marca;
    }
    
}
