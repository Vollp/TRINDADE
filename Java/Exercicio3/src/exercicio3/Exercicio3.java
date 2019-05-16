package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) 
    {
        Scanner Leitor = new Scanner(System.in);
        
        System.out.println("Digite seu salário: ");
        
        Float Salario = Leitor.nextFloat();
        
        System.out.println("Digite a porcentagem do Imposto: ");
        
        Float Imposto = Leitor.nextFloat();
        
        Float Desconto = Salario * Imposto/100;
        
        Float SalarioLiq = Salario - Desconto;
        
        System.out.println("O salário é R$" + SalarioLiq);
    }
    
}
