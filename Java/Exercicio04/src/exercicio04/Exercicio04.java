/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a nota da avaliação continuada:");
        Float notaCont = leitor.nextFloat();
        System.out.println("Digite a nota da avaliação oficial:");
        Float notaOf = leitor.nextFloat();
        Double media = (notaCont * 0.4) + (notaOf * 0.6);
        System.out.println("Sua média é: " + media);
        
        if (media >= 5) {
            System.out.println("Parabéns você foi aprovado");
        }
        
        else {
            System.out.println("Que pena você foi reprovado");
        }
        
    }
    
}
