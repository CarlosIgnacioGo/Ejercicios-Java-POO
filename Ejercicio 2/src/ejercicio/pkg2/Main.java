
package ejercicio.pkg2;

public class Main {
    public static void main(String[] args) {
        Contador hola = new Contador(0);
                
        
        hola.decrementador();
        
        hola.incrementador();
        
        hola.decrementador();
        
        hola.incrementador();
        
        hola.incrementador();
        
        System.out.println(hola.getCount());
    }
}
