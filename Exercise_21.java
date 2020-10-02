import java.util.Scanner;

public class Exercise_21 {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.println("Let's input value a from keyboard = ");
        number1 = sc.nextInt();
        System.out.println("Let's input value b from keyboard = ");
        number2 = sc.nextInt();
        System.out.println("a + b = " +(number1 + number2));
        System.out.println("a - b = " +(number1 - number2));
        System.out.println("a * b = " +(number1 * number2));
        System.out.println("a / b = " +(number1 / number2));
        System.out.println("a % b = " +(number1 % number2));
    }
}
