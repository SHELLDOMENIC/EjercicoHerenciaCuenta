
package com.mycompany.ejercicioherenciaejerciciod;


public class CuentaBancaria  {
    protected String titular;
    protected float Saldo;
    protected int numConsilaciones=0;
    protected int numRetiros=0;
    protected float comisionMensual=0;

    public CuentaBancaria(String titular, float Saldo) {
        this.titular = titular;
        this.Saldo = Saldo;
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumConsilaciones() {
        return numConsilaciones;
    }

    public void setNumConsilaciones(int numConsilaciones) {
        this.numConsilaciones = numConsilaciones;
    }

    public int getNumRetiros() {
        return numRetiros;
    }

    public void setNumRetiros(int numRetiros) {
        this.numRetiros = numRetiros;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    
    
    
    
    
    
}
