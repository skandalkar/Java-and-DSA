import java.util.Scanner;

public class Input_Output_in_Java
{
    public static void main(String[] args)
    {
        /* In Java language the Scanner class is used to take inputs from user side from java.util package
           and BufferedReader is also used from java.io package
        */
        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;
        float per;
        String grade ;
        boolean agree;
        long  mobile;
        System.out.println("Enter your full name: ");
        name = sc.nextLine();

        System.out.println("Enter the roll no: ");
        rollno = sc.nextInt();

        System.out.println("Enter the mobile no: ");
        mobile = sc.nextLong();

        System.out.println("Enter the grade: ");
        grade = sc.nextLine();

        System.out.println("Enter your previous year percentages:");
        per = sc.nextFloat();

        System.out.println("****************************************************");
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Mobile no: "+mobile);
        System.out.println("Grade: "+grade);
        System.out.println("Percentages: "+per);
    }
}
