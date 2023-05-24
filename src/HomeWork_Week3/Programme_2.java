package HomeWork_Week3;
/**
 * Write a java programme to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;
public class Programme_2
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year:");
        int year =in.nextInt();


        boolean x =(year % 4) ==0;
        boolean y =(year % 100) !=0;
        boolean z =((year % 100 ==0)&& (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " Is a leap year");

        }
        else
        {
            System.out.println(year + " Is not a leap year");
        }
    }
}
