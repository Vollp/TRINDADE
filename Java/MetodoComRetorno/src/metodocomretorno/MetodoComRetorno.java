/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodocomretorno;

/**
 *
 * @author celia.taniwaki
 */
public class MetodoComRetorno {

    /* Método exibeSoma - recebe 2 argumentos: 2 valores inteiros
       Calcula a soma dos valores recebidos como argumento
       e exibe a soma.
    */
    public static void exibeSoma (int a, int b) {
        int soma = a + b;
        System.out.println(a + " + " + b + " = " + soma);
    }
    
    
    /* Método soma - recebe como argumentos 2 valores inteiros,
       calcula a soma e retorna o valor da soma
    */
    public static int soma (int a, int b) {
        int soma = a + b;
        return soma;
        
        // As 2 linhas acima poderiam ser substituídas por:
        // return a + b;
    }
    
    
    /* Método maior - recebe 2 valores inteiros como argumentos
       Retorna o maior deles
    */
    public static int maior (int x, int y) {
        if (x >= y) {
            return x;
        }
        else {
            return y;
        }
    }

    
    /* Método media - recebe 2 valores double
       Calcula e retorna a média dos 2 valores recebidos
    */
    public static double media (double a, double b) {
        return (a + b) / 2;
    }
    
    /* Método media - recebe 2 valores inteiros
       Calcula e retorna a média dos 2 valores recebidos
    */
    public static double media (int a, int b) {
        return (a + b) / 2;
    }
    
    /* Método media - recebe 3 valores double
       Calcula e retorna a média dos 3 valores recebidos
    */
    public static double media (double a, double b, double c) {
        return (a + b + c) / 3;
    }
    
    
    /* Método operacaoAritmetica - recebe como argumentos 2 valores inteiros
       e a operação a ser efetuada como String, que pode ser "soma" ou "multiplicacao"
       Retorna o resultado da operação desejada, aplicada aos 2 valores inteiros 
       Caso a operação seja inválida, exibe uma mensagem e retorna -1
    */
    public static int operacaoAritmetica (int a, int b, String op) {
        if (op.equals("soma")) {
            return a + b;
        }
        else if (op.equals("multiplicacao")) {
            return a * b;
        }
        System.out.println("Operação inválida");
        return -1;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        
        /* chama o método exibeSoma, passando os valores 2 e 5 */
        exibeSoma(2, 5);

        /* chama o método exibeSoma, passando os valores 23 e 30 */
        exibeSoma(23, 30);
        
        /* chama o método soma, passando os valores 3 e 5 
           atribui a chamada do método a uma variável, pois esse método retorna
           um valor que é atribuído para a variável resultado
        */
        resultado = soma(3, 5);
        /* exibe o resultado da soma */
        System.out.println("3 + 5 = " + resultado);
        
        System.out.println("10 + 20 = " + soma(10,20));
        
        // EVITEM FAZER ISSO: CHAMAR UM MÉTODO QUE RETORNA
        // VALOR, MAS IGNORAR O VALOR RETORNADO:
        soma(3, 5);
        
        /* Chama o método media, que também retorna um valor
           Nesse caso, a chamada foi feita dentro de um println,
           de forma que o valor retorna já vai ser exibido
           A chamada abaixo chama o método media que recebe 2 inteiros
        */
        System.out.println("A média entre 5 e 6 é " +
                            media(5, 6));

        /* A chamada abaixo chama o método media que recebe 2 valores double */
        System.out.println("A média entre 5.0 e 6.0 é " +
                            media(5.0, 6.0));
        
        /* A chamada abaixo chama o método media que recebe 3 valores */
        System.out.println("A média entre 5, 6  e 7 é " +
                            media(5, 6, 7));
        
        /* Chamada do método maior */
        System.out.println("O maior número entre 3 e 7 é " +
                            maior(3, 7));
        
        /* Chamada do método operacaoAritmetica */
        System.out.println("2 * 6 = " + 
                     operacaoAritmetica(2, 6, "multiplicacao"));
        
        /* Chamada do método operacaoAritmetica */
        System.out.println("2 + 6 = " + 
                     operacaoAritmetica(2, 6, "soma"));
        
        
        
    }
    
}
