package aula_71_72;
/**
 *
 * @author ihenr
 * @param <T>
 * @param <U>
 */
public class Dupla <T, U> {
   T elemento1;
   U elemento2;

   public Dupla(){
       this.elemento1 = null;
       this.elemento2 = null;
   }
   
   public Dupla(T elemento1, U elemento2){
       this.elemento1 = elemento1;
       this.elemento2 = elemento2;
   }
   
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
    
    public static <T extends Number> double quadrado(T t){
        return t.doubleValue() * t.doubleValue();
    }
    
    public <E extends Number> boolean checkLista(E[]lista, E key){
        for(E elemento : lista){
        if(elemento.equals(key)){
            return true;
        }
        }
       return false;   
    }
}