/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

import java.util.Scanner;

/**
 *
 * @author celia.taniwaki
 */
public class PrimeiroPrograma {

    /**
     * @param args the command line arguments
     */
    
    /* Método main - é o método principal numa aplicação Java.
       Quando a aplicação é executada, o código desse método é o 
       que começa a ser executado
    */
    public static void main(String[] args) {
        
        // Declaração de variável do tipo String - para armazenar texto
        String turma= "A";

        // Comando para exibir mensagens na tela de saída
        // Atalho para esse comando: escreva sout e digite TAB
        System.out.println("Benvindos ao 2º semestre!!!");       

        // println exibe a mensagem e já posiciona na próxima linha
        // print exibe a mensagem e continua na mesma linha
        // \t faz com que um TAB "seja exibido"
        // \n faz com que mude para a próxima linha
        System.out.print("Hora do intervalo!\t\t\n\n");
        System.out.println("Primeiro programa em Java");

        // Posso concatenar (unir strings) com o caractere '+'
        System.out.println("Turma 2ºADS " + turma);
        
        // Criação do objeto leitor da classe Scanner
        // para fazer leitura de dados do teclado
        Scanner leitor = new Scanner(System.in);
        // Pede para o usuário digitar o nome
        System.out.println("Digite o seu nome:");
        // Leitura do nome e atribuição para variável nome
        String nome = leitor.nextLine();
        // Exibe a mensagem "Boa noite, " e o nome digitado 
        System.out.println("Boa noite, " + nome +"!");
               
        // Declaração de variável inteira
        int idade;
        // Pode-se declarar mais de uma variável numa mesma linha
        int a,b;
        
        // Pede para o usuário digitar a idade
        System.out.println("Digite a sua idade");
        // Leitura da idade digitada e atribuição para variável idade
        idade = leitor.nextInt();
        
        // Se a idade digitada for maior ou igual a 18
        if (idade >= 18) {
            // então exibe msg de que já pode tirar carta
            System.out.println("Já pode tirar carteira de habilitação");
        }
        else {
            // senão exibe msg de que não pode tirar carta
            System.out.println("Não pode tirar carteira de habilitação");
        }
                
        // Atribui 3 para variável a
        a = 3;
        // Primeiro atribui o valor de a para b, depois incrementa a
        b = a++;
        // Exibe valores de b e a
        System.out.println("b= " + b + "\ta= " + a);
        // Primeiro incrementa a e depois atribui valor de a para b
        b = ++a;
        System.out.println("b= " + b + "\ta= " + a);
        
        // Declaração de variável real (com casas decimais)
        float nota;

        // Pede para o usuário digitar a nota
        System.out.println("Digite a sua nota");
        // Leitura da nota digitada
        // Se tiver casas decimais, deve digitar com vírgula
        // No código do programa, deve digitar com ponto
        nota = leitor.nextFloat();
        // Exibição da nota lida
        System.out.println("A nota lida é " + nota);

    }  // fim do main
    
} // fim da class PrimeiroPrograma
