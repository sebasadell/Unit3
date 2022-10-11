class Example22 {
    public static void main(String[] argv) {
        int sum, product;
        sum = 0;
        product = 1;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            product = product * i;
        }
        System.out.println("Sum from 1 to 10: " + sum);
                System.out.println("Product from 1 to 10: " + product);
    }
}