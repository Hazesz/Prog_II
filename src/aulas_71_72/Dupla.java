package aulas_71_72;
/**
 *
 * @author ihenr
 * @param <T>
 * @param <U>
 */
public class Dupla <T, U> {
   private T elemento1;
   private U elemento2;

    public T getElemento1() {
        return elemento1;
    }

    public void setElemento1(T elemento1) {
        this.elemento1 = elemento1;
    }

    public U getElemento2() {
        return elemento2;
    }

    public void setElemento2(U elemento2) {
        this.elemento2 = elemento2;
    }
    
    public <T extends Number> double quadrado(T t){
        double valor = t.doubleValue();
        return valor * valor;
    }
    
    public static <E extends Number, U> boolean checkLista(E[]lista, U key){
        for(E elemento : lista){
        if(key.equals(elemento)){
            return true;
        }
        }
       return false;   
    }
}