/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosdedesarrollo;
import java.util.Scanner;

/**
 *
 * @author carlo_000
 */
public class ProgramaUF2B {
    
    public static void main (String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("Dame un número: ");
        num=teclado.nextInt();
        
        if(num>0) {
            
            System.out.println("Este número es positivo.");
            
        } else {
        
            System.out.println("Este número es negativo.");
            
        }   
    }
}
