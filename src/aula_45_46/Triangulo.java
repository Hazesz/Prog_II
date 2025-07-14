package aula_45_46;

public class Triangulo implements IFigura {
    private double base;
    private double altura;
    
    public void IFigura(){
        base = 0;
        altura = 0;
    }
    
    @Override
    public double calcularArea(){
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
