package exercicio5;

import  java.util.Scanner;

public class Exercicio5 {   

    public static void main(String[] args) 
    {
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        
        int Primeiro = Leitor.nextInt();
        
        System.out.println("Digiteo segundo número: ");
        
        int Segundo = Leitor.nextInt();
        
        int Diferenca;
        
        if (Primeiro > Segundo)
        {
            Diferenca = Primeiro - Segundo;
        }
        
        else 
        {
           Diferenca = Segundo - Primeiro;
        }
        
        System.out.println("A difença é: " + Diferenca);
    }
    
}
