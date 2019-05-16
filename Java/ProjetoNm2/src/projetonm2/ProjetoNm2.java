/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonm2;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ProjetoNm2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Numero = " 2°";
        String Turma = " B";
        System.out.println("Eu sou gay");
        System.out.println("Esou negro e gay");
        System.out.println("Eu sou corno ");
        System.out.println("Turma muito louca" + Turma + Numero );
        
        // Criação do objetp leitor da class scanner
        // Para fazer leitura de dados do teclado
        Scanner Leitor = new Scanner(System.in);
        // Pede para o usuário digitar o nome
        System.out.println("Digite seu nome, corno: ");
        // Leitura do nome e atribuição para váriavel nome
        String Nome = Leitor.nextLine();
        System.out.println("Boa noite seu boi " + Nome);
        
        int Idade;
        int a,b;
        
        //Pede para o usuário digitar idade 
        System.out.println("Digite a idade do corno: ");
        //Leitura da idade digitada e atribuição para variável idade
        Idade = Leitor.nextInt();
        
        if (Idade >= 18)
        {
            System.out.println("Já pode terminar com sua namorada");
        }
        
        else 
        {
            System.out.println("Não pode nem namorar");
        }
        
        a = 3;
        b = a++;
        
        System.out.println("b = " + b + "\ta= " + a);
        b = ++a;
        System.out.println("b = " + b + "\ta= " + a );
        
        // Declaração de váriavel real (com casas decimais)
        float Nota;
        
        //Pede para o usuário digitar a nota
        System.out.println("Dogite sua nota: ");
        Nota = Leitor.nextFloat();
        //Exibição da nota lida
        System.out.println("A nota lida é: " + Nota);
        }
    
}
