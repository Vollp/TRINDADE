package exerciciopizza;

import java.util.Scanner;

public class ExercicioPizza {

    public static void main(String[] args) 
    {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Qual o valor da Pizza ?");
        float valor = Leitor.nextFloat();
        System.out.println("Qual o sabor da Pizza");
        String sabor = Leitor.nextLine();
        System.out.println("Qual quantidade de pessoas que vão dividir");
        int quantidadeP = Leitor.nextInt();
        int maximo = Leitor.nextInt();
        float dividir;
        
        dividir = valor / quantidadeP;
        
        if (dividir < quantidadeP)
        {
            System.out.println("Deu ruim o valor da Pizza custar "); 
        }
           
    }
    
}
