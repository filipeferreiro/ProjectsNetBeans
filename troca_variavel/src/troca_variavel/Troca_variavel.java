/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troca_variavel;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Troca_variavel {

    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        int vari1, vari2, aux;
        
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        
        System.out.println("Insira um número inteiro: ");
            vari1 = entrada.nextInt();
        System.out.println("Insira outro número inteiro: ");
            vari2 = entrada.nextInt();
        
        System.out.println("Esta é a variável 1: " + vari1 + ". Esta é a variável 2: " + vari2 + ".");
        aux = vari1;
        vari1 = vari2;
        vari2 = aux;
        
        System.out.println("E agora esta é a variável 1: " + vari1 + ". E esta é a variável 2: " + vari2 + ".");
    }   
}
