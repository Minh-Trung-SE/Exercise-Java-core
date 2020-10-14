import java.util.Scanner;

public class Exercise_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number element of array: ");
        int temp, element = sc.nextInt();
        int[] array = new int[element];

        //input element of array
        for(int i = 0; i < element; i++){
            System.out.print("Array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        //check and removing element duplicate
        for(int i = 0; i < (element - 1); i++){
            if(array[i] == array[i+1]){
                for(int j = i + 1; j < element; j++){
                    array[j - 1] = array[j];
                }
                element--;
            }
        }
        //output array after removing duplicate
        System.out.println("Array after removing duplicate:");
        for(int j = 0; j < element; j++){
            System.out.print(array[j] + " ");
        }
    }
}
