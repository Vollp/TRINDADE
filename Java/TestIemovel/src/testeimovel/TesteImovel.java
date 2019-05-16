package testeimovel;

import java.util.*;

public class TesteImovel {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Imovel im1 = new Imovel();
        
        System.out.println("Digite o endereço do imóvel");
        im1.endereco = leitor.nextLine();
        
        System.out.println("Digite a área do imóvel");
        im1.area = leitor.nextDouble();
            while(im1.area <= 0){
                System.out.println("Digite a área do imóvel");
                im1.area = leitor.nextDouble();
            }
            
        do{
            System.out.println("Digite o preço por metro quadrado");
            im1.precoM2 = leitor.nextDouble();
        }while(im1.precoM2 <= 0);
        
        System.out.println("O imovel no endereço rx");
            
    }
    
}
