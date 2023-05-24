package HomeWork_Week3;
/**
 * Write a java programme to test if an array contains a specific value
 */

import java.util.Scanner;
public class Programme_20
{
    public static void main(String args[])
    {

        int arr[] = { 10, 50, 20, 30, 60, 40};
        System.out.print("Array: ");
        printArray(arr);

        System.out.println("Enter item to check if it is present or not: ");
        Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();

        int index = -1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==item)
            {
                index = i;
                break;
            }
        }
        if(index == -1)
            System.out.println("Entered element is not present in the array.");
        else
            System.out.println("Entered element is present in the array.");
    }
    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    Scanner close;

}
