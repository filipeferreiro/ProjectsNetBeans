/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada2;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Tabuada2 {

    
    public static void main(String[] args) {
            /* declaração de variáveis */
            Scanner entrada;
            entrada = new Scanner(System.in);
            int numero, numeroTab, tabuada = 1;
            /* entrada do meu nome e turma */
            System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
            /*entrada das variáveis para a operação */
            System.out.println("Insira o número para a tabuada: ");
            numero = entrada.nextInt();
            /* operação e saida */
            while(tabuada <= 10){
                numeroTab = numero * tabuada;
                System.out.println("Tabuada do " + numero + " x " + tabuada + ": " + numeroTab);
                tabuada = tabuada + 1;
            }
    }
}
