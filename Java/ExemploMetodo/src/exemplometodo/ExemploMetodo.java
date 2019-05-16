/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodo;

/**
 *
 * @author celia.taniwaki
 */
public class ExemploMetodo {
    
    /* Exemplo de método que não recebe valor e não retorna nada 
       Este método apenas exibe "Boa noite!"
       A palavra void serve para indicar que o método não retorna valor
       Depois do nome do método, SEMPRE tem que ter os parênteses
    */
    public static void exibeBoaNoite() {
        // código do método deve ser colocado aqui
        // entre o abre-chave e o fecha-chave
        System.out.println("Boa Noite!");
    }
    
    /* Exemplo de outro método que exibe uma linha de asterisco */
    public static void exibeLinhaAsterisco() {
        System.out.println("**************************************");
    }
    
    /* Exemplo de método que recebe uma String, que é atribuída 
       para o argumento frase e exibe essa String dentro de um quadrinho
    */
    public static void exibeQuadro(String frase) {
        exibeLinhaAsterisco();          /* Exibe a parte de cima do quadrinho */
        /* no meio do quadrinho, exibe a frase */
        System.out.println("***           " + frase + 
                           "           ***");
        exibeLinhaAsterisco();          /* Exibe a parte de baixo do quadrinho */
    }
    
    /* Método main */
    public static void main(String[] args) {
        /* Chamada do método exibeBoaNoite() */
        exibeBoaNoite();
        /* Chama de novo o método exibeBoaNoite()  */
        exibeBoaNoite();
        /* Chama o método exibeLinhaAsterisco */
        exibeLinhaAsterisco();
        /* Exibe uma linha em branco */
        System.out.println("");
        /* Chama o método exibeQuadro, passando "Boa noite!" para aparecer
           no meio do quadro
        */
        exibeQuadro("Boa noite!");
        /* Exibe uma linha em branco */
        System.out.println("");
        /* Chama o método exibeQuadro, passando "Boa noite!" para aparecer
           no meio do quadro
        */
        exibeQuadro("Tudo bem ?");
        /* Exibe uma linha em branco */
        System.out.println("");

        /* Chama o método exibeSoma, passando 2 valores */
        exibeSoma(3, 7);
        /* Chama o método exibeSoma, passando 3 valores */
        exibeSoma(1, 2, 3);
        
        /* Se passar 4 valores ou 1 valor na chamada do exibeSoma
           dará erro
        */
//        exibeSoma(1, 2, 3, 4);
//        exibeSoma(1);
    }
    
    /* Método exibeSoma - recebe 2 valores inteiros 
       Calcula e exibe a soma dos valores recebidos
    */
    public static void exibeSoma(int a, int b) {
        int resultado;
        resultado= a + b;
        System.out.println("Soma: " + resultado);
    }

    /* Método exibeSoma - recebe 3 valores inteiros 
       Calcula e exibe a soma dos valores recebidos
    */
    public static void exibeSoma(int a, int b, int c) {
        int resultado;
        resultado= a + b + c;
        System.out.println("Soma: " + resultado);
    }
    
    
}
