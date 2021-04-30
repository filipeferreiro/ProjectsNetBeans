/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskara;
import java.util.Scanner;

/**
 *
 * @author Novo
 */
public class Bhaskara {

    
    public static void main(String[] args) {
        /* declaração das variaveis */
        double A,B,C,X,Xneg;
        Scanner entrada;
        entrada = new Scanner(System.in);
        /* entrada do meu nome e turma */
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*entrada das variáveis para a operação */
        System.out.println("Insira o valor de A: ");
        A = entrada.nextDouble();
        
        System.out.println("Insira o valor de B: ");
        B = entrada.nextDouble();
        
        System.out.println("Insira o valor de C: ");
        C = entrada.nextDouble();
        /* operação */
        X = ((B*-1) + Math.sqrt((B*B) - (4*A*C)))/2*A;
        Xneg = ((B*-1) - Math.sqrt((B*B) - (4*A*C)))/2*A;
        System.out.println(X + "\n" + Xneg);
    }
    
}
