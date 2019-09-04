/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.EnvioBanco;
import java.io.File;
import java.io.IOException;
import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import Model.Disco;

public class CapturaHardware {

    static SystemInfo si = new SystemInfo();
    static HardwareAbstractionLayer hal = si.getHardware();
    File[] root = File.listRoots();

    public int dadosMemoria() {
        //valor memoria do DISCO sendo usada e quanto tem ainda 
        long totalMemoria = si.getHardware().getMemory().getTotal();
        long memoriaDisponivel = si.getHardware().getMemory().getAvailable();
        long memoriaUsada = totalMemoria - memoriaDisponivel;
        long temp = memoriaUsada * 100 / totalMemoria;
        return (int) temp;
    }

    public int retornaDisco() {
        long espacoUsado = root[0].getTotalSpace() - root[0].getFreeSpace();
        long porcentagem = espacoUsado * 100 / root[0].getTotalSpace();
        return (int) porcentagem;
    }

    public int retornaDiscoLivre() {
        int disponivel = 100 - retornaDisco();
        return disponivel;
    }

    public long tamanhoDisco() throws IOException {
        EnvioBanco eb = new EnvioBanco();
        HWDiskStore[] disco = hal.getDiskStores();
        String nome;
        long tamanho = 0;

        if (disco == disco) {
            for (int i = 0; i < disco.length; i++) {
                nome = disco[i].getName();
                tamanho = disco[i].getSize() / 1000000000;
              System.out.println("Nome do Disco :" + nome + " Tamanho do Disco: " + tamanho + " MB");
              eb.insereDisco (nome, tamanho);
            }
            return tamanho;
        }
        return 0;
    }
}
