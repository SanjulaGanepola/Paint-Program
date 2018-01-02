/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 Log:
 Added global variable c to store the color of the point.
 Added getters and setter to return and set the color of the point.
 Added getters to return the x/y coordinates of the point in an array.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author 348676487
 */
public class Point implements Shape {

    private double x;
    private double y;

    Color c;

    /**
     * Default for creating a point with default x and y values at (0,0).
     */
    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * Create a point given x and y values.
     *
     * @param x The x coordinate.
     * @param y The y coordinate.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Return the x value of the point.
     *
     * @return The x value.
     */
    public double getX() {
        return x;
    }

    /**
     * Return the y value of the point.
     *
     * @return The y value.
     */
    public double getY() {
        return y;
    }

    /**
     * Set the x value of the point.
     *
     * @param x The x value.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Set the y value of the point.
     *
     * @param y The y value.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Add to the x and y values of the point given another point.
     *
     * @param a The point with the x and y values to add.
     */
    public void add(Point a) {
        x += a.x;
        y += a.y;
    }

    /**
     * Return the length of a point to the origin.
     *
     * @return Length of a point to origin.
     */
    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Return the distance between the point and a given point.
     *
     * @param p The point to determine the distance to.
     * @return The distance between the point and point p;
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    @Override
    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }

    @Override
    public void reflect(char axis) {
        //Reflect accross x axis
        if (axis == 'x') {
            y *= -1;
        } //Reflect accross y axis
        else {
            x *= -1;
        }
    }

    @Override
    public void translate(double translateX, double translateY) {
        x += translateX;
        y += translateY;
    }

    @Override
    public void rotate(double angle) {
        x = x * Math.cos(angle) - y * Math.sin(angle);
        y = x * Math.sin(angle) + y * Math.cos(angle);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Point object = (Point) obj;
        return x == object.x && y == object.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
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
        return new int[]{(int) getX()};
    }

    @Override
    public int[] getAllY() {
        return new int[]{(int) getY()};
    }
}
