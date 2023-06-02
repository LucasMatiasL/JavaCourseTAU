package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies do you have?");
        int penniesC = scanner.nextInt();
        System.out.println("How many nickels do you have?");
        int nicklesC = scanner.nextInt();
        System.out.println("How many dimes do you have?");
        int dimesC = scanner.nextInt();
        System.out.println("How many quarters do you have?");
        int quartersC = scanner.nextInt();

        double pennies = penniesC * 0.1;
        double nickles = nicklesC * 0.5;
        double dimes = dimesC * 0.10;
        double quarters = quartersC * 0.25;

        double total = pennies + nickles + dimes + quarters;

        if(total==1){
            System.out.println("You win!");
            System.out.println("You have one dollar!");
        } else if(total>1){
            System.out.println("You have "+total);
            System.out.println("You lost!");
        } else {
            System.out.println("You have less than a dollar.");
            System.out.println("You have "+total);
        }





    }
}
