/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_liq;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Salario_liq {

    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        double SB, SL, porc= 21.0/100.0; //21% 
        String Nome;
        /* entrada do meu nome e turma */ 
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*entrada das variáveis para a operação */
        System.out.println("Insira o nome do funcionário: ");
        Nome = entrada.next();
        System.out.println("Insira o salário bruto: ");
        SB = entrada.nextFloat();
        /* operação e saida */
        SL = SB - (porc * SB);
    
        System.out.printf("\nFuncionário: " + Nome + "\nSalário Bruto: " + SB + "\nSalário Liquido: " + SL + "\n");
    }
}
