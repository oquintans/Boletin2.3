/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros,dolares,cambio;
        
        System.out.println("Euros €:");
        Scanner dato=new Scanner(System.in);
        euros=dato.nextFloat();
        System.out.println("Cambio:");
        cambio=dato.nextFloat();
        dolares=euros*cambio;
        System.out.println("Dolares $:"+dolares);
    
    }
    
}
