package HomeWork_Week3;
/**
 * Write a java programme that tell us that input number is odd or even?
 * HINT: use ternary operator(? :)
 */

import java .util.Scanner;
public class Programme1
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the to test");
        int number =sc.nextInt();

        sc.close();

        // Ternary operator to check number

        String result = number%2==0 ? "Even" : "Odd";
        System.out.println(number + "is" +result);

    }


}
