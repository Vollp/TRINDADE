package BolsaFamilia;

import java.util.Scanner;

public class BolsaFamilia 
{
    
    public static void main(String[] args) 
    {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome = Leitor.nextLine();
        System.out.println("Qual cidade mora ?");
        String cidade = Leitor.nextLine();
        System.out.println("Quantidade de filhor menores de 18");
        float filho = Leitor.nextInt();
        System.out.println("Quantidade de filhos no PNE ?");
        int pne = Leitor.nextInt();
        System.out.println("Quantidade de pessoas maiores de 60");
        int pessoa = Leitor.nextInt();
        float C = 12.50f;
        float D = 14.00f;
        float E = 10.00f;
        float B;
        B = C + D + E;
        System.out.println(" por mês" + "A familía do responsavél " + nome + " vai receber um total de R$ " + B);
        
        
    }  
}