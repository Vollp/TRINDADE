package Volpe.Importar;

/**
 *
 * @author VOLPE
 */
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class Importando 
{
    public static Icon banner  = caminhoImagem("TesteVolpe/imagens");
    
    //Instanciando objeto para importar imagens
    private static Importando instance = new Importando();
    
    public static Icon caminhoImagem(String url)
    {
        if (instance == null) 
        {
            instance = new Importando();
        }
        return instance.importar(url);
    }
    
    private Icon importar(String url) 
    {
        if (!url.equals("")) 
        {
            try {
                Image imagem = ImageIO.read(getClass().getResource(url));
                ImageIcon icon = new ImageIcon(url);
                return icon;

            } catch (Exception e) {
                System.out.println(
                        "+------------------------------------+\n"
                        + "| Erro ao importar a ImagemBitmap! :(\n"
                        + "| URL: " + url + "\n"
                        + "+------------------------------------+\n"
                );
            }
        }
        return null;
    }
}
