/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_perim;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Area_perim {

    public static void main(String[] args) {
        /* declaração de variáveis */
        Scanner entrada;
        entrada = new Scanner(System.in);
        float lado1,lado2,area,perimetro;
        /* entrada do meu nome e turma */
        System.out.println("Filipe Ferreiro Pereira - 2ºDesenvolvimento de Sistemas");
        /*entrada das variáveis para a operação */
        System.out.println("Insira a medida do primeiro lado: ");
        lado1 = entrada.nextFloat();
        
        System.out.println("Insira a medida do segundo lado: ");
        lado2 = entrada.nextFloat();
        /* estrutura para a operação e saidas */
        if(lado1 == lado2){
        area = lado1 * lado2;
        perimetro = 2*(lado1 + lado2);
        System.out.println("Area e perímetro do seu quadrado: ");
        System.out.println(area + "\n" + perimetro);}
        else{
        area = lado1 * lado2;
        perimetro = 2*(lado1 + lado2);
        System.out.println("Area e perímetro do seu retângulo: ");
        System.out.println(area + "\n" + perimetro);}
        
    }
    
}
