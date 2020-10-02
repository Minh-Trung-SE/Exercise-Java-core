import java.util.Scanner;

public class Exercise_22 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("Input value a: ");
        number = sc.nextInt(); // input value of number;
        int temp = number;

        for(int i = 1; i <= 4; i++){
            if(i == 1){
                sum = number;
                continue;
            }
            number = temp + number*10;
            sum += number;
        }
        System.out.println("Sum = " + sum);

    }
}
