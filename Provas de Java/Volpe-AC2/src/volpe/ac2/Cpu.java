package volpe.ac2;

import java.util.*;

public class Cpu {
    
    Scanner leitor = new Scanner(System.in);
    String modelo;
    double usoAtual;
    double valorAlerta;
    double aumentaCPU;
    
    public void aumentarCPU(){
        
        if(usoAtual < valorAlerta){
            usoAtual = (usoAtual + aumentaCPU);
        }
        else {
            System.out.println("Você esta utilizando um valor maior que o permitido");
        }
    }
    
    public void diminuiCPU(){
        
        if (usoAtual < 10){
            System.out.println("O uso da CPU não pode ser diminuido");
        }
        else {
            usoAtual = (usoAtual - 10);
        }
    }
    
    public void exibe(){
        
        String simNao;
        if(usoAtual > valorAlerta){
            simNao = " O usoAtual esta maior que o valorAlerta";
        }
        else{
            simNao = " O usoAtual não esta maior que o valorAlerta";
        }
        System.out.println("O modelo da CPU é " + modelo + " Você esta utilizando "
                + usoAtual + " de sua CPU" + simNao);
    }
    
}
