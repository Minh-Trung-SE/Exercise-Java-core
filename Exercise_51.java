public class Exercise_51 {
    public static void main(String[] args) {
        int temp1 = 0, temp2 = 0, sum = 0, element = 0;
        System.out.println("List number Armstrong between 1 to 500:");
        for(int i = 1; i <= 500; i++){
            if(i <= 9){
                if(i == i*1){
                    System.out.print(i +" ");
                }
            }
            if(i > 9 && i < 100){
                temp1 = (i/10) * (i/10) + (i%10) *(i%10);
                if(i == temp1){
                    System.out.print(i +" ");
                }
            }
            if (i >= 100) {
                temp2 = i;
                sum = 0;
                while (temp2 != 0){
                    element = temp2 % 10;
                    sum += Math.pow(element, 3);
                    temp2 /= 10;
                }
                if(i == sum){
                    System.out.print(i +" ");
                }
            }
        }
    }
}
