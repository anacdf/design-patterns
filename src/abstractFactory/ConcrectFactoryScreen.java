package abstractFactory;

public class ConcrectFactoryScreen extends AbstractFactory{

	@Override
	public HelloWorld createHello() {
		HelloWorldScreen ok = new HelloWorldScreen();
		return ok;
	}



}
