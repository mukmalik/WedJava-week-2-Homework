import java.util.Scanner;

public class Programme_17_DecimalToBinary
{
    public static void convertDecimalToBinary(int num)
    {
        String binary = Integer.toBinaryString(num);
        System.out.println("the binary value is :"+binary);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        scanner.close();
    }
}
