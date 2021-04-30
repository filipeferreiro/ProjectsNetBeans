/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo_triangulo;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Tipo_triangulo {
   
    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        float lado1, lado2, lado3;
        entrada = new Scanner(System.in);
        /* entrada do meu nome e turma */
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*estrutura para a entrada das variáveis para a operação */ 
        System.out.println("Insira a medida do primeiro lado: ");
        lado1 = entrada.nextFloat();
        
        System.out.println("Insira a medida do segundo lado: ");
        lado2 = entrada.nextFloat();
        
        System.out.println("Insira a medida do último lado: ");
        lado3 = entrada.nextFloat();
        /* operação e saida */
        if((lado1<lado2+lado3) && (lado2<lado1+lado3) && (lado3<lado1+lado2))
            if(lado1==lado2 && lado2==lado3)
            System.out.println("Triângulo Equilatero");
            else
            if(lado1==lado2 || lado1==lado3 || lado3==lado2)
                System.out.println("Triângulo isoceles");
            else
                System.out.println("Triângulo Escaleno");
            else
            System.out.println("Os valores informados não formam um triângulo.");
    }
    
}
