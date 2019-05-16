package empregado;

public class Empregado {
    
    String nome;
    String cargo;
    double salario;
    
    public void reajustesalario(double porcentagem){
        salario = ((salario * porcentagem) / 100 ) + salario;
    }
}