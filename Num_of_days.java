// Write a Java program print total number of days in a month using switch case.

import java.util.Scanner;

public class Num_of_days {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month_num = sc.nextInt();
        switch(month_num)
        {
            case 1:
            System.out.println("January has 31 days");
            break;
            
            case 2:
            System.out.println("February has 29 days");
            break;
            
            case 3:
            System.out.println("March has 31 days");
            break;
            
            case 4:
            System.out.println("April has 30 days");
            break;
            
            case 5:
            System.out.println("May has 31 days");
            break;
            
            case 6:
            System.out.println("June has 30 days");
            break;
            
            case 7:
            System.out.println("July has 31 days");
            break;
            
            case 8:
            System.out.println("August has 31 days");
            break;
            
            case 9:
            System.out.println("September has 30 days");
            break;
            
            case 10:
            System.out.println("October has 31 days");
            break;
            
            case 11:
            System.out.println("November has 30 days");
            break;
            
            case 12:
            System.out.println("December has 30 days");
            break;            
            
            default:
            System.out.println("Wrong choice");

        }

    }
    
}