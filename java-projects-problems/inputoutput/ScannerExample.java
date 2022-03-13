package InputOutput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name: ");
        name=scanner.nextLine();
        System.out.println("Enter your age: ");
        age=scanner.nextInt();
        System.out.println("Your name: "+name+", your age: "+age);

        scanner.close();
    }


}
