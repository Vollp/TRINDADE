package correçaoav;

import java.util.*;

public class CorreçaoAv {
    
    public static void exibeNum(int num) {
		for (int i = 0; i <= num; num--) {
			System.out.println(num);
		}

	}

    public static void main(String[] args) {
        
        Scanner Leitor = new Scanner(System.in); // instanciando o scanner

            System.out.println("Digite um valor: ");
            int op = Leitor.nextInt();
            if (op < 0) {
		System.out.println("Número inválido");
            } else {
		switch (op) {
                    case 1:
			System.out.println("Digite um número inteiro: ");
			int num = Leitor.nextInt();
			exibeNum(num);
                            break;
                    case 2:
                        int voto;
                        int votoQueroPython = 0;
                        int votoNaoQuero = 0;
                        for (int i=0; i < 8; i++) {
                        System.out.println("Digite 100 para votar Quero aula de Python"
                                      + " ou 200 para votar Não quero aula de Python" );
                        voto = Leitor.nextInt();
                        if (voto == 100) {
                            votoQueroPython++;
                        }
                        else if (voto == 200) {
                                votoNaoQuero++;
                             }
                        else {
                            System.out.println("Voto inválido");
                            i--;
                        }
                    }
                    
                    System.out.println("Quero aula de Python teve " + votoQueroPython +
                                       " votos");
                    System.out.println("Não quero aula de Python teve " + votoNaoQuero +
                                       " votos");
                    
                    if (votoQueroPython > votoNaoQuero) {
                        System.out.println("Opção vencedora: Quero aula de Python");
                    }
                    else if (votoQueroPython == votoNaoQuero) {
                        System.out.println("Empate");
                    }
                    else {
                        System.out.println("Opção vencedora: Não quero aula de Python");
                    }
                    break;
                    
                case 3: int soma = 0;
                    int cont = 1;
                    int numero;
                    while (cont <= 8) {
                        System.out.println("Digite um número");
                        numero = Leitor.nextInt();
                        if (numero % 2 != 0) {
                            soma = soma + numero;
                        }        
                        cont++;
                    }
                    System.out.println("A soma dos impares lidos é " + soma);
                    break;
                    
            default:
                   System.out.println("Número inválido");
                   break;
        
    }
    
}

 }

}
