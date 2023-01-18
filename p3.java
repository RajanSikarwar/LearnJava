/*Make a program that takes the radius of a circle as input, 
calculates its circumference  and area and prints it as output to the user.
 */
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Enter circle radius: ");

        int radius = sc.nextInt();
        double circumference  = 2*PI*radius;
        double area = PI*radius*radius;

        System.out.println("circle circumference  is: " + circumference );
        System.out.println("circle area is: " + area);

    }
}
