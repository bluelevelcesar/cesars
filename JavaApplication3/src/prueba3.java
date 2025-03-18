/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author sullc
 */
 

public class prueba3 {
public static void main (String[] args){
    Scanner leer= new Scanner (System.in);
     Scanner leeredad= new Scanner (System.in);
      Scanner leercomida= new Scanner (System.in);
    String nombre=""; 
    int edad;
    String comida="";
    
    
    System.out.println("ingrese tu nombre");
    nombre=leer.nextLine();
    System.out.println("ingrese su edad");
    edad=leer.nextInt();
    System.out.println("ingrese tu comida favorita");
    comida=leer.next();
    
    System.out.println("tu nombre es "+nombre);
        System.out.println("tu edad es "+edad);
            System.out.println("tu comida faborita es "+comida);
    
    
    
}
    
}
