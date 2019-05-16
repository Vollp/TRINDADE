package pratica301;

import java.util.Scanner;

public class Pratica301 {

    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite 1 para obter uma Casquinha" + "\nDigite 2 para obter um Sundae" + "\nDigite 3 para obter um MilkShak");
        
        int sabor = leitor.nextInt();
        
        switch (sabor)
        {
            case 1: System.out.println("A Casquinha custo R$ 2,00");
                break;
            case 2: System.out.println("O Sundae custa R$ 5,00");
                break;
            case 3: System.out.println("O Milkshak custa R$ 7,00");
                break;
            default: System.out.println("Pedido Incorreto");
        }
        
    }
    
}
