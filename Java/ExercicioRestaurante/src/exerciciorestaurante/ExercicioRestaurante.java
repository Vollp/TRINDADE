package exerciciorestaurante;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Float.parseFloat;
public class ExercicioRestaurante 
{

    public static void main(String[] args) 
    {
        String auxLeitura = "";
        float conta = 0.0f;
        String acrescimo = "";
        float contaFinal = 0.0f;
        auxLeitura = showInputDialog(null, "Digite o valor da conta:");
        conta = parseFloat(auxLeitura);
        auxLeitura = showInputDialog(null, "Você vai pegar os 10%? 1 - Para sim, ? - Para não");
        
        if (acrescimo.equals("1"))
        {
            contaFinal = conta * 1.1f;
        }
        else 
        {
            contaFinal = conta;
        }
        
        showMessageDialog(null, "Total a pagar: R$" + contaFinal);
    }
    
}
