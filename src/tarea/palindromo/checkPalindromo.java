/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.palindromo;

import java.util.Arrays;

/**
 *
 * @author Daniel Salinas
 */
public class checkPalindromo {
    public static boolean isPalindrome(String s){
        Stack pila = new Stack(); //creamos la pila 
        char[] letra = s.toCharArray(); // separamos el string en un arreglo de caracteres
        for (int i=0; i < letra.length; i++){ //se meten los caracteres en la pila
            pila.push(letra[i]);
        }      
        String[] comparar = new String[letra.length-1]; //Se crea un nuevo arreglo 
        for (int x=0; x < comparar.length; x++){ //vamos a sacar uno por uno los caracteres y meterlos en el arreglo
            comparar[x] = pila.getTop().toString();
            pila.pop();
        }
      return Arrays.toString(comparar).equals(s);  //si el arreglo inverso es igual al original entonces es un palindromo  
    }
}
