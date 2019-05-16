/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Olá, " +nome+ "! Qual o ano de de seu nascimento?");
        int ano = leitor.nextInt();
        int idade = 2020 - ano;
        System.out.println("Em 2020 você tera " + idade + " anos");
        
    }
    
}
