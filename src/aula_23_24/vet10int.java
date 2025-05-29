package aula_23_24;

/**
 *
 * @author ihenr
 */
public class vet10int {
    public static void main(String []args){
    int vet[] = new int[10];
    
    for(int i = 0; i < 10; i++){
        vet[i]= i;
    }
    int somador = 0;
    for(int i = 0; i < 10; i++){
       somador += vet[i];
    }
    System.out.println("Soma: " +somador);
}
}
