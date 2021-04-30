/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota_alunos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Nota_alunos {

    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        float nota1, nota2, nota3, nota_fin;
        int num_alu, kont = 0, kont_alu=1;
        
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        
        System.out.println("Insira a quantidade de alunos: ");
            num_alu = entrada.nextInt();
            
        while(kont < num_alu){
        System.out.println("Insira a primeira nota: ");
            nota1 = entrada.nextFloat();
        System.out.println("Insira a segunda nota: ");
            nota2 = entrada.nextFloat();
        System.out.println("Insira a terceira nota: ");
            nota3 = entrada.nextFloat();
        
        nota_fin = (nota1 + nota2 + nota3)/3;
        
        DecimalFormat df = new DecimalFormat("#.##");
        String formated = df.format(nota_fin);
        
        if(nota_fin < 6){
        System.out.println("A média do aluno " + kont_alu + " é: " + formated + " REPROVADO" + "\n");
        }
        else{
        System.out.println("A média do aluno " + kont_alu + " é: " + formated + " APROVADO" + "\n");
        }
        
        kont = kont + 1;
        kont_alu = kont_alu + 1;
        }
    } 
}
