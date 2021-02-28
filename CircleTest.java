import java.util.*;
public class CircleTest 
{
    public static void main(String[] args)
    {
        // Lines 7 to 9 take in user inputted radius
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double rad = scan.nextDouble();
    
        // Lines 12 to 14 generates random values for x and y from 1 to 10
        Random value = new Random();
        int x = value.nextInt(10) + 1;
        int y = value.nextInt(10) + 1;
        
        // Lines 17 and 18 create point objects for the centers of the circle
        Point point1 =  new Point(0,5);
        Point point2 = new Point(0,0);
    
        // Lines 21 and 22 create two circle objects
        Circle circle1 = new Circle(point2, rad);
        Circle circle2 = new Circle(point1, 2.5);
    
        // Lines 25 and 26 print out descriptions of the two circle objects
        System.out.println(circle1);
        System.out.println(circle2);

        // Finds the distance between the two centers of the circles
        //double distance = circle1.getCenter().distance(circle2.getCenter());
        double distance = circle1.distanceFromCenters(circle2);

        boolean inter = circle1.intersect(circle2);

        if (inter)
        {
            System.out.println("The circles do intersect");
        }
        else 
        {
            System.out.println("The circles do nit intersect");
        }
        
        // Prints out description of the distance between the two centers
        System.out.println("The distance between the centers of the two circles is " + distance);
    }
}