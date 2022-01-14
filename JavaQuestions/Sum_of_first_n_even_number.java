import java.util.*;

public class Sum_of_first_n_even_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i = 0;

        System.out.print("Please enter a number : ");

        int n = sc.nextInt();

        //Calculating the sum

        while ( i < n) {

            sum += 2 * i;
            i++;

        }

        System.out.println("The sum is : " + sum );

    }

}