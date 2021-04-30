/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placa_carro;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Placa_carro {

    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        String placa;
        /* entrada do meu nome e turma */  
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /* entrada da variavel */
        System.out.println("Insira a placa do seu carro: ");
        placa = entrada.nextLine();
        
        String caracteres[] = placa.split("-");
       
        String num = caracteres[1];
        String numfin = num.substring(num.length()-1);
        int numero = Integer.parseInt(numfin);
        /* case para os numeros da placa e saida */
        switch(numero){
            case 0:
                 System.out.println("\nO seu rodizio é na sexta-feira!");
                 break;
            case 1:
            case 2:
                System.out.println("\nO seu rodizio é na segunda-feira!");
                break;
            case 3:
            case 4:
                System.out.println("\nO seu rodizio é na terça-feira!");
                break;
            case 5:
            case 6:
                 System.out.println("\nO seu rodizio é na quarta-feira!");
                 break;
            case 7:
            case 8:
                 System.out.println("\nO seu rodizio é na quinta-feira!");
                 break;
            case 9:
                 System.out.println("\nO seu rodizio é na sexta-feira!");
                 break;
        }
    }
}