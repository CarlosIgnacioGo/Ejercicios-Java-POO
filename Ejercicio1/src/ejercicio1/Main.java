package ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();
        
        cuenta1.setSaldo(100);
        cuenta2.setSaldo(100);
        
        System.out.println("saldo cuenta 1: " + cuenta1.getSaldo());
        System.out.println("saldo cuenta 2: " + cuenta2.getSaldo());
              
        System.out.println(cuenta1.transferencia(cuenta2, 100));
        
        System.out.println("saldo cuenta 1: " + cuenta1.getSaldo());
        System.out.println("saldo cuenta 2: " + cuenta2.getSaldo());
    }
}
