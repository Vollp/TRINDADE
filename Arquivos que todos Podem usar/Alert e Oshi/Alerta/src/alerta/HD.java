package Alerta;

import javax.swing.JOptionPane;

public class HD {

    float tamanhoHD;
    float usadoHD;
    float restoHD;

    public void definirTamanhoHD() {
        this.tamanhoHD = Float.parseFloat(JOptionPane.showInputDialog("Quanto seu computador tem de memória?"));

    }

    public void definirQtndUsadoHD() {
        this.usadoHD = Float.parseFloat(JOptionPane.showInputDialog("Quanto você já utilizou?"));

    }

    public void definirRestoCPU() {
        this.restoHD = Float.parseFloat(JOptionPane.showInputDialog(""));

    }

    public void alert() {
        float metade = tamanhoHD / 2;
        float porcent = (usadoHD * 100) / tamanhoHD;
        float resto = tamanhoHD - usadoHD;
        if (usadoHD <= metade) {
            JOptionPane.showMessageDialog(null, "HD está OK",
                                       "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, porcent + " % Da memória esta sendo utilizado \n"
            + "Ainda possui " + resto + " MB de memória disponivel", "ALERTA", JOptionPane.WARNING_MESSAGE);
        }
    }
}
