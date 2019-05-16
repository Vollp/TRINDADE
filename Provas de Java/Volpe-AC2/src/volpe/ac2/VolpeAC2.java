package volpe.ac2;

import java.util.*;

public class VolpeAC2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Cpu cpu = new Cpu();
        cpu.usoAtual = 0;
        cpu.valorAlerta = 100;
        cpu.modelo = "PC Gamer acer i7";
        
        while(cpu.aumentaCPU <= 0){
                System.out.println("Digite quanto deseja utilizar de sua CPU");
                cpu.aumentaCPU = leitor.nextDouble();
            }
        
        cpu.aumentarCPU();
        cpu.exibe();
        
        while(cpu.usoAtual < cpu.valorAlerta){
            cpu.aumentarCPU();
        }
        
        cpu.diminuiCPU();
        cpu.exibe();
    }
    
}
