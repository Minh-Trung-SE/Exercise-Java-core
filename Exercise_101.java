import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Exercise_101 {
    public static void main(String [ ] args) throws FileNotFoundException {

        //101.1
        File file1 = new File("d:/Exercise 101.1.txt");
        System.out.println(file1.exists());

        //101.2
        Scanner sc = new Scanner(System.in);
        System.out.println("Input type file (.jpg or .png ..): ");
        String typeFile = sc.nextLine();

        File file = new File("D:/Background/");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(typeFile)){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
        }
        //101.3
        new Exercise_101().findLongestWords();

    }

    //101.3
    public String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("d:/Exercise 101.1.txt"));


        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("The longest word in this file: ");
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}

