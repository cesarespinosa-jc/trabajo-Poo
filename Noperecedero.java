/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menusistema;

/**
 *
 * @author balar
 */
public class Noperecedero extends producto {
    private String materialContenedor;
    
     public Noperecedero(double peso, String materialContenedor){
        super(peso);
        this.materialContenedor = materialContenedor;
    }
    
    
    public String getMaterialContenedor(){
        return materialContenedor;
    }
    
    public void setMaterialContenedor(String materialContenedor){
            this.materialContenedor = materialContenedor;
    
    }   
    
  @Override
  public double calcularCostoBase(){
      return getpeso () *1000;
  }
    
    @Override
  public String asignarContenedor(){
      return "contenedor normal";
  }
  
  
    
}
