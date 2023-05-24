package HomeWork_Week3;

/**
 * Write a java programme to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Programme_11
{
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        numberDivided3(3);
        numberDivided5(5);
    }

    public static void numberDivided3(int number) {
        if (number <= 100) {
            System.out.println(number);
            numberDivided3(number + 3);
        }
    }

    public static void numberDivided5(int number) {
        if (number <= 100) {
            System.out.println(number);
            numberDivided5(number + 5);

        }
    }
}
