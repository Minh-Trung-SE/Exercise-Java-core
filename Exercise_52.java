import java.util.Scanner;

public class Exercise_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number element of array: ");
        int temp, element = sc.nextInt();
        int[] array = new int[element];
        int again = 0;

        //input element of array
        for (int i = 0; i < element; i++) {
            System.out.print("Array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        //check and removing element duplicate
        for(int i = 0; i < (element - 1); i++) {
            for(int j = i + 1; j < element; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < (element - 1); k++) {
                        array[k] = array[k + 1];
                    }
                    element--;
                    i--;
                    break;
                }
            }
        }
        //output array after removing duplicate
        System.out.println("Array after removing duplicate:");
        for (int j = 0; j < element; j++) {
            System.out.print(array[j] + " ");
        }

    }
}

