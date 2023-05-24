package HomeWork_Week3;
/**
 * Number of Days In Month
 */

import java.util.Scanner;

public class Programme_4
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";
        System.out.print("Enter a  month number: ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        Programme_4 p =new Programme_4();
        p.isLeapYear(year);

        switch (month)
        {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                {
                    number_Of_DaysInMonth = 29;
                } else
                {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
    public int isLeapYear(int year)
    {

        boolean isLeap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        }
        else
        {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
        return year;
    }

}
