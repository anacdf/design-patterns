package singleton;

public class TesteIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          //  Incremental incremental = new Incremental(); não é possível fazer uma nova instância desse objeto.
            Incremental incremental = Incremental.getInstance();
            System.out.println(incremental);
        }
    }
}
