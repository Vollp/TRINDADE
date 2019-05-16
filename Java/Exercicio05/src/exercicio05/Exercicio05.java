package exercicio05;

import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int primeiro = leitor.nextInt();
        System.out.println("Digite o segundo número:");
        int segundo = leitor.nextInt();
        int diferenca;
        
        if (primeiro > segundo){
            diferenca = primeiro - segundo;
        }
        
        else {
            diferenca = segundo - primeiro;
        }
        
        System.out.println("A diferença entre os números é: " + diferenca);
    }
    
}
