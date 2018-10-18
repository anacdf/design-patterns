package singleton;

public final class Incremental {


	private static int count = 0;
	private int numero;
	private static Incremental uniqueInstance;
	 Incremental() {
	numero = ++count;
	}
	
	public static Incremental getInstance() {
		
		if(uniqueInstance==null) {
			uniqueInstance=new Incremental();
		}
		return uniqueInstance;
	}
	public String toString() {
	return "Incremental " + numero;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		Incremental inc = new Incremental();
		System.out.println(inc);
		}
		}

}
