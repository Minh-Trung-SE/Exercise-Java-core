public class Exercise_43 {
    public static void main(String[] args) {
        //List number divisible for 3
        System.out.println("List number which divisible for 3:");
        for(int i = 3; i <= 100; i++){
            if(i % 3 == 0){
                System.out.print(i +" ");
            }
        }
        //List number divisible for 5
        System.out.println("");
        System.out.println("List number which divisible for 5:");
        for(int i = 3; i <= 100; i++){
            if(i % 5 == 0){
                System.out.print(i +" ");
            }
        }
        //List number divisible both 3 and 5
        System.out.println("");
        System.out.println("List number which divisible both 5 and 3:");
        for(int i = 3; i <= 100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.print(i +" ");
            }
        }
    }
}
