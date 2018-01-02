/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 Log:
 Changed the constructor by taking only two points in as parameters. 
 The area method was also simplified since only two points are used.
 Removed the extra getters and setters.
 Added global variable c to store the color of the rectangle.
 Added getters and setter to return and set the color of the rectangle.
 Added getters to return the x/y coordinates of the rectangle in an array.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author 348676487
 */
public class Rectangle implements Shape {

    private Point first;
    private Point second;

    Color c;

    /**
     * Default for creating a rectangle with four default points. The points
     * connect such that: first connects with second, second connects with
     * third, third connects with fourth, and fourth connects with first.
     */
    public Rectangle() {
        first = new Point();
        second = new Point();
    }

    /**
     * A rectangle is created given four points. The points are sent in as
     * parameters where each point connects to the next: first connects with
     * second, second connects with third, third connects with fourth, and
     * fourth connects with first.
     *
     * @param first First point (connects to second and fourth).
     * @param second Second point (connects to third and first).
     */
    public Rectangle(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Return the first point of the rectangle.
     *
     * @return The point.
     */
    public Point getFirst() {
        return first;
    }

    /**
     * Return the second point of the rectangle.
     *
     * @return The point.
     */
    public Point getSecond() {
        return second;
    }

    /**
     * Set the first point of the rectangle.
     *
     * @param first The point to set.
     */
    public void setFirst(Point first) {
        this.first = first;
    }

    /**
     * Set the second point of the rectangle.
     *
     * @param second The point to set.
     */
    public void setSecond(Point second) {
        this.second = second;
    }

    @Override
    public void scale(double factor) {
        first.scale(factor);
        second.scale(factor);
    }

    @Override
    public void reflect(char axis) {
        first.reflect(axis);
        second.reflect(axis);
    }

    @Override
    public void translate(double translateX, double translateY) {
        first.translate(translateX, translateY);
        second.translate(translateX, translateY);
    }

    @Override
    public void rotate(double angle) {
        first.rotate(angle);
        second.rotate(angle);
    }

    @Override
    public double area() {
        return (second.getX() - first.getX()) * (second.getY() - first.getY());
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle object = (Rectangle) obj;
        return first.equals(object.first) == true && second.equals(object.second);
    }

    @Override
    public String toString() {
        return first.toString() + " to " + second.toString() + ".";
    }

    @Override
    public Color getColor() {
        return c;
    }

    @Override
    public void setColor(Color c) {
        this.c = c;
    }

    @Override
    public int[] getAllX() {
        return new int[]{(int) getFirst().getX(), (int) getSecond().getX(), (int) getSecond().getX(), (int) getFirst().getX()};
    }

    @Override
    public int[] getAllY() {
        return new int[]{(int) getFirst().getY(), (int) getFirst().getY(), (int) getSecond().getY(), (int) getSecond().getY()};
    }
}
