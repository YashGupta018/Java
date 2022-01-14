package Functions;

public class functions_in_java  {

    public static double average(int a, int b, int c) {
        return (a + b + c)/3.0;//Average Function
    }
    public static double averageplus1(int a, int b, int c) {
        double d = (a + b + c)/3.0;//Function which finds the average and adds 1 to it
        return d + 1;
    }

    public static void main (String[]args) {

        int a = 65;
        int b = 5;
        int c = 78;

        double avg = (a + b + c)/3.0;//Finding Average without functions
        System.out.println(avg);
        System.out.println(average(65, 5, 78));
        System.out.print(averageplus1(65, 5, 78));

    }
}