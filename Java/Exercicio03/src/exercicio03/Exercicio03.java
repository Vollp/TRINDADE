/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu salário:");
        Float salario = leitor.nextFloat();
        System.out.println("Digite a porcentagem do imposto:");
        Float imposto = leitor.nextFloat();
        Float desconto = salario * imposto / 100;
        Float salarioLiq = salario - desconto;
        System.out.println("O salário líquido é R$ " + salarioLiq);

    }
    
}
