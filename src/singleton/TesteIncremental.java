package singleton;

public class TesteIncremental {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            Incremental incremental = Incremental.getInstance();
            System.out.println(incremental);
        }
    }

    public static final class Incremental{
        private int count = 0;
        private int numero;

        private Incremental(){
            numero = ++count;
        }

        private static class IncrementalHolder{
            private static final Incremental INSTANCE = new Incremental();
        }

        public static Incremental getInstance(){
            return IncrementalHolder.INSTANCE;
        }

//        public String toString(){
//            return "Incremental "+ numero;
//        }
    }
}
