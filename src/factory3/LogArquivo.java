package factory3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LogArquivo implements Log {
    @Override
    public void lerLog(List lista) throws IOException {
        FileWriter arq = new FileWriter("log.txt");
        PrintWriter gravar = new PrintWriter(arq);
        gravar.write(String.valueOf(lista));
        arq.close();
    }
}
