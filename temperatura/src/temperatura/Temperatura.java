/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Temperatura {

    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        float temperatura, converte=0;
        int tipo, kont=1;
        /* entrada do meu nome e turma */
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*estrutura para a entrada das variáveis para a operação */    
        while(kont==1){
            
            System.out.println("Insira o tipo de medida de temperatura (1 para Celsius e 2 para Fahrenheit): ");
            tipo = entrada.nextInt();  
            
            /* operação e saida */
            switch(tipo){
                case 1:
                {
                    System.out.println("Conversão de Celsius para Fahrenheit: ");
                    System.out.println("Qual a temperatura? ");
                    temperatura = entrada.nextFloat();
                    converte = (temperatura * 9/5)+ 32;
                    System.out.printf("A temperatura " + temperatura + " em Celsius, equivale a: " + converte + " em Fahrenheit.\n");
                    break;
                }

                case 2:
                {
                    System.out.println("Conversão de Fahrenheit para Celsius: ");
                    System.out.println("Qual a temperatura? ");
                    temperatura = entrada.nextFloat();
                    converte = (temperatura - 32) * 5/9;
                    System.out.printf("A temperatura " + temperatura + " em Fahrenheit, equivale a: " + converte + " em Celsius.\n");
                    break;
                }
                
                default: System.out.println("Opção inválida!");
                break;
            }
            /* reinicio opcional do loop */
            System.out.println("Deseja continuar? (1 para sim e 2 para não)");
            kont = entrada.nextInt();
        }
    } 
}
