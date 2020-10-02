import java.util.Scanner;

public class Exercise_22 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Input value a: ");
        number = sc.nextInt(); // input value of number;
        System.out.println("Result of " + number + " + " + (number * 11) + " + " + (number * 111) + " = " + (number + number * 11 +number * 111));
    }
}
