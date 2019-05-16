package AmigosPizza;

import java.util.Scanner;
        
public class AmigosPizza {

    public static void main(String[] args)
    { 
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("Quantos amigos vão dividir a Pizza ?");
        
        int Amigos = Leitor.nextInt();
        
        System.out.println("Qual vai ser o sabor da Pizza ?");
        
        String Sabor = Leitor.next();
        
        System.out.println("Qual o valor da Pizza ?");
        
        float Valor = Leitor.nextFloat();
        
        float Divisao = Valor / Amigos;
        
       System.out.println("A Pizza de " + Sabor + " custa R$" + Valor + " e cada amigo vai pagar " + Divisao);
                
    }
    
}
