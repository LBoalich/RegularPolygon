/**
 * Name: Regular Polygon
 * Author: Leah Boalich
 * Date: August 26, 2024
 * Assignment: Module 1 Exercise 9.9
 * Description:  This program creates 3 polygons and displays the perimeter and area for each one
 */

public class TestRegularPolygon {
    /** Main method */
    public static void main(String[] args) {
        // Create polygon with default values
        RegularPolygon p1 = new RegularPolygon();

        // Create polygon with 6 sides of length 4
        RegularPolygon p2 = new RegularPolygon(6, 4);

        // Create polygon with 10 sides of length 4 centered at (5.6, 7.8)
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display the perimeter and area of each polygon
        p1.printPolygon();
        p2.printPolygon();
        p3.printPolygon();
    }
}

// Define the regular polygon class with 3 constructors
class RegularPolygon {
    private int n = 3; // Default number of sides is 3
    private double side = 1; // Default length of side is 1
    private double x = 0; // Default x-coordinate of polygon's center
    private double y = 0; // Degault y-coordinate of polygon's center

    //* Construct a regular polygon with the default values */
    public RegularPolygon() {
    }

    //* Construct a regualr polygon with the given sides and length of side, centered at (0,0) */
    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
    }

    //* Construct a regular polygon with the given sides, length of side, x- and y-coordinates */
    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide; 
        x = newX;
        y = newY;
    }

    //* Get the number of sides */
     public int getSides() {
        return n;
    }  
    
    //* Get length of sides */
    public double getLength() {
        return side;
    }

    //* Get x-coordinate */
    public double getX() {
        return x;
    }

    //* Get y-coordinate */
    public double getY() {
        return y;
    }

    //* Set new number of sides n */
    public void setN(int newN) {
        n = newN;
    }

    //* Set new side length */ 
    public void setSide(double newSide) {
        side = newSide;
    }

    //* Set new x-coordinate */
    public void setX(double newX) {
        x = newX;
    }

    //* Set new y-coordinate */
    public void setY(double newY) {
        y = newY;
    }

    //* Get the perimeter */ 
    public double getPerimeter() {
        return n * side;
    }

    //* Get the area */
    public double getArea() {
        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return area;
    }   
    
    // Print polygon perimeter and area
    public void printPolygon() {
        System.out.printf("A polygon with %d sides of length %.0f has a perimeter of %.2f and an area of %.2f \n", n, side, getPerimeter(), getArea());
    }
}
