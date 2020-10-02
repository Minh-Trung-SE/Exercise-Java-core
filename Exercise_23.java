import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any value int from keybord: ");
        number = sc.nextInt();
        System.out.println("Result");
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
