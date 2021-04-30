/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idade;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Idade {

    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        int anos,meses,dias,resFinal;
        /* entrada do meu nome e turma */   
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*entrada das variáveis para a operação */
        System.out.println("Insira sua idade expressa em anos,meses e dias: ");
        System.out.println("Anos: ");
        anos = entrada.nextInt();
        
        System.out.println("Meses: ");
        meses = entrada.nextInt();
        
        System.out.println("Dias: ");
        dias = entrada.nextInt();
        /* operação e saida */
        resFinal = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("Você já viveu " + resFinal + " dias");
    }
    
}
