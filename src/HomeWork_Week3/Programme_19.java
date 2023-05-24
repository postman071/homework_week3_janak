package HomeWork_Week3;

/**
 * Write a java programme to calculate the average value of array elements
 */

public class Programme_19
{
    public static void main(String[]args)
    {
        double [] numArray ={45.3, 67.5,-45.6,20.34,33.0,45.6};
        double sum=0.0;

        for(double num:numArray)
        {
            sum+=num;
        }
        double average =sum/numArray.length;
        System.out.format("The average is: %.2f",average);
    }
}
