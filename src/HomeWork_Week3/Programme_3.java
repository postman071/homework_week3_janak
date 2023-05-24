package HomeWork_Week3;
/**
 * Write a java programme to input student NAme,roll no, and three subjects Maths,Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message "Invalid input,Marks should between
 * 0 and 100)and find out total,percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> 50 B,%> =35C
 */

import java.util.Scanner;

public class Programme_3
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name =in.nextLine();

        Scanner rn = new Scanner (System.in);
        System.out.println("Enter your Roll No:");
        int rollNo =rn.nextInt();
        System.out.println("Enter Maths marks");
        int Maths = rn.nextInt();
        System.out.println("Enter Science marks:");
        int Science = rn.nextInt();
        System.out.println("Enter English marks:");
        int ENg = rn.nextInt();
        MarkSheet(name,rollNo,Maths,Science,ENg);
        in.close();
        rn.close();
    }
    public static void MarkSheet(String name,int rollNo,int Maths,int Science,int Eng)
    {
        String result;
        int t =Maths + Science + Eng;
        double p=t/300.0*100.00;
        String g =" ";
        if (p>=80)
        {
            g="A+";
        } else if (p>=60)
        {
            g="A";
        } else if (p>=50)
        {
            g="B";
        } else if (p>=35)
        {
            g="C";
        }
        else
        {
            g="E";
        }
        if (p>=35 && Maths >=35 && Science >=35 && Eng >=35)
        {
            result = "Pass";
        }
        else
            result = "Fail";

        System.out.println("Total Marks = " +t);
        System.out.println("Percentage = " +p);
        System.out.println("Grade =" +g);

        System.out.println(" ''-----------------------------------'' ");
        System.out.println(" ''|                                 |'' ");
        System.out.println(" ''|            Mark  Sheet          |'' ");
        System.out.println(" ''|     Name         : "+name+"     |'' ");

        System.out.println(" ''|     Roll NO      : "+rollNo+"   |'' ");
        System.out.println(" ''|---------------------------------|'' ");
        System.out.println(" ''|     Subject      :   Marks      |'' ");
        System.out.println(" ''|     Maths        : "+Maths+"    |'' ");
        System.out.println(" ''|     Science      : "+Science+"  |'' ");
        System.out.println(" ''|     English      : "+Eng+"      |'' ");
        System.out.println(" ''|---------------------------------|'' ");
        System.out.println(" ''|     Total        :  " +t+"      |'' ");
        System.out.println(" ''|---------------------------------|'' ");
        System.out.println(" ''|     Percentage   :  " +p+"      |'' ");
        System.out.println(" ''|     Result       :  "+result+"  |'' ");
        System.out.println(" ''|     Grade        :  "+g+"       |'' ");
        System.out.println(" ''|---------------------------------|'' ");
        }


}
