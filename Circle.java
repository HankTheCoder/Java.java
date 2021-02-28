public class Circle 
{
    private Point center;
    private double radius;

    // Constructor method that instantiates circle object
    public Circle(Point center1, double radius1)
    {
        center = center1;
        radius = radius1;
    }

    // Getter method for center point
    public Point getCenter()
    {
        return center;
    }

    // Getter method for radius
    public double getRadius()
    {
        return radius;
    }

    // Setter method for center point
    public void setCenter(Point newPoint)
    {
        center = newPoint;
    }

    // Setter method for radius
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }

    // toString() method for description of circle
    public String toString()
    {
        return "The circle has a radius of " + radius + " and a center point of " + center;
    }

    public double distanceFromCenters(Circle circle)
    {
        return this.center.distance(circle.center);
    }

    public boolean intersect(Circle circle)
    {
        return this.radius+circle.radius >= this.distanceFromCenters(circle); 
    }
}