package aula_45_46;

public class Quadrado implements IFigura {
    private Double lado;
    
    public void Quadrado(){
        lado = 0.0;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
}
