import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TesteAlunoHeranca 
{

    public static void main(String[] args) 
    {
        //1.b.I
       Aluno chris = new Aluno();
       Aluno volpe = new Aluno();
       
       chris.setRa (Integer.parseInt(showInputDialog("[CHRIS]\n" + 
                  "Digite seu RA: ")));
       
       chris.setNome(showInputDialog("[CHRIS]\n" +
                    "Digite seu nome: "));
       
       double auxContinuada = Double.parseDouble(showInputDialog("[CHRIS]\n" +
                              "Digite a nota Continuada: "));
       
        if (auxContinuada >= 0 && auxContinuada <= 10) 
        {
            chris.setNotaContinuada(auxContinuada);
        }
        
        double auxSemestre = Double.parseDouble(showInputDialog("[CHRIS]\n"+
                              "Digite sua nota Semestral: "));
        
        if (auxSemestre >= 0 && auxSemestre <= 10) 
        {
            chris.setNotaSemestral(auxSemestre);
        }
       
        JOptionPane.showMessageDialog(null, chris.toString()); 
        
        volpe.setRa (Integer.parseInt(showInputDialog("[VOLPE]\n" + 
                  "Digite seu RA: ")));
       
       volpe.setNome(showInputDialog("[VOLPE]\n" +
                    "Digite seu nome: "));

       
        if (auxContinuada >= 0 && auxContinuada <= 10) 
        {
            volpe.setNotaContinuada(auxContinuada);
        }
        
        if (auxSemestre >= 0 && auxSemestre <= 10) 
        {
            volpe.setNotaSemestral(auxSemestre);
        }

       JOptionPane.showInputDialog(null, volpe.toString());
    }
     
}
