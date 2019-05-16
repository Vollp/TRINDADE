/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac1.pratica.versao1;

import java.util.Scanner;

/**
 *
 * @author celia.taniwaki
 */
public class AC1PraticaVersao1 {

    /*No método main, solicite que o usuário digite um valor inteiro op maior do que zero. Leia esse valor.

Utilize um switch/case para verificar o valor op digitado pelo usuário.

Se op for 1, solicite que o usuário digite um número inteiro num, 
    leia esse número e chame o método exibeNum, 
    passando o valor de num como argumento. 
    Esse método deverá exibir os valores de zero até num (inclusive o valor de num).
    Escreva o código desse método fora do método main.

Se op for 2, você vai escrever o código que corresponde a uma votação.
    Peça para o usuário digitar 10 para votar em "Quero aula de sábado"
    ou 20 para votar em "Não quero aula de sábado".   
    Faça um loop para ler 7 votos. 
    Exiba quantos votos teve cada uma das opções, e qual foi a opção vencedora.

Se op for 3, você vai pedir que o usuário digite 10 números
        e exiba a soma dos números pares lidos.

Para qualquer outro valor de op, exiba "Número inválido".
    */
    
    public static void exibeNum(int num) {
        int cont = 0;
        while (cont <= num) {
            System.out.println(cont++);
            //cont++;
        }
    } 

    public static void exibeNumComFor (int num) {
        for (int i= 0; i <= num; i++) {
            System.out.println(i);
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro entre 1 e 3");
        
        int op = leitor.nextInt();
        
        switch (op) {
            
            case 1: System.out.println("Digite um outro número inteiro");
                    int num = leitor.nextInt();
                    exibeNum(num);
                    break;
                    
            case 2: int voto;
                    int votoQueroAula = 0;
                    int votoNaoQuero = 0;
                    
                    for (int i=0; i < 7; i++) {
                        System.out.println("Digite 10 para votar Quero aula de sábado"
                                      + " ou 20 para votar Não quero aula de sábado" );
                        voto = leitor.nextInt();
                        if (voto == 10) {
                            votoQueroAula++;
                        }
                        else if (voto == 20) {
                                votoNaoQuero++;
                             }
                        else {
                            System.out.println("Voto inválido");
                            i--;
                        }
                    }
                    
                    System.out.println("Quero aula de sábado teve " + votoQueroAula +
                                       " votos");
                    System.out.println("Não quero aula de sábado teve " + votoNaoQuero +
                                       " votos");
                    
                    if (votoQueroAula > votoNaoQuero) {
                        System.out.println("Opção vencedora: Quero aula de sábado");
                    }
                    else if (votoQueroAula == votoNaoQuero) {
                        System.out.println("Empate");
                    }
                    else {
                        System.out.println("Opção vencedora: Não quero aula de sábado");
                    }
                    break;
                    
            case 3: int soma = 0;
                    int cont = 1;
                    int numero;
                    while (cont <= 10) {
                        System.out.println("Digite um número");
                        numero = leitor.nextInt();
                        if (numero % 2 == 0) {
                            soma = soma + numero;
                        }        
                        cont++;
                    }
                    System.out.println("A soma dos pares lidos é " + soma);
                    break;
                    
            default:
                   System.out.println("Número inválido");
                   break;
        }
      
    }
    
}
