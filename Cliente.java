/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menusistema;

public class Cliente {
    
    private int id;
    private String nombre;
    private int numeroIdenti;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double distanciaEstimada;
    private double peso;
    private double temperatura;
    private String materialContenedor;
    private int tipoCliente;
    private double calcularCostoBase;
    
    
    
    // CONSTRUCTOR con todos los datos
    Cliente(String nombre, int id, String ciudadOrigen, String ciudadDestino, double distanciaEstimada, double peso, double temperatura, int tipoCliente) {
        this.nombre = nombre;
        this.numeroIdenti = numeroIdenti;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.distanciaEstimada = distanciaEstimada;
        this.peso = peso;
        this.temperatura = temperatura;
        this.materialContenedor = materialContenedor;
        this.tipoCliente = tipoCliente;
        this.calcularCostoBase = calcularCostoBase;
        this.id = id;
    }
    
    // PARA QUE SE VEA BONITO EN LA LISTA
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"+
               " | ID: " + numeroIdenti +"\n"+
               " | Origen: " + ciudadOrigen +" === Destino:  "+ ciudadDestino +"\n"+ 
               " | Distancia: " + distanciaEstimada + "km" +"\n"+
               " | Peso: " + peso + "kg" +"\n"+
               " | Temp: " + temperatura + "°C" +"\n"+
               " | Material: " + materialContenedor+"\n"+
               " | Cliente: " + tipoCliente+"\n";
               
        
        
        
    }


}
