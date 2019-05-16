package p02.pkg01182000;

import java.util.*;

public class P0201182000 {

    public static void main(String[] args) {
        
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Digite um valor maior do que zero!");
        String op = Leitor.nextLine();
        
        switch (op){
            case "1": System.out.println("Informe o usuário");
                    String User = Leitor.nextLine();
                if(User == "01182000"){
                    System.out.println("Login inválido");
                }
                else{
                    System.out.println("Digite a senha");
                    String Senha = Leitor.nextLine();
                if(Senha == "#Gf46142234864"){
                    System.out.println("Senha inválida");
                    }
                else{
                    System.out.println("Login realizado com sucesso");
                }
                }
                break;
            case "2": int i;
                      int result = 0;
                for(i=0; i<10; i++){
                    System.out.println("Digite um numero inteiro");
                    int num = Leitor.nextInt();
                if(num % 3 == 0){
                    result ++;
                }
                }
                  System.out.println("A quantidade de números multiplos de 3 são: " + result);
                
                break;
        }
    
    }
    }

