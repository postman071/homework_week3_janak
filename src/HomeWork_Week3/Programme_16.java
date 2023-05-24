package HomeWork_Week3;
/**
 * Write the java programme to check if enter is "POSITIVE","NEGATIVE" or "ZERO"
 */

import java.util.Scanner;

public class Programme_16
{
    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Input a Number");
        int n = in.nextInt();

        if(n>0)
        {
            System.out.println("Number is possitive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }

}
