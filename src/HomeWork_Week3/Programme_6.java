package HomeWork_Week3;
/**
 * Write a java programme to input any number and find out if it's odd or even
 */

import java.util.Scanner;

public class Programme_6
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.print("Enter a number:");
        int num = reader.nextInt();

        if(num % 2==0)
            System.out.println(num + " Is Even");
        else
            System.out.println(num + " Is odd");


    }
}
