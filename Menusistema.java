/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menusistema;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author balar
 */
public class Menusistema {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args){
         ArrayList<Cliente> listaClientes = new ArrayList<>();
         try (Scanner sc = new Scanner(System.in)) {
             
            
             int menuprincipal;
             do{
                 
                 System.out.println("----MENU PRINCIPAL----");
                 System.out.println("1.COMENZAR");
                 System.out.println("2.SALIR");
                 menuprincipal = sc.nextInt();
             
                 
             
             switch (menuprincipal){
                 case 1 ->{
                   System.out.println("----COMENZEMOS PORFAVOR ELIGE UNA DE LAS SIGUIENTES OPCIONES----");  
                 
             
             
             int menu;
              do{
                  
              
             System.out.println("----Menu----");
             System.out.println("1.Registrar producto");
             System.out.println("2.Consultar historial");  
             menu = sc.nextInt();
             
             
             switch (menu) {
                 case 1 ->{ System.out.println("Rgistrando nuevo producto....");
                 
                 break;
                 
                 }

                 case 2 -> {System.out.println("Consultando registro....");
                 
                 if (listaClientes.isEmpty()){
                     System.out.println("no hay clientes registrados.,");
                 }else{
                     System.out.println("-----Historial De Clientes-----");
                     for(Cliente c : listaClientes){
                         System.out.println(c);
                     }
                     System.out.println("total clientes: "+ listaClientes.size());
                 }
                 break;
        
                 }
                 
                 
                 default -> System.out.println("opcion no validad");
             }
                 
             }while ( 1!= menu);
             sc.nextLine();
             
             
             System.out.print("ingrese el nombre del cliente: ");
             String nombre = sc.nextLine();
             
             
             System.out.print("ingrese el numero de Identida del cliente: ");
             int numeroIdenti = sc.nextInt();
             
             
             sc.nextLine();
             
             
             System.out.print("ingrese la ciudad de origen: ");
             String ciudaOrigen = sc.nextLine();
             
             
             
             System.out.print("ingrese la ciudad de destino: ");
             String ciudadDestino = sc.nextLine();
             
             
             System.out.print("ingrese la distancia del recorrido kilometros;");
             double distanciaEstimada= sc.nextDouble();
             
             
            
             
             
             System.out.print("ingrese el peso del producto kilogramos;");
             double peso = sc.nextDouble();
             if(peso <= 0){
                 System.out.println("error numero no valido");
                 return;
             }
             
             
             String materialContenedor = null;
             
             
             System.out.print("si es un refigerado Ingrese la temperatura,si no ingrese el numero .2, para omitir : °C;");
             double temperatura = sc.nextDouble();
             if (temperatura == 2){
                 materialContenedor  = "metal";
                 System.out.println("omitido");
                 System.out.println("material del contenedor :metal");
                 
             }else if (temperatura != 2){
                 
                 System.out.print("Refrigerado");
                 
                 sc.nextLine();
           
             }
             
             sc.nextLine();
             
             System.out.println("Tipo de cliente es: 1. Normal, 2.Frecuente, 3.VIP: ");
             int tipoCliente = sc.nextInt();
             
             
             switch (tipoCliente) {
                 case 1 ->{ System.out.println("cliente normal");
                 
                 }
                 
                 case 2 -> {System.out.println("Cliente frecuente");
                 
                 }

                 case 3 ->{ System.out.println("Cliente VIP");
                 
                 }
                 default -> System.out.println("opcion no validad");
                 

             }
             System.out.println("Cliente registrado con exito!");
             
                   
  
             sc.nextLine();
                   
          
             
             Perecederos p1 = new Perecederos(peso, temperatura);
             Noperecedero p2 = new Noperecedero(peso,materialContenedor);
             
     
                   
                   
                   
                 Cliente c = new Cliente(nombre, numeroIdenti, ciudaOrigen, ciudadDestino, distanciaEstimada, peso, temperatura, tipoCliente); 
    
    listaClientes.add(c);
     
             int opcion;
             
             do{
                 System.out.println("\\nombre: "+ nombre);
                 System.out.println("\\numero de identida: "+ numeroIdenti);
                 System.out.println("\\ciudad de origen: " + ciudaOrigen);
                 System.out.println("\\ciudad de destino: "+ ciudadDestino);
                 System.out.println("\\distancia recorida: "+ distanciaEstimada+"Km");
                 if(temperatura != 2){
                     System.out.println("tipo de contenedor :Refrigerado");
                     System.out.println("tipo de producto  :perecedero");
                     System.out.println("temperatura :"+ temperatura+"°c");
                 }else{
                     System.out.println("tipo de contenedor :normal");
                     System.out.println("tipo de producto :no perecedero");
                     System.out.println("material del contenedor :"+ materialContenedor);
                 }
                 
                 System.out.println("\n===MENU ===");
                 System.out.println("1.producto Percederos");
                 System.out.println("2.producto No Percederos");
                 System.out.println("3.regresar al menu principal");
                 
                 opcion = sc.nextInt();
                 
                 switch(opcion){
                     case 1 -> {
                         System.out.println("peso :"+ p1.getpeso()+"Kg");
                         System.out.println("costo :"+ p1.calcularCostoBase());
                         if (distanciaEstimada > 500){
                             System.out.println("costo adicional :"+ p1.calcularCostoBase()*10);
                         }else if (distanciaEstimada > 1000){
                             System.out.println("costo adicional :"+ p1.calcularCostoBase()*20);
                         }
                         if (tipoCliente == 2){
                             System.out.println("total a pagar"+ p1.calcularCostoBase()*0.95);
                         }else if (tipoCliente ==3){
                             System.out.println("total a pagar: "+p1.calcularCostoBase()*0.100);
                         }
                         break;
                     }
                     
                     case 2 -> {
                         System.out.println("peso :"+ p2.getpeso()+"Kg");
                         System.out.println("costo :"+ p2.calcularCostoBase());
                         if (distanciaEstimada > 500){
                             System.out.println("costo adicional :"+ p2.calcularCostoBase()*10);
                         }else if (distanciaEstimada > 1000){
                             System.out.println("costo adicional :"+ p2.calcularCostoBase()*20);
                         }
                         if (tipoCliente == 2){
                             System.out.println("total a pagar"+ p2.calcularCostoBase()*0.95);
                         }else if (tipoCliente ==3){
                             System.out.println("total a pagar"+ p2.calcularCostoBase()*0.100);
                         }
                         break;
                     }
                     case 3-> {
                         System.out.println("regresando....");
                         break;
                     }
                     default ->System.out.println("opcion no validad");
                 }
                 
                 
             }while (opcion !=3);
             break;
         }
                 case 2 -> {
                     System.out.println("Saliendo......");
                     return;
                 }
                 
                 default -> System.out.println("----Opcion no valida ----");
     }
             }while (2 !=menuprincipal);
             }
     }
}
    



     
         
          
    
        
         
             
         
             
         
         
         
              
      
         
       
     
     
             
             
     
             