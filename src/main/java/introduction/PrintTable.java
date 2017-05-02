package introduction;

/**
 * 1.4. Write a program that displays the following table:
 * a   a^2   a^3
 * 1   1     1
 * 2   4     8
 * 3   9     27
 * 4   16    64
 *
 * @author Roman.
 */
public class PrintTable {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i < 5; i++) {
            System.out.println(i + "\t" + i * i + "\t" + i * i * i);
        }
    }
}
