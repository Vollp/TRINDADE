package classificaidade;

import java.util.Scanner;

public class ClassificaIdade {

    public static void verificar(int idade) {
        if (idade < 0) {
            System.out.println("Idade Invalida");
        } else if (idade <= 2) {
            System.out.println("Bebê");
        } else if (idade <= 11) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 30) {
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        }
    }

    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = Leitor.nextInt();

        verificar(idade);
    }

}
