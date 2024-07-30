public class Key_Concepts
{
    public static void main(String[] args)
    {
        /** Variable is memory or storage location name where data or variable is stored.
         It stores only last value to be assigned */
       /* Rules for variables all types:
        1) Variable should not start with digit.
        2) Only underscore(_) and dollar-sign ($) are allowed to use.
        3) Variable name should not be keyword.
        4) Variables should be combination of alphabets, digits and (_) or ($) these special symbols only.
        5) White spaces are not allowed
       */
        int int_variable = 10;   // integer variable
        float float_variable = 3.14f;  // float variable
        char char_variable = 'a';   // character variable

        /** Data type defines the value to be stored into the variables */
        /*   1) Primitive data types: int, float, char, boolean, long, short, byte, double.
             2) Non-primitive data types: Array, Strings, class, object, interface
        */
        int a = 10;   // integer variable
        float f = 3.14f;  // float variable
        char c = 'a';   // character variable

        /* Keywords are the reserved words which has a specific meaning for it, it cannot use
         in program as a variable name, object name, function name, class name and more
         where user-defined need.
         keywords like: int, float, if, else, default, case, switch, do, while, static, final, finally, etc
        */

        /*  Comments: Comments are used to provide the extra information about the code.
             i) Single line comment { // comments }
             ii) Multi-line comments
        */

        System.out.println("\n\n");
        /** Operators in Java
         * 1. Arithmetic operators (+, -, *, /, %)
         * 2. Assignment Operators (=, +=, -=, *=, /=, %=)
         * 3. Comparision  operators (<, >, <=, =>, !=, ==)
         * 4. Increment-Decrement Operator (++var_name, var_name++, --var_name, var_name--)
         * 5. Logical operators (&&, ||, !)
         * 6. Ternary Operator ( ? : ;)
         * /***************************************/


        // Arithmetic operators
        int n1 = 10, n2 = 15;
        System.out.println("Addition: "+(n1+n2));
        System.out.println("Subtraction: "+(n1-n2));
        System.out.println("Multiplication: "+(n1*n2));
        System.out.println("Quotient (Division): "+(n1/n2));
        System.out.println("Remainder (Division): "+(n1%n2));

        // Assignment Operators
        int num1 = 10, num2;
        num2 = num1; //assigned to other variable
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);

        System.out.println("\n");

        // Comparision  operators
        int val1 = 10, val2 = 20;
        System.out.println((val1>val2)); // false
        System.out.println((val1<val2)); // true
        System.out.println((val1>=val2)); // false
        System.out.println((val1<=val2)); // true
        System.out.println((val1==val2)); // false
        System.out.println((val1!=val2)); // true


        // Increment-Decrement Operator
        int number1 = 5;
        System.out.println(number1);
        System.out.println(++number1); // pre-inc
        System.out.println(number1++); // post-inc // 6

        int number2 = 10;
        System.out.println(number2);
        System.out.println(--number2); // pre-dec
        System.out.println(number2--); // post-dec // 9



        // Logical operators
        int var = 155, var2 = 177, var3 = 166;
        if (var > var2 && var < var3 )  //false
        {
            System.out.println("false");
        }

        if (var > var2 || var < var3 ) //true
        {
            System.out.println("true");
        }

        if (var != var2) // true
        {
            System.out.println("Neutral");
        }


        System.out.println("\n\n");


        // Ternary Operator ( ? : ;)

        int max = (15 > 10? 15 : 10);
        System.out.println("Greater value : "+max);
    }
}
