package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1.Ask user for a season of the year
        System.out.println("What's your favorite season of the year?");
        String season = scanner.next();
        //2.Ask user for a whole number
        System.out.println("What's your favorite number?");
        int number = scanner.nextInt();
        //3.Ask user for an adjective
        System.out.println("Tell me an adjective!");
        String adjective = scanner.next();
        //4.Complete the sentence
        scanner.close();
        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+number+" cups of coffee");


    }
}
