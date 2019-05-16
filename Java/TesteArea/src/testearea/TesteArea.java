/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearea;

/**
 *
 * @author celia.taniwaki
 */
public class TesteArea {
    
    public static double area (double lado) {
        return lado * lado;
    }
    
    public static double area (double base, double altura) {
        return base * altura;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A área do quadrado de lado 3 é " +
                    area (3));
        
        System.out.println("A área do retângulo de base 3 e "
                + "altura 7 é " + area(3, 7));
    }
    
}
