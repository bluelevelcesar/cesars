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
public class GustoDEHelado {
     public static void main(String[] args) {
        Scanner leerhelado=new Scanner (System.in);
        String helado;
        
        System.out.println("Ingrese su helado favorito: ");
        helado=leerhelado.next().toLowerCase();
      
        if (helado.equals("frutilla" )) {
            System.out.println("si, hay "+helado);
        } else  if (helado.equals("chocolate" )){
            System.out.println("si, hay "+helado);
        } else if(helado.equals("vainilla" )){
        System.out.println("si, hay "+helado);
        
        } else if (helado.equals("dulce de leche" )){
            System.out.println("si,hay "+helado);
        } else {
        System.out.println("no,hay "+helado);
        }
  
    }
    
    
    
}
