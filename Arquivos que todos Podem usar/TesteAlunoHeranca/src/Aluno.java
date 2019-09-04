public class Aluno 
{
   //1.a.I
   private int  ra;
   private String nome;
   private double notaContinuada;
   private double notaSemestral;
   
   //1.a.II
   public Aluno()
   {
       
   }

   //1.a.III
   public Aluno(int ra, String nome, float notaContinuada, float notaSemestral)
   {
       this.ra = ra;
       this.nome = nome;
       this.notaContinuada = notaContinuada;
       this.notaSemestral = notaSemestral;
   }
   
   //1.a.IV
   public double CalculaMedia()
   {
       return notaContinuada * 0.4 + notaSemestral * 0.6;
   }

    @Override
    public String toString() 
    {
        return "Aluno{\n"+ 
               "ra: " + ra + "\n" + 
               "nome: " + nome + "\n" + 
               "notaContinuada: " + notaContinuada + "\n" + 
               "notaSemestral: " + notaSemestral + "\n" + 
               "Média: " + CalculaMedia() + "\n" +
               '}';
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }
    
    
    
    
}
