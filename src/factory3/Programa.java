package factory3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) throws IOException {
        List<Integer> lista = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        LogFactory logFactory = new LogFactory();
        Log logConsole = logFactory.tipoLog("console");
        logConsole.lerLog(lista);

        Log logArquivo = logFactory.tipoLog("arquivo");
        logArquivo.lerLog(lista);
    }

}
