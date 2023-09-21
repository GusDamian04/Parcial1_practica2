/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1_practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author GusDamian
 */
public class Parcial1_practica2 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException {
        int num1, num2;
        int numayor, numenor;
        int resuldiv, resulresi;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        System.out.println("Escribe un valor entero: ");
        entrada = bufer.readLine();
        num1 = Integer.parseInt(entrada);
        
        System.out.println("Escribe un valor entero: ");
        entrada = bufer.readLine();
        num2 = Integer.parseInt(entrada);
        
        if (num1 > num2){
            numayor = num1;
            numenor = num2;
        } else {
            numayor = num2;
            numenor = num1;
        }
        while(numayor % numenor != 0){
            resuldiv = numayor / numenor;
            resulresi = numayor % numenor;

            numayor = numenor;
            numenor = resulresi;

            }
        System.out.println("El maxicmo comun divisor: "+numenor);
            // System.out.println("numero mayor es " + numayor);
            // System.out.println("numero menor es: "+numenor);
    }    
}
