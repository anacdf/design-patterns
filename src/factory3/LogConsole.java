package factory3;

import java.util.List;

public class LogConsole implements Log {
    @Override
    public void lerLog(List lista) {
        System.out.println(lista.toString());
    }
}
