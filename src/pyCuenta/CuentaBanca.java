
package pyCuenta;

/**
 *
 * @author Stefany
 */
public class CuentaBanca {
    private int NroCuenta;
    private String Titular;
    private double saldo;
    
    
 public CuentaBanca(int cuenta, double inicial) {
        NroCuenta = cuenta;
        saldo = inicial;
   
    }

  public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } 

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    }

    public double saldo() {
        return saldo;
    }     
    
}