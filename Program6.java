//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[] args) {
        final double Pi = 3.14159;
        double radius = 0;
        double diameter = 0;
        double area = 0; 
        double circumference = 0;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = numScanner.nextDouble();
        diameter = 2 * radius;
        area = radius * radius * Pi;
        area = (int) (1000 * area);
        area = (double) area/1000;
        circumference = diameter * Pi;
        circumference = (int) (1000 * circumference);
        circumference = (double) circumference/1000;
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
    }
}
//Paste console output below:
/*
Enter the radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.287
The Circumference of the circle = 23.323

*/
