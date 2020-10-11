import java.util.Scanner;

public class Exercise_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input number of fibonacci number you want number = ");
        int number = sc.nextInt();
        int temp1 = 0, temp2 = 1, sum = 0;

        do{
            System.out.print(temp1 + " ");
            sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }while (sum <= number);
    }
}
