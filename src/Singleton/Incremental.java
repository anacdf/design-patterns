package Singleton;

class Incremental {
	private static int count = 0;
	private int numero;
	private static Incremental uniqueInstance;

	Incremental() {
		numero = ++count;
	}
	
	public static Incremental getInstance() {
			if (uniqueInstance == null) {
			uniqueInstance = new Incremental();
			}
			return uniqueInstance;
	}

	public String toString() {
		return "Incremental " + numero;
	}
}

