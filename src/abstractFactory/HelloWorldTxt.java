package abstractFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldTxt extends HelloWorld {


	public HelloWorldTxt(){
		try {
		FileWriter arq = new FileWriter("output.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    gravarArq.print("Hello World");
	    arq.close();
		}
		catch(IOException e) {
			
		}
	}

}