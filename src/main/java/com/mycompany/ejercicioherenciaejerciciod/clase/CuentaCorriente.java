/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioherenciaejerciciod.clase;


public class CuentaCorriente extends EjercicioHerenciaEjerciciod {
    public class CuentaCorriente extends EjercicioHerenciaEjerciciod {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }

    @Override
    public void retirar(float monto) {
        saldo -= monto;
        if (saldo < 0) {
            sobregiro = -saldo;
            saldo = 0;
        }
    }

    @Override
    public void consignar(float monto) {
        super.consignar(monto);
        if (sobregiro > 0) {
            if (monto > sobregiro) {
                saldo += monto - sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= monto;
                monto = 0;
            }
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " + (numConsignaciones + numRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }
}


      
}

   
   
    
    
    
    
}
