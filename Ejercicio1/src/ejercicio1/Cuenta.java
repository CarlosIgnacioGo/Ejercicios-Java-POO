package ejercicio1;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    
    public Cuenta(){}
    
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo ){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }
    
    public double getTipoInteres(){
        return tipoInteres;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }  
    
    public double getSaldo(){
        return saldo;
    }
    
    public boolean ingreso(double n){
        if (n > 0) {
            saldo += n;
        }else{
            return false; 
        }
        return true;
    }
    
    public boolean retiro(double n){
        if (saldo >= n && saldo > 0) {
            saldo -= n;
        }else{
            return false;
        }
        return true;
    }
    
    public String transferencia(Cuenta cuentaDestino, double dinero){
        String msg;
        if(dinero > 0 && saldo >= dinero){
            retiro(dinero);
            cuentaDestino.ingreso(dinero);
        }else{
            msg = "No tiene el dinero suficiente para hacer el deposito o esta intentando depositar una cantidad menor a 0";
            return msg;
        }
        
        return "Usted deposito a " + "|" + cuentaDestino + "|" + " la cantidad de " + dinero + "pesos";
    }

}
