package aula_79_80;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoTratamentoExcecao {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    while(true){
    try{
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        
        int div = i1 / i2;
        System.out.println("Resultado da divisao: " +div);
        break;
    }
    catch(InputMismatchException e){
        System.err.println("Tenta dnv paizao, digitou String.");
        scanner.nextLine();
    }
    catch(ArithmeticException e){
        System.err.println("Essa divisao nao funciona... Tenta dnv ai");
        scanner.nextLine();
    }
    }
    }
}