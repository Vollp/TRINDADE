package aula03;

import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) 
    {
      Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana (1 para  " 
        + " domingo, 2 para segunda, etc");
        
        int dia = leitor.nextInt();
        
        switch(dia)
        {
            case 1: System.out.println("Domingo");
                break;
            case 2: System.out.println("Segunda-Feira");
                break;
            case 3: System.out.println("Terça-Feira");
                break;
            case 4: System.out.println("Quarta-Feira");
                break;
            case 5: System.out.println("Quinta-Feira");
                break;
            case 6: System.out.println("Sexta-Feira");
                break;
            case 7: System.out.println("Sabádo");
                break;
            default: System.out.println("Numero Inválido");
                break;
        }
        
        System.out.println("Digite a colocação: " + "\n1 - 1° Lugar: Ganha Ipad,"
                + "Iphone, Ipoid" + "\n2- 2° Lugar: Ganha Iphone, Ipaid"
                + "\n3- 3° Lugar: Ganha Ipoid");
        
        int lugar = leitor.nextInt();
        System.out.println("Você ganhou: ");
        
        switch (lugar)
        {
            case 1: System.out.println("Ipad, ");
            case 2: System.out.println("Iphone e ");
            case 3: System.out.println("Ipod.");
                break;
            default: System.out.println("Colocação Inválida");
                break;
        }
        
        int cont = 1;
        while (cont <= 5)
        {
            System.out.println("Boa Noite");
            
            cont++;
        }
        
        
        for(int i = 1; 1 <=5; i++)
        {
            System.out.println("Bom dia para nós");
        
        
        System.out.println("Digite o nome da sua Faculdade:");
    
        String fac = leitor.next();
        if(fac.equals("BandTec"))
        {
            System.out.println("Parabens! Ótimo escolha");
        }
        
        else 
        {
            System.out.println("Vem pra Banca");
        }
    }
} 
}
