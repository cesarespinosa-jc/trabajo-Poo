/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menusistema;

/**
 *
 * @author balar
 */
public class Perecederos extends producto {
    private double temperatura;
    
    public Perecederos(double peso, double temperatura){
        super(peso);
        this.temperatura = temperatura;
    }
    
  public double getTemperatura(){
      return temperatura;
  }
  
  public void setTemperatura(double temperatura){
      this.temperatura = temperatura;
  }
  
@Override
  public double calcularCostoBase(){
      return getpeso() *1500;
  }
  
 @Override
  public String asignarContenedor(){
      return "Refrigerado";
  }
 
  
    
}
