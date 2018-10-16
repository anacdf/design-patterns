package factory2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProvedorConfidencial implements Provedor {
    @Override
    public void lerArquivo() {
        try {
            FileReader ler = new FileReader("confidencial.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
