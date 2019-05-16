package Teste;

//LER DADOS JOPTION PANE
import static javax.swing.JOptionPane.showInputDialog;

//EXIBIR DADOS JOPITON PANE
import static javax.swing.JOptionPane.showMessageDialog;

//CONVERSÃO: STRING -> INT
import static java.lang.Integer.parseInt;

//CONVERSÃO: STRING -> DOUBLE
import static java.lang.Double.parseDouble;

//CONVERSÃO: STRING -> FLOAT
import static java.lang.Float.parseFloat;


public class Teste {

    public static void main(String[] args) {
        
        //criar e inicializar vars
        String auxLeitura = ""; //CTRL + R = renomear
        double conta = .0;
        String acrescimo = "";
        double contaFinal = .0;
        
        //A) ler conta
        auxLeitura = showInputDialog(null, "Digite o valor da conta a pagar"); //JOptionPane SEMPRE retorna uma String
//        leitura = javax.swing.JOptionPane.showInputDialog(null, "Digite o valor da conta a pagar"); //sem import static
        
        //conversao: leitura -> conta
        conta = parseDouble(auxLeitura);
        
        
        //B) ler opção de pagamento 10%
        auxLeitura = showInputDialog(null, "Você vai pagar os 10%? 1 - Para SIM, ? - Para NÃO");
        acrescimo = auxLeitura;
        
        //C) calcular o acréscimo
        if (acrescimo.equals("1")) {
            contaFinal = conta * 1.1;
        }
        else{
            contaFinal = conta;
        }
        
        //exibri contaFinal
        showMessageDialog(null, "Total a pagar: R$ " + contaFinal);
        
        
    }//main
    
}//class

