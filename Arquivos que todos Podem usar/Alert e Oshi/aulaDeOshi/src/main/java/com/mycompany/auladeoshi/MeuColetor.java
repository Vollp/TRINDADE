package com.mycompany.auladeoshi;

    import oshi.SystemInfo;
    import oshi.hardware.CentralProcessor;
    import oshi.hardware.HardwareAbstractionLayer;
    import oshi.software.os.FileSystem;
    import oshi.software.os.OperatingSystemVersion;
    import oshi.util.FormatUtil;
    import oshi.hardware.Disks;
    import java.text.DecimalFormat;
    import java.util.concurrent.Delayed;
    import oshi.PlatformEnum;
    import oshi.hardware.*;
    import oshi.hardware.HWDiskStore;

public class MeuColetor {
    //FormatUtil.formatBytes.
    public static void main(String[] args) throws InterruptedException {
    //Como no Scanner é iniciado uma variavel para receber os valores.
        SystemInfo sistema = new SystemInfo();
        
    //Loop infinito.
        for(;;){
        
    //Coletando o tipo de SO que esta sendo executado.
        PlatformEnum nomeSistema = SystemInfo.getCurrentPlatformEnum();
        
    //Coletando o modelo do processador que esta na máquina.
        String processadorNome = sistema.getHardware().getProcessor().getName();
        
    //Pegando o total de memória RAM do computador.
        long totalRAM = sistema.getHardware().getMemory().getTotal();
        
    //Pegando a memória RAM que esta sendo usada.
        long RAMUsada = sistema.getHardware().getMemory().getAvailable();
        
    //Cálculo para dar a porcentagem de memória RAM que esta sendo utilizada.
        int RAM = (int) ((RAMUsada * 100) / totalRAM);
        
    //Pegando a quantidade de Cpu que esta sendo usada.
        double cpu = sistema.getHardware().getProcessor().getSystemCpuLoadBetweenTicks();
    
    //Convertendo bytes em gigabytes porque a converção padrão buga em alguns comandos.
        double cpu1 = cpu * 1000;
    //Transformando em quantos porcento esta sendo utilizado.
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,00%");
        
    /*Acessando o histórico de discos do computador: HD/SSD/PENDRIVE/etc...
      e colocando em um Array.
    */
        HWDiskStore[] hwDisks = sistema.getHardware().getDiskStores();
    
    //Loop para acessar todos os campos do array.
        for(int i = 0; i < hwDisks.length; i ++){
            
        //Váriavel para acessar os campos do array conforme a váriavel i se incrementa.
            HWDiskStore disk1 = hwDisks[i];
            
        //Convertendo os valores bugados do oshi em bytes.
            long tamanhoDisk = disk1.getSize();
            
        /*sout para exibir o valor e o FormatUtil é uma converção padrão do oshi para
            converter bytes em gigabytes etc...            
        */
            System.out.println("Você possui " + FormatUtil.formatBytesDecimal(tamanhoDisk) + " de memória");
        }
        
    //Exibindo as váriaveis.
        System.out.println("O sistema operacional que esta sendo utilizado é: " + nomeSistema);
        System.out.println("O processador da máquina é: " + processadorNome);
        System.out.println("Você esta utilizando " + RAM + "% de sua memória RAM");
        System.out.println("Você está utilizando " + df.format(cpu1) + " de sua CPU");
        
//Tag para controlar a velocidade do loop.
    Thread.sleep(3000);
    }
    }
    
}
