import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number : ");

        int a = sc.nextInt();
        int b;

        for (int i = 0; i < 10; i++) {
            b = i + 1;
            System.out.println( a + " X " + b + " = " + a * b );
        }

    }

}