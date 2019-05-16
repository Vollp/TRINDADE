package pratica302;

import java.util.Scanner;

public class Pratica302 {

    public static void main(String[] args) 
    {
       Scanner leitura = new Scanner(System.in);
       
        System.out.println("Digite 2 números: ");
        
        int N1 = leitura.nextInt();
        int N2 = leitura.nextInt();
        
        int Soma = N1 + N2;
        int Subtrair = N1 - N2;
        int Multiplicar = N1 * N2;
        int Dividir = N1/N2;
        
        System.out.println("Escolha 1 para Somar" + "\nEscolha 2 para Subtrair" + "\nEscolha 3 para Multiplicar" + "\nEscolha 4 para Dividir");
        
       int operacao = leitura.nextInt();
       
       switch (operacao)
       {
           case 1: System.out.println("O Resultado é:" + Soma);
                break;
           case 2: System.out.println("O Resultado é: " + Subtrair);
                break;
           case 3: System.out.println("O Resultado é: " + Multiplicar);
                break;
           case 4: System.out.println("O Resultado é: " + Dividir);
                break;
           default: System.out.println("Número inválido");
       }
    }
    
}
