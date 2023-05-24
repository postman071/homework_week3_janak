package HomeWork_Week3;
/**
 * WAP to input employee id,name,basic salary then find HRA,TA,DA,PF and gross salary
 * HRA= Basic salary 10%
 * DA= Basic salary 8%
 * TA= Basic salary 9%
 * PF=Basic salary 20%
 * Gross salary = Basic salary +HRA+TA+DA-PF
 */

import java.util.Scanner;
public class Programme_5 {
    public static void main(String[] args)
    {
        float basic_salary, da, hra, da1, hra1, GrossSalary, ta, pf;
        //Declaring local variables

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter EmployeeId : ");
        int empid = scan.nextInt();

        System.out.println("Enter Employee Name : ");
        String empName = scan.next();

        System.out.println("Enter Basic Salary Of Employee: ");
        basic_salary = scan.nextFloat();

        System.out.println("Enter Basic DA Of Employee: ");
        da1 = scan.nextFloat();

        System.out.println("Enter Basic HRA Of Employee: ");
        hra1 = scan.nextFloat();

        System.out.println("Enter Basic TA Of Employee: ");
        ta = scan.nextFloat();

        System.out.println("Enter Basic PF Of Employee: ");
        pf = scan.nextFloat();
        calculation(empid, empName, basic_salary, da1, hra1, ta, pf);

    }

    public static void calculation(int empid,String empName,float basic_salary,float da,float hra,float ta,float pf)
    {
        da=(da/100)* basic_salary;
        hra =(hra/100)* basic_salary;
        ta=(ta/100)* basic_salary;
        pf=(pf/100)* basic_salary;

        float grossSalary=basic_salary+da+hra+ta-pf;
        System.out.println("_______________________________");
        System.out.println("|        Salary Slip          |");
        System.out.println("-------------------------------");
        System.out.println("| Employee Id    : " + empid + "       |");
        System.out.println("| Employee name  : " + empName + "        |");
        System.out.println("-------------------------------");
        System.out.println("| Basic Salary   : " + basic_salary + "     |");
        System.out.println("|  HRA 10%       : " + hra + "      |");
        System.out.println("|  TA 8%         : " + ta + "      |");
        System.out.println("|  DA 9%         : " + da + "      |");
        System.out.println("|  PF - 20&      : " + pf + "      |");
        System.out.println("_______________________________");
        System.out.println("|  Gross Salary  : " + grossSalary + "     |");
        System.out.println("|______________________________|");
        System.out.println("|______________________________|");


    }


}