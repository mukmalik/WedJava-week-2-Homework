package WedJavaWeek2HomeWork;

import java.util.Scanner;
/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase
{
    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text)
    {
        System.out.println("The lowercase value is = "+text.toLowerCase());
    }

    public static void main(String[] args)
    {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper string  =  ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();
        obj.convertUppercaseToLowerCase(uppercase);
        //closing scanner class
        scanner.close();

    }
}
