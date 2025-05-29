package ExHeranca;

public class Cilindro extends Circulo{
    private double altura;
    
    public Cilindro(){
        super();
        altura = 0;
       
    }
    
    public Cilindro(double raio, double altura){
        super(raio);
        this.altura = altura;
    }

    public double calcularArea(double altura, double raio){
        double area;
        
        area = 2 * (Math.PI * raio) + 2 * (Math.PI * raio * altura);
        
        return area;
    }
}
