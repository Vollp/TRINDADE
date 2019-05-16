package ac1.pkg01182012;
import javax.swing.JOptionPane;
public class AC101182012 
{
    public static void main(String[] args) 
    {
       int op = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior que zero"));
       switch (op)
       {
           case 1:
           {
               ExibeNum();
               break;
           }
           case 2:
           {
               int i = 0;
               int voto, soma1 = 0, soma2 = 0;
               for (i = 0; i <7; i++)
               {
                   voto = Integer.parseInt(JOptionPane.showInputDialog("10 - Para aula de sabado"
                           + "\n20 - Para nenhuma aula de sabado"));
                   if (voto == 10)
                   {
                       soma1 = soma1 +1;
                   }
                   if (voto == 20)
                   {
                       soma2 = soma2 +1;
                   }
                   
               }
               if(soma1>soma2)
                   {
                       JOptionPane.showMessageDialog(null, "10 recebeu: " + soma1
                       +" votos e 20 recebeu: "+ soma2 
                       +" votos, e o vencedor foi o 10");
                   }
                   if(soma1<soma2)
                   {
                       JOptionPane.showMessageDialog(null, "10 recebeu: " + soma1
                       +" voto(s) e 20 recebeu: "+ soma2 
                       +" voto(s), e o vencedor foi o 20");
                   }
                   break;
           }
           case 3:
           {
               int i = 0;
               int num;
               int soma = 0;
               for (i = 0; i <9; i++)
               {
                   num = Integer.parseInt(JOptionPane.showInputDialog("Digite um nemuro"));
                   if(num%2==0)
                       {
                         soma += num;  
                       }
               }
               JOptionPane.showMessageDialog(null, "A soma de todos os pares que você digitou é "+soma);
               break;
           }
           default: JOptionPane.showMessageDialog(null, "Numero Invalido");
                    break;
       }
    }
    public static void ExibeNum()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int i;
        int soma[] = new int[num +1];
        for (i = 0; i<=num; i++)
        {
            soma[i]= i;
            JOptionPane.showMessageDialog(null, soma[i]);
        }
    }
}
