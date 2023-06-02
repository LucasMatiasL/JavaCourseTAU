package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary:");
        double salary = scanner.nextInt();
        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextInt();

        //Make decision
        if(salary>=requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan.");
            } else {
                System.out.println("Sorry, you must have worked at your current job " + requiredYearsEmployed + " years.");
            }
        }else{
            System.out.println("Sorry, you must earn at least $"+requiredSalary+" to qualify for the loan");
        }
    }
}
