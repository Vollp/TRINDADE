package Alerta;

import java.util.*;
import javax.swing.JOptionPane;

public class Alerta {

    public static void main(String[] args) {
  
        RAM ram = new RAM();
        ram.definirTamanhoRam();
        ram.definirQtndUsadoRam();
        ram.alert();

        HD hd = new HD();
        hd.definirTamanhoHD();
        hd.definirQtndUsadoHD();
        hd.alert();

        CPU cpu = new CPU();
        cpu.definirTamanhoCPU();
        cpu.definirQtndUsadoCPU();
        cpu.alert();

    }
}
