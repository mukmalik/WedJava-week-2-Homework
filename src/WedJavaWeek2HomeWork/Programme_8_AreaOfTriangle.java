package WedJavaWeek2HomeWork;

import java.util.Scanner;
/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle
{
    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height)
    {
        int area =(length*height);
        System.out.println("The are of triangle is : "+area);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the length : ");
        int length = scanner.nextInt();

        System.out.println("please enter the height : ");
        int height = scanner.nextInt();

        areaOfTriangle(length,height);
        scanner.close();
    }
}
