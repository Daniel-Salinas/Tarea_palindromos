/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.palindromo;

import java.util.Scanner;

/**
 *
 * @author Daniel Salinas
 */
public class TareaPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("Escribe una oracion o frase o lo que sea");
        
        String oracion = lee.nextLine();
        if(checkPalindromo.isPalindrome(oracion)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palindromo");
        }  
    }   
}
