/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consorcio;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Consorcio {

    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        float valor_parc, total_pago, divida;
        int Qtd_parc, Total_parc;
        /* entrada do meu nome e turma */    
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
         /*entrada das variáveis para a operação */
        System.out.println("Qual o número total de parcelas? ");
        Total_parc = entrada.nextInt();
        
        System.out.println("Quantas parcelas já foram pagas?");
        Qtd_parc = entrada.nextInt();
        
        System.out.println("Qual o valor das parcelas?");
        valor_parc = entrada.nextInt();
        /* estrutura para a operação e saidas */
        total_pago = (Qtd_parc * valor_parc);
        divida = (Total_parc - Qtd_parc) * valor_parc;
        
        System.out.println("\nVocê já pagou: " + total_pago);
        System.out.println("Seu saldo devedor é de: " + divida + "\n");
    }
}
