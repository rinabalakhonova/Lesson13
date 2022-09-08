import java.sql.SQLOutput;
import java.util.Random;

public class Main01 {
    public static void main(String[] args) {
        Random random = new Random();

        // random integer numbers

        // int bound = 100;
        // for (int i = 0; i < 10; i++) {
            // System.out.print(random.nextInt(bound) + " ");
        //}

        // for (int i = 0; 1 < 10; i++) {
        // System.out.print(random.nextInt() + " ");

    int a = 10;
    int b = 20;
    for (int i = 0; i < 10; i++) {
        System.out.print(random.nextInt(b - a + 1) + a + " ");

}
}
}
