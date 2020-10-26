import java.util.Random;
import java.util.Scanner;

public class App_test {
    public static void main(String[] args) {
        Random rd = new Random();
        int numberStore, numberSmartPhone;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of stores: ");
        numberStore = scanner.nextInt();
        Store[] stores = new Store[numberStore];
        for(int i = 0; i < stores.length; i++){
            System.out.println("Input number smartphone of store " + (i + 1) + ": ");
            numberSmartPhone = scanner.nextInt();
            scanner.nextLine();
            SmartPhone[] smartPhones = new SmartPhone[numberSmartPhone];
            for (int j = 0; j < smartPhones.length; j++){
                System.out.println("Input Brand of smartphone " + (j + 1) +" : ");
                String Brand = scanner.nextLine();
                System.out.println("Input OS of smartphone " + (j + 1) +" : ");
                String os = scanner.nextLine();
                System.out.println("Input color of smartphone " + (j + 1) +" : ");
                String color = scanner.nextLine();

                boolean hasBluetooth= true;
                boolean has5G = true;
                boolean hasWift =true;

                int memory = 64;
                long price = 5000;
                int totalSold = rd.nextInt(20);
                SmartPhone smartPhone = new SmartPhone(Brand, hasBluetooth, has5G, hasWift, os, memory, color, price, totalSold);
                smartPhones[j] = smartPhone;
            }

            System.out.println("Input name store: ");
            String nameStore = scanner.nextLine();
            System.out.println("Input name address of store: ");
            String addressStore = scanner.nextLine();
            stores[i] = new Store(nameStore, addressStore, smartPhones);
        }
        for (int i = 0; i < stores.length; i++){
            System.out.println(stores[i].toString());
        }
        StoreManagenment storeManagenment = new StoreManagenment(stores); // Có ý nghĩa là gì
        System.out.println(storeManagenment.getMinMaxRevenue(true).getNameStore() + " is store highest revenue");
        System.out.println(storeManagenment.getMinMaxRevenue(false).getNameStore() + " is store lowest revenue");
        System.out.println(storeManagenment.getMinMaxSold(true).getNameStore()+ " is store highest sold");
        System.out.println(storeManagenment.getMinMaxSold(false).getNameStore() + " is store lowest sold");
    }
}
