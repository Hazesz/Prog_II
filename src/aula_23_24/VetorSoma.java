package aula_23_24;

/**
 *
 * @author ihenr
 */
public class VetorSoma {
public static void main (String[]args){
    int vet[] = {1,1,1,1,1,1,1,1,1,1};
    int soma = 0;
    
    for(int aux : vet){
    soma += aux;
    }
    
    System.out.println(" "+soma);
}
}
