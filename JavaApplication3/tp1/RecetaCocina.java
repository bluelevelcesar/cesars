/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;
import java.util.Scanner;
/**
 *
 * @author sullc
 */
public class RecetaCocina {
    public static void main(String[] args) {
        Scanner leerreceta=new Scanner (System.in);
        Scanner leeringredientes=new Scanner (System.in);
        Scanner leerdificultad=new Scanner (System.in);
        Scanner leertiempo=new Scanner (System.in);
        String receta="";
        String ingredientes="";
        String dificltad="";
        int  tiempo;
        
         System.out.println("ingrese el nombre de la receta:");
         receta=leerreceta.nextLine();
         System.out.println("Ingrese los ingredientes de la receta:");
         ingredientes=leeringredientes.nextLine();
          System.out.println("ingrese la dificultat de la receta: ");
          dificltad=leerdificultad.nextLine();
          System.out.println("ingrese el tiempo de la receta: ");
          tiempo=Integer.parseInt(leertiempo.nextLine());
          
          
        System.out.println("El nombe de la rceta es:"+receta);       
          
    }
}
