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
    
    /**
     * Calculates the volume of a sphere.
     * 
     * @param radius    length of radius of the sphere
     * @return  volume of the sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a triangle.
     * 
     * @param ta1   triangle area #1
     * @param ta2   triangle area #2
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
           
    }
    
    /**
     * Calculates the area of a trapezoid.
     * 
     * @param base1    one of the bases of the trapezoid
     * @param base2     the other base of the trapezoid
     * @param height    height of the trapezoid
     * @return  area of the trapezoid
     */
    public static double trapezoidArea(double base1, double base2, double height)
    {
        double area = (base1 + base2) / 2.0 * height;
        
        return area;
    }
    
    /**
     * Calculates the volume of a rectangular prism
     * 
     * @param length    the length of the rectangular prism
     * @param width     the width of the rectangular prism
     * @param height    the height of the rectangular prism
     * @return  volume of the rectangular prism
     */
    public static double rectangularPrismVolume(double length, double width, double height)
    {
        double volume = length * width * height;
        
        return volume;
    }
    
    /**
     * Calculates the volume of a cone
     * 
     * @param radius    the radius of the cone base
     * @return  volume of the cone
     */
    public static double coneVolume(double radius)
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the surface area of a rectangular prism
     * 
     * @param width     width of the prism
     * @param length    length of the prism
     * @param height    height of the prism
     * @return  surface area of the rectangular prism
     */
    public static double rectangularPrismSurfaceArea(double width, double length, double height)
    {
        return (width * length + height * length + height * width) /2.0;
    }
    
    /**
     * Calculates the surface area of a sphere
     * 
     * @param radius    radius of the circle
     * @return  surface area of the sphere
     */
    public static double sphereSurfaceArea(double radius)
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Calculates the hypotenuse of a right triangle
     * 
     * @param leg1  one leg of the triangle
     * @param leg2  the other leg of the triangle
     * @param hypotenuse    longest side of the triangle
     * 
     * @return  hypotenuse of the right triangle
     */
    public static double hypotenuseRightTriangle(double leg1, double leg2, double hypotenuse)
    {
        hypotenuse = (Math.pow(leg1, 2) + Math.pow(leg2, 2));
        return Math.sqrt(hypotenuse);
    }
    
    /**
     * Calculates the distance between 2 points
     * @param x1    x value of the 1st point
     * @param y1    y value of the 1st point
     * @param x2    x value of the 2nd point
     * @param y2    y value of the 2nd point
     * 
     * @return  distance between the 2 points
     */
    public static double distanceBetween2Points(double x1, double y1, double x2, double y2)
    {
        double dividend = Math.pow((x2 - x1), 2.0) + Math.pow ((y2 - y1), 2.0);
        return Math.sqrt(dividend);
    }
    
    /**
     * Calculates the slope between 2 points
     * @param x1    x value of the 1st point
     * @param y1    y value of the 1st point
     * @param x2    x value of the 2nd point
     * @param y2    y value of the 2nd point
     * 
     * @return  slope between the 2 points
     */
    public static double slopeBetween2Points (double x1, double x2, double y1, double y2)
    {
        return (y2 - y1) / (x2 - x1);
    }
    
    /**
     * Calculates the area of a triangle #2
     * 
     * @param a     length of side 1 of the triangle
     * @param b     length of side 2 of the triangle
     * @param c     length of side 3 of the triangle
     * @param s     half of all the side lengths added together
     */
    public static double triangleAreaABC (double a, double b, double c)
    {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}