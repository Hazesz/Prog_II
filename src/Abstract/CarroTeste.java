package Abstract;

public class CarroTeste {
    public static void main (String[]args){
        Carro c = new Carro();
        System.out.println("Valor do IPVA: " +c.calcularIPVA());
        System.out.println("Marca: "+c.marca());
    }
}
