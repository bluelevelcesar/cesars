/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author sullc
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        Scanner leeredad= new Scanner (System.in);
        int edad;
        String nombre="";
        System.out.println("ingrese su nombre:");
        nombre = leer.next();
         System.out.println("ingrese su nombre:");
         edad = leeredad.nextInt();
        
        System.out.println("hola como estas "+nombre);
         System.out.println("hola como estas "+edad);

    }
    
}
