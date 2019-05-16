package ac1.pkg01182000;

import java.util.*;

public  class AC101182000 {
    
    public static void exibeNum(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
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
				System.out.println(
						"Votação! Digite 10 para 'Quero aula de sábado" + "ou 20 para 'Não quero aula de sábado' ");
				int i = 0;
				int dez = 0;
				int vinte = 0;
				while (i < 7) {
					int dig = Leitor.nextInt();
					i++;
					if (dig == 10) {
						dez++;
						System.out.println(dez);
					} else if (dig == 20) {
						vinte++;
						System.out.println(vinte);
					} else if (dig < 10 || dig > 20 && i > 7) {
						break;
					}
				}
				System.out.println("Votos computados para 10: " + dez);
				System.out.println("Votos computados para 20: " + vinte);
				break;

			case 3:
				System.out.println("Digite 10 números: ");
				num = 0;
				int total = 0;
				for (i = 1; i <= 10; i++) {
                                    System.out.println("digite");
					num = Leitor.nextInt();
					if (num % 2 == 0) {
						total += num;
					}
					System.out.println(total);

				}
				break;

			default:
				System.out.println("Número inválido");
			}

		}
		Leitor.close(); // fim do programa
	}
}