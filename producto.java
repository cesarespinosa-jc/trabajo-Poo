/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menusistema;

/**
 *
 * @author balar
 */
public abstract class producto {
    private double peso;
    
    
    public producto(double peso){
        this.peso = peso;
        
    }
  
    public double getpeso(){
        return peso;
        
    }
    
    public void setpeso(double peso){
        this.peso = peso;
    }
   
    public abstract double calcularCostoBase();
    public abstract String asignarContenedor(); 
}
