public class Complete_conditional_statements
{
    public static void main(String[] args)
    {
        /**
         The conditional Statements or control statements are used to control the execution flow of program
         using different types of statements like if, if-else, if-else-if ladder, nested if-else and switch case
         statements, etc. and various jump statements.
         In Java there are two types of control statements
            1. Conditional Statements
            2. Iterative Statements

         Conditional statements are used to control the flow of program using various conditional statements like
         if, if-else, if-else-if ladder, nested if-else and switch case
         statements, etc.

         Iterative Statements are used to iterate or run or execute program until certain condition using various
         statements like for loop, while loop, do-while loop, foreach loop etc.
         It is also called the "Looping Statements".

         */

        // Simple if Statement
        int age = 14;
        if (age >= 18)
        {
            System.out.println("You are eligible to Vote");
        }

        /* ----------------- */
        System.out.println("\n");

        // if-else Statement
        age = 18;

        if (age >= 18)
        {
            System.out.println("You are eligible to Vote");
        }
        else
        {
            System.out.println("You are not eligible to Vote");
        }

        /* ----------------- */
        System.out.println("\n");

        // if-else-if ladder Statement
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        if(n1 > n2)
        {
            System.out.println(n1+" is Greater.");
        }
        else if (n2 > n3)
        {
            System.out.println(n2+" is Greater.");
        }
        else
        {
            System.out.println(n3+" is Greater.");
        }


        /* ----------------- */
        System.out.println("\n");


        // Nested if-else Statement
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;

        if (num1 > num2)
        {
            if (num1 > num3)
            {
                System.out.println(num1+" is Greater.");
            }
            else
            {
                System.out.println(num3+" is Greater.");
            }
        }
        else
        {
            if (num2 > num3)
            {
                System.out.println(num2+" is Greater.");
            }
            else
            {
                System.out.println(num3+" is Greater.");
            }
        }



        /* ----------------- */
        System.out.println("\n");

        // switch-case Statements
        char character = 'a';
        switch (character)
        {
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.println("Vowel Character");
                break;

            default:
                System.out.println("Consonant Character");
        }
    }
}