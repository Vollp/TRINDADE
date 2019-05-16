package empregado;

public class TesteEmpregado {
    
public static void main(String[] args){
    Empregado joao = new Empregado();
        joao.nome = "João";
        joao.cargo = "Análista de Siatemas";
        joao.salario = 5400.00;
            joao.reajustesalario(15);
                System.out.println("O nome do empregado é: " + joao.nome +
                ", seu cargo é: " +  joao.cargo + " e seu salário é de: R$ "
                + joao.salario);
                
    Empregado Alex = new Empregado();
        Alex.nome = "Alexandre";
        Alex.cargo = "Programador ADVPL";
        Alex.salario = 1500.00;
            Alex.reajustesalario(30);
                System.out.println("O nome do empregado é: " + Alex.nome +
                ", seu cargo é: " +  Alex.cargo + " e seu salário é de: R$ "
                + Alex.salario);
}
}
