package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner Leitor = new Scanner(System.in);
              
       System.out.println("Quantas unidades deseja comprar ? "); 
       
       int Lista = Leitor.nextInt();
       
       System.out.println("Digite o preço de uma unidade: ");
       
       int Unidade = Leitor.nextInt();
       
       int Total = Unidade * Lista;
       
        System.out.println("O valor da sua compra é R$ " + Total);   
       
    }
    
}
