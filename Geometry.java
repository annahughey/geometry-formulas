/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (Anna Hughey) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param base  length of base of parallelogram
     * @param height  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triangle.
     *
     * @param base  length of base of triangle
     * @param height  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
           
    }
    
    public static double trapezoidArea(double base1, double base2, double height)
    {
        double area = (base1 + base2) / 2.0 * height;
        
        return area;
    }
    
    public static double rectangularPrismVolume(double length, double width, double height)
    {
        double volume = length * width * height;
        
        return volume;
    }
    
    public static double coneVolume(double radius)
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double rectangularPrismSurfaceArea(double width, double length, double height)
    {
        return (width * length + height * length + height * width) /2.0;
    }
    
    public static double sphereSurfaceArea(double radius)
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    
    public static double hypotenuseRightTriangle(double leg1, double leg2, double hypotenuse)
    {
        (Math.pow(leg1, 2) + Math.pow(leg2, 2)) = hypotenuse;
        return Math.sqrt(double hypotenuse);
    }
    
    public static double distanceBetween2Points(double x1, double y1, double x2, double y2, double dividend)
    {
        Math.pow((x2 - x1), 2) + Math.pow ((y2 - y1), 2) = dividend;
        return Math.sqrt(double dividend);
    }
    
    public static double slopeBetween2Points (double x1, double x2, double y1, double y2)
    {
        return (y2 - y1) / (x2 - x1);
    }
}