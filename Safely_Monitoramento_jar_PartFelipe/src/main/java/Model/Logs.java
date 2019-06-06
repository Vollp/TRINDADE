package Model;
import Controller.RealizarLeitura;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Logs {
//fiz os logs gerados atravez de um construtor String 
    //fiz duas class para fazer os logs e para apagar os logs de conexão !
    public static void GravarLog(String mensagem) throws IOException {
 
        
        String pasta = ("C:\\LogsConexão");
        File diretorio = new File(pasta);
        diretorio.mkdir();
        File arquivo =  new File(pasta + "\\logDeConexão");
        
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<String> lista = new ArrayList<>();
        lista.add("[" + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "] " + mensagem);
        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
    }
    
        public static void ApagarLog(String mensagem) throws IOException {
        String pasta = ("C:\\LogsConexãoApagados");
        File diretorio = new File(pasta);
        diretorio.mkdir();
        File arquivo =  new File(pasta + "\\logDeConexãoApagados");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<String> lista = new ArrayList<>();
        lista.add("[" + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "] " + mensagem);
        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.TRUNCATE_EXISTING);
    }
        public static void GravarLeitura(String mensagem) throws IOException {
        String pasta = ("C:\\LogDeLeitura");
        File diretorio = new File(pasta);
        diretorio.mkdir();
        File arquivo =  new File(pasta + "\\logDeLeituraCompleta");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<String> lista = new ArrayList<>();
        lista.add("[" + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "] " + mensagem);
        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.TRUNCATE_EXISTING);
        }
}