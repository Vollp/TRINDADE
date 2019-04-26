package Alerta;

import java.util.*;
import javax.swing.JOptionPane;

public class RAM {

    float tamanhoRAM;
    float usadoRAM;
    float restoRAM;

    public void definirTamanhoRam() {
        this.tamanhoRAM = Float.parseFloat(JOptionPane.showInputDialog("Qual o tamanho da memória RAM?"));

    }

    public void definirQtndUsadoRam() {
        this.usadoRAM = Float.parseFloat(JOptionPane.showInputDialog("Quanto você já utilizou ?"));

    }

    public void definirRestoRam() {
        this.restoRAM = Float.parseFloat(JOptionPane.showInputDialog(""));

    }

    public void alert() {
        float metade = tamanhoRAM / 2;
        float porcent = (usadoRAM * 100) / tamanhoRAM;
        if (usadoRAM <= metade) {
            JOptionPane.showMessageDialog(null, "A máquina esta OK",
                                       "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, porcent + " % Da memória RAM esta sendo utilizado",
                                       "PERIGO", JOptionPane.WARNING_MESSAGE);
        }

    }
}
