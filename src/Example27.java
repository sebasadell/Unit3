public class Example27 {
    public static void main(String[] argv) {
        int fibo1 = 0;
        int fibo2 = 1;
        int nextFibo = 1;
        for (int i = 0; i <= 40; i++){
            System.out.println(nextFibo);
            nextFibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = nextFibo;

        }
    }
}