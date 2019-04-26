package Alerta;

import java.util.*;
import javax.swing.JOptionPane;

public class CPU {

    float tamanhoCPU;
    float usadoCPU;
    float restoCPU;

    public void definirTamanhoCPU() {
        this.tamanhoCPU = Float.parseFloat(JOptionPane.showInputDialog("Qual o tamanho da CPU? "));

    }

    public void definirQtndUsadoCPU() {
        this.usadoCPU = Float.parseFloat(JOptionPane.showInputDialog("Quanto você já utilizou ? "));

    }

    public void definirRestoCPU() {
        this.restoCPU = Float.parseFloat(JOptionPane.showInputDialog(""));

    }

    public void alert() {
        float metade = tamanhoCPU / 2;
        float porcent = (usadoCPU * 100) / tamanhoCPU;
        if (usadoCPU <= metade) {
            JOptionPane.showMessageDialog(null, "A CPU esta OK",
                                       "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, porcent + " % Da CPU ja esta sendo utilizado",
                                       "CPU EM NÍVEL CRÍTICO", JOptionPane.WARNING_MESSAGE);
        }

    }

}
