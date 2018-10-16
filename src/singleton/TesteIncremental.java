package singleton;

public class TesteIncremental {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            Incremental incremental = new Incremental();
            System.out.println(incremental);
        }
    }

    public static class Incremental{
        private int count = 0;
        private int numero;

        public Incremental(){
            numero = ++count;
        }

        public String toString(){
            return "Incremental "+ numero;
        }
    }
}
