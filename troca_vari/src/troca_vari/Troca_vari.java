/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troca_vari;
import java.util.Scanner;
/**
 *
 * @author Novo
 */
public class Troca_vari {

    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        String vari1, vari2;
        
        System.out.println("Insira um número inteiro: ");
        vari1 = entrada.next();
            
        System.out.println("Insira outro número inteiro: ");
        vari2 = entrada.next();
        
        System.out.println("Esta é a variável 1: " + vari1 + "Esta é a variavel 2: " + vari2);
        String replace = vari1.replace(vari2, vari2);
        replace = vari2.replace(vari1, vari1);
        System.out.println("Agora esta é a variável 1: " + vari1 + replace(vari1, vari2) + ". E esta é a variavel 2: " + vari2.replace(vari2, vari1));
    }

    private static String replace(String vari2, String vari1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
