package exericicio1;

import java.util.Scanner;

public class Exericicio1 {

    public static void main(String[] args) {
        
    Scanner Leitor = new Scanner(System.in);
    
    System.out.println("Qual seu nome? ");
    
    String Nome = Leitor.nextLine();
    
    System.out.println("Olá " + Nome + " Qual seu ano de nascimento ? ");
    
    int Ano = Leitor.nextInt();
    
    int Idade = 2020;
   
    Ano = Idade - Ano;
    
    System.out.println("Em 2020 você terâ " + Ano + " anos");
    
    
    
    }
    
}
