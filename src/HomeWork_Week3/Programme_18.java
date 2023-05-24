package HomeWork_Week3;

/**
 *
 */
public class Programme_18
{
    static int array []= {10,15,20,25,30};
    public static int sum()
    {
        int sum=0;
        int i=0;

        for(i=0;i<array.length;i++)
            sum+=array[i];
        return sum;
    }
    public static void main(String[]args)
    {
        System.out.println("Sum of array is " +sum());
    }

}
