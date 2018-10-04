
public class ConcrectFactoryTxt extends AbstractFactory{


	@Override
	public HelloWorld createHello() {
		HelloWorld ok = new HelloWorldTxt();
		return ok;
	}

}
