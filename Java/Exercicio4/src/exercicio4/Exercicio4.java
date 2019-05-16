package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) 
    {
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("Digite a nota da avaliação continuada: ");
        
        Float NotaC = Leitor.nextFloat();
        
        System.out.println("Digite a nota da avaliação oficial: ");
        
        Float NotaOfic = Leitor.nextFloat();
       
        Double Media = (NotaC * 0.4) + (NotaOfic * 0.6);
        
        System.out.println("Sua média é: " + Media);
        
        if (Media >= 5)
        {
            System.out.println("Você está aprovado");
        }
        
        else 
        {
            System.out.println("Infelizmente você reprovou");
        }
         
    }
    
}
