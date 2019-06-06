package Controller;

import Model.CapturaHardware;
import Model.Disco;
import Model.Leitura;
import Model.Logs;
import Model.Maquina;
import Model.Memoria;
import Model.Processador;
import Model.Memoria;
import java.awt.SystemColor;
import java.io.IOException;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import oshi.util.FormatUtil;
import java.io.Serializable;
import java.util.Arrays;
import oshi.hardware.HWDiskStore;
import oshi.hardware.NetworkIF;
import  oshi.hardware.Firmware;



public class RealizarLeitura {

    
    public static void main(String[] args) throws SQLException, IOException {
         
        SystemInfo system = new SystemInfo();
        IP();
        EnvioBanco eb = new EnvioBanco();
        
        //SISTEMA OPERACIONAL
        OperatingSystem os = system.getOperatingSystem();
        
        //hardware - informações da máquina
        HardwareAbstractionLayer hardware = system.getHardware();
        ComputerSystem maquina = hardware.getComputerSystem();
        
        // INFORMAÇÕES DO PROCESSADOR
        CentralProcessor cpu = hardware.getProcessor();
        
        //INFORMAÇÕES DA MEMORIA
        GlobalMemory memory = hardware.getMemory();
 
      
        //PROCESSADOR
        Processador p = new Processador(cpu.getName());
        System.out.println("Nome processador : " + p.toString());
        eb.insereDados(cpu.getName());
        System.out.println("Nome fabricante :"+ maquina.getManufacturer());
        System.out.println("modelo: " + maquina.getModel());
        System.out.println("serialnumber:" + maquina.getSerialNumber());
        System.out.println("Velocidade de Frequência do processador : " + FormatUtil.formatHertz(cpu.getVendorFreq()));
        System.out.println("Identificador : " + cpu.getIdentifier());
        System.out.println("IdProcessador: " + cpu.getProcessorID());
        System.out.println("Interrupções : " + cpu.getInterrupts());
        System.out.println("Versão : " + os.getVersion());
        System.out.println("Rodapé: "+maquina.getBaseboard());

        //MEMORIA RAM
        //pegando total de Memoria Ram 
        Memoria me = new Memoria(memory.getTotal());
        String me2 = me.toString();
        System.out.println("Total memoria RAM :"+ me + "GB");
        eb.insereMemoria(me2);
        System.out.println("Processos Sistema Operacional : "+ os.getProcessCount());
        System.out.println( "Threads: " + os.getThreadCount());
        
        
        //DISCO
        //Informações do Disco
        CapturaHardware capturaDisco = new CapturaHardware();
        System.out.println( "Tamanho Disco :"+capturaDisco.tamanhoDisco());
        System.out.println("Porcentagem de Disco em uso: " + capturaDisco.retornaDisco() + "%");
        System.out.println("Porcentagem de Disco livre da Maquina : " + capturaDisco.retornaDiscoLivre() + "%");
        
       //LEITURA
       //Informações da Tabela De Leitura
       //Leitura l = new Leitura(cpu.getInterrupts());
       //String l2 = l.toString();
       //eb.insereleitura(324, 3432, 5612, 612, 112, 912);
    }
    
    public static void IP(){
        SystemInfo system = new SystemInfo();  
        HardwareAbstractionLayer hardware = system.getHardware();
        NetworkIF[] networkIF = hardware.getNetworkIFs();
        
      for (int i = 0; i < 1; i++){
            
            System.out.format("Nome: %s (%s)%n", networkIF[i].getName(), networkIF[i].getDisplayName());
            System.out.format("Endereço MAC: %s %n", networkIF[i].getMacaddr());
            System.out.format("MTU: %s, Rapidez: %s %n", networkIF[i].getMTU(), FormatUtil.formatValue(networkIF[i].getSpeed(), "bps"));
            System.out.format("IPv4: %s %n", Arrays.toString(networkIF[i].getIPv4addr()));
            System.out.format("IPv6: %s %n", Arrays.toString(networkIF[i].getIPv6addr()));
      

      }
    }

}

