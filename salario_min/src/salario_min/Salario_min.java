/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_min;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Salario_min {
    
    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        double salario, salario_min = 1.100;
        int comparacao= 1;
        /* entrada do meu nome e turma */ 
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*entrada das variáveis para a operação */
        System.out.println("Insira o seu salario: ");
        salario = entrada.nextDouble();
        /* operação e saida */
        while(salario_min < salario){
        salario_min = salario_min + 1.100;
        comparacao = comparacao + 1;
        }
        comparacao = comparacao/1000;
        System.out.println("Você recebe o total de " + comparacao + " salarios minimos!");
        
    }
    
}
