package pratica303;

 import java.util.Scanner;

public class Pratica303 {
    
    public static void main(String[] args) 
    {
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite o valor do Produto: ");
        int produto = leitura.nextInt();
        System.out.println("Digite o código de Desconto: ");
       // int desconto  = leitura.nextInt();
       int cod1 = (produto * 05)  / 100;
       int cod2 = (produto * 10) / 100;
       int cod3 = (produto * 20) / 100;
       int cod4 = (produto * 50) / 100;
       System.out.println("Código 1: 5%" + "\nCódigo 2: 10%" + "\nCódigo 3: 20%" + "\nCódigo 4: 50%");
       int desconto = leitura.nextInt();
      
       //int calculo = leitura.nextInt();
      
        switch (desconto){
        
            case 1: System.out.println("O valor do produto é: R$ " + produto + "\nO valor do produto com desconto é: R$ " + cod1);
                break;
            case 2: System.out.println("O valor do produto é: R$ " + produto + "\nO valor do produto com desconto é: R$ " + cod2);
                break;
            case 3: System.out.println("O valor do produto é: R$: " + produto + "\nO valor do produto com desconto é: R$ " + cod3);
                break;
            case 4: System.out.println("O valor do produto é: R$: " + produto + "\nO valor do pruduto com desconto é: R$ " + cod4);
                break;
            default: System.out.println("Opção inválida");
        }
    }   
}
