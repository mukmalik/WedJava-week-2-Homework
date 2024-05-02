package WedJavaWeek2HomeWork;

import java.util.Scanner;

public class Programme_7_TempConversion
{
    public void convertTemToDegreeCelsius(float temp)
    {
        float c = ((temp - 32)*5/9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");

    }

    public static void main(String[] args)
    {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        float temp = scanner.nextFloat();
        // object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTemToDegreeCelsius(temp);
        //closing the scanner object
        scanner.close();

    }

}
