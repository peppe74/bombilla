/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsrepaso7;

import java.util.Scanner;
public class BombillaPrincipal {
    
static int tam = 3; //Creo esta variable estatica en esta zona para que me ayude en el array  en el for

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       Bombilla bombilla[] = new Bombilla[tam]; //Creo el espacio en la memoria instanciando este array 
       
       //Relleno el array con 3 bombillas
       bombilla[0] = new Bombilla(true);
       bombilla[1] = new Bombilla(true);
       bombilla[2] = new Bombilla(true);
       
       int salir = 0;
       while (salir!=5){
           
           System.out.println("             MENU");
           System.out.println("===============================");
           System.out.println("1) Ver estado de las bombillas");
           System.out.println("2) Encender o apagar bombillas");
           System.out.println("3) Ver estado de una bombilla especifica");
           System.out.println("4) Hacer saltar plomillo");
           System.out.println("5) Salir");
      
       int opc = s.nextInt();
       
       switch (opc){
           
           
        case 1:
            System.out.println("");
        for (int i = 0; i < tam; i++) {
            System.out.println("La bombilla "+(i+1)+ " esta "+bombilla[i].EncApa()); //Imrimo el estado invocando e metodo
        }
        System.out.println("");
        
        break;
        
        case 2:
            
            String siNo = "";
            
            while(!siNo.equals("n")){
       
            System.out.println("¿Que numero de bombilla quieres encender o apagar?, recuerda que solo hay "+tam+ " bombillas");
            int numBom = s.nextInt(); //Esta variable para seleccionar una bombilla especifica para poder modificar su estado
            
            System.out.println("Apagar = 1 / Encender = 2");
            int encenderApagar = s.nextInt();
           
             // Si la variable "encenderApagar" es 1 actuaalico el estado a false
            if (encenderApagar==1){
               bombilla[numBom-1].setEstado(false);  //"numBom-1, el menos 1 es para seleccionar del 1 al 3 sin poner 0
            }
             if (encenderApagar==2){// Si la variable "encenderApagar" es 1 actuaalico el estado a true
                bombilla[numBom-1].setEstado(true);
            }
            
            
            
            System.out.println("¿Quieres apagar o encender mas bombillas? s/n");
            siNo = s.next();
            
            }
            
        break;
        
        
        case 3:
            
            siNo = "";
            
            while(!siNo.equals("n")){
       
            System.out.println("Introduzca el numero de la bombilla especifica a consultar su estado.\n"
                    + "Recuerda que solo hay "+tam+ " bombillas");
            int numBom = s.nextInt();
            
                System.out.println(bombilla[numBom-1].EncApa()+"\n");//"numBom-1, el menos 1 es que imprima del 1 al 3 sin imprimir 0
           
            System.out.println("¿Quieres consultar alguna bombilla mas? s/n");
            siNo = s.next();
            
            }
            
        break;
        
         case 4:
            
             //Asi hago saltar el plomillo
            for (int i = 0; i < tam; i++) { // Actualizo a false cada bombilla con un for 
                bombilla[i].setEstado(false);  
            }
            
        break;
        
         case 5:
            
             System.out.println("SALIENDO...");
             salir = 5;
                   
            
        break;
        
        
        
        
    }
    
}

    }
}