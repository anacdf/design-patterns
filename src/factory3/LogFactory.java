package factory3;

public class LogFactory {

    private Log log;

    public Log tipoLog(String tipo){
        if(tipo.equalsIgnoreCase("arquivo")){
            log = new LogArquivo();
            return log;
        }

        if(tipo.equalsIgnoreCase("console")){
            log = new LogConsole();
            return log;
        }
        return null;
    }
}
