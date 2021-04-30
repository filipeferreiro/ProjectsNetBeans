/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compara_string;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Compara_string {

    public static void main(String[] args) {
        /* declaração das variaveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        String nome1, nome2, nome3, nome4;
        int resultado=0;
        System.out.println("Insira 4 nomes para a comparação: ");
        nome1 = entrada.next();
        nome2 = entrada.next();
        nome3 = entrada.next();
        nome4 = entrada.next();
        /* entrada do meu nome e turma */    
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /* estrutura para a operação e saidas */
           if(nome1.equals(nome2)) resultado++;
           if(nome1.equals(nome3)) resultado++;
           if(nome1.equals(nome4)) resultado++;
           if(nome2.equals(nome3)) resultado++;
           if(nome2.equals(nome4)) resultado++;
           if(nome3.equals(nome4)) resultado++;
           switch(resultado){
               case 0:
                   System.out.println("Nenhuma String é igual");
                   break;
               case 1:
                   System.out.println("Duas Strings são iguais!");
                   break;
               case 2:
                   System.out.println("Três Strings são iguais");
                   break;
               case 3:
                   System.out.println("Todas as strings são iguais");
                   break;
               default:
                   System.out.println("Algo deu errado, resultado inválido!");
           }    
    }    
}
