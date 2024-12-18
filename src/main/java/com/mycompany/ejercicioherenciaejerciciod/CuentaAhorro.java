/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioherenciaejerciciod;

/**
 *
 * @author USER
 */
public class CuentaAhorro extends CuentaBancaria {

    protected boolean CuentaActiva;

    public CuentaAhorro(String titular, float Saldo) {
        super(titular, Saldo);
        CuentaActiva = Saldo >= 10000;
        for (int i = 0; i < 10000; i++) {
            System.out.println("La cuenta esta inactiva");

        }
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

            public void imprimir(){

}
