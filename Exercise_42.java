import java.util.Scanner;

public class Excercise_42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the height of the triangle from keyboard: ");
        int number = sc.nextInt();
         for(int i = 1; i <= number; i++){
             for(int j = 1; j <= (2 * number -1); j++){
                 if(Math.abs(number - j) <= (i - 1)){
                     System.out.print(" * ");
                 }else {
                     System.out.print("   ");
                 }
             }
             System.out.println("");
         }

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= (2 * number -1); j++){
                if(Math.abs(number - j) <= (i - 1)){
                    System.out.print(" " + Math.abs(number - j) + " ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }
}
