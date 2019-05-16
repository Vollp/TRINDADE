        package altura;
import java.util.Scanner;
public class Altura {

    public static void main(String[] args) 
    {
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome n° 1?");
        String fulano = Leitor.nextLine();
        System.out.println("Qual sua altura n° 1?");
        float altura1 = Leitor.nextFloat();
        System.out.println("Qual o nome n° 2?");
        String ciclano = new Scanner(System.in).nextLine();
        System.out.println("Qual sua altura n° 2?");
        float altura2 = Leitor.nextFloat();
       // String frase;
        
        if (altura1 > altura2)
        {
            System.out.println(fulano + " é mais alto que " + ciclano);
        }
        else
        {
            System.out.println(ciclano + " é mais alto que " + fulano);
        }
        
        if (altura1 == altura2)
        {
            System.out.println("Os dois tem a mesma altura");
        } 
    }
}