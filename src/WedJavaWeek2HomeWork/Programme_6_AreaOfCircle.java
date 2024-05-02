package WedJavaWeek2HomeWork;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle
{
    // calculating the area of circle
    public static void areaofCircle(double radius)
    {
        double pi = Math.PI;
        double area =(pi*radius*radius);
        System.out.println("the aea of circle is : "+area);
    }

    public static void main(String[] args)
    {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double radius = scanner.nextDouble();
        areaofCircle(radius);
        //closing scanner object
        scanner.close();
    }
}
