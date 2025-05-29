package ExHeranca;

public class CirculoMain {
   public static void main(String[]args){
   Circulo circulo = new Circulo();
   System.out.println("Area Circulo: " +circulo.calcularArea(2.5));
   
   Cilindro cilindro = new Cilindro();
   System.out.println("Area Cilindro: " +cilindro.calcularArea(4.0, 3.0));
     
}
}