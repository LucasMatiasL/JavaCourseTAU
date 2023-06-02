package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade:");
        String grade = scanner.nextLine();
        scanner.close();

        String message;
        switch(grade){

            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }
        System.out.println(message);

    }
}
