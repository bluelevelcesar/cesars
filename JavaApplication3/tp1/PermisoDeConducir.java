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
public class PermisoDeConducir {
    public static void main(String[] args) {
        Scanner leeredad=new Scanner (System.in);
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad=leeredad.nextInt();
      
        if (edad>=16) {
            System.out.println("Tiene permiso de conducir");
        } else {
            System.out.println("no tiene permiso de conducir");
        }
  
    }
}
