package WedJavaWeek2HomeWork;

import java.util.Scanner;

public class Programme_19_ConvertStringToLowerCase
{
    public void convertStringToLowerCase(String str)
    {
        System.out.println("The lowercase of the string  : "+str.toLowerCase());
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter uppercase sentence : ");
        String str = scanner.nextLine();

        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(str);
    }


}
