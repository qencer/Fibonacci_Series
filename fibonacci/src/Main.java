public class Main {
    public static void main(String[] args) {
        /* The Fibonacci Sequence is a series of numbers
         obtained by adding each number with the previous number.
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
         233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946

         ** It can start with any number.
            4-4-8-12-20-32-52-84

         *** Let's do a fibonacci example with
             20 variables and starting at 0.

         x  y  z
            x  y  z
               x  y  z

         */

        int x = 0;
        int y = 1;
        int z;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 20; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
        }
    }
}