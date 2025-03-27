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
public class DatosDeEmpleado {
    public static void main(String[] args) {
        Scanner leersalario=new Scanner (System.in);
      Scanner leernombre=new Scanner (System.in);
       Scanner leeredad=new Scanner (System.in);
       String nombre="";
       float salario;
       int edad;
        System.out.println("Ingrese su Nombre,edad y salario: ");
        nombre=leernombre.next();
        edad=leeredad.nextInt();
        salario=leersalario.nextFloat();
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
    }
    
}
