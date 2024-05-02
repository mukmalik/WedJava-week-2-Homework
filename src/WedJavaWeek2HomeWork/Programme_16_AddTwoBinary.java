package WedJavaWeek2HomeWork;

import java.util.Scanner;

public class Programme_16_AddTwoBinary
{
    public static String addTwoBinaryNumber(String first, String Second)
    {
        /**
         * The parseInt method parses a value as a string and returns the first integer.
         * A radix parameter specifies the number system to use:
         * 2 = binary, 8 = octal, 10 = decimal, 16 = hexadecimal.
         * If radix is omitted, JavaScript assumes radix 10. If the value begins with "0x", JavaScript assumes radix 16.
         */
        int b1 = Integer.parseInt(first,2);
        int b2 = Integer.parseInt(Second, 2);
        int sum = b1+b2;
        return  Integer.toBinaryString(sum);

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to java program to add two binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scanner.nextLine();

        System.out.println("please enter second binary number");
        String second = scanner.nextLine();

        String addition = addTwoBinaryNumber(first,second);
        System.out.println("The addition of two binay number is : "+addition);
    }

}
