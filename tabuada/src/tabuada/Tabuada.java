/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Tabuada {

    
    public static void main(String[] args) {
          Scanner entrada;
            entrada = new Scanner(System.in);
            int numero, numeroTab, tabuada = 1;
        
            System.out.println("Insira o número para a tabuada: ");
            numero = entrada.nextInt();
        
            while(tabuada <= 10){
                numeroTab = numero * tabuada;
                System.out.println("Tabuada do " + numero + " x " + tabuada + ": " + numeroTab);
                tabuada = tabuada + 1;
            }
    }
}