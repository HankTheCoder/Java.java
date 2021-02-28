public class Point
{
    private int x, y;

    // Constructor method that instantiates point object
    public Point(int newX, int newY)
    {
       x = newX;
       y = newY;
    }

    // toString() method for description of point
    public String toString()
    {
       return "x: "+ x + ", " + "y: " + y;
    }
    
    // Method used to calculate distance between points
    public double distance(Point other)
    {
       return Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
    }
}
