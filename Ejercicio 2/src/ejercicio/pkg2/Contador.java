
package ejercicio.pkg2;

public class Contador {
    private int count;
    
    public Contador(){}
    
    public Contador(int count){
        if (count >= 1) {
            this.count = count;
        }else{
            this.count = 0;
        }
    }

    public void setCount(int count){
        if (count >= 1) {
            this.count = count;
        }else{
            this.count = 0;
        }
    }
    
    public int getCount(){
        return count;
    }
    
    public int incrementador(){
        return count += 1;
    } 
    
    public int decrementador(){  
        count -= 1;
        
        if(count < 0){
            count = 0;
        }
        
        return count;
    }
}
