/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas unidades você deseja comprar?");
        Float quantidade = leitor.nextFloat();
        System.out.println("Digite o preço de uma unidade:");
        Float valor = leitor.nextFloat();
        Float total = quantidade * valor;
        System.out.println("O valor de sua compra é R$ " + total);
        
             
    }
    
}
