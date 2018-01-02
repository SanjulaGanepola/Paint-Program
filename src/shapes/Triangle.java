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
 * @author Rohitha
 */
public class Triangle implements Shape {

    private Point first;
    private Point second;
    private Point third;

    Color c;

    /**
     * Default for creating a triangle with three default points.
     */
    public Triangle() {
        first = new Point();
        second = new Point();
        third = new Point();
    }

    /**
     * Create a triangle given three points.
     *
     * @param first First point.
     * @param second Second point.
     * @param third Third point.
     */
    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Return the first point of the triangle.
     *
     * @return The point.
     */
    public Point getFirst() {
        return first;
    }

    /**
     * Return the second point of the triangle.
     *
     * @return
     */
    public Point getSecond() {
        return second;
    }

    /**
     * Return the third point of the triangle.
     *
     * @return
     */
    public Point getThird() {
        return third;
    }

    /**
     * Set the first point of the triangle.
     *
     * @param first The point to set.
     */
    public void setFirst(Point first) {
        this.first = first;
    }

    /**
     * Set the second point of the triangle.
     *
     * @param second The point to set.
     */
    public void setSecond(Point second) {
        this.second = second;
    }

    /**
     * Set the third point of the triangle.
     *
     * @param third The point to set.
     */
    public void setThird(Point third) {
        this.third = third;
    }

    @Override
    public void scale(double factor) {
        first.scale(factor);
        second.scale(factor);
        third.scale(factor);
    }

    @Override
    public void reflect(char axis) {
        first.reflect(axis);
        second.reflect(axis);
        third.reflect(axis);
    }

    @Override
    public void translate(double translateX, double translateY) {
        first.translate(translateX, translateY);
        second.translate(translateX, translateY);
        third.translate(translateX, translateY);
    }

    @Override
    public void rotate(double angle) {
        first.rotate(angle);
        second.rotate(angle);
        third.rotate(angle);
    }

    @Override
    public double area() {
        //Shoelace formula for finding area of a triangle
        return 0.5 * ((first.getX() * first.getY() - first.getX() * first.getY()) - (first.getX() * first.getY() - first.getX() * first.getY()) - (first.getX() * first.getY() - first.getX() * first.getY()));
    }

    @Override
    public boolean equals(Object obj) {
        Triangle object = (Triangle) obj;
        return first.equals(object.first) == true && second.equals(object.second) == true && third.equals(object.third) == true;
    }

    @Override
    public String toString() {
        return first.toString() + " to " + second.toString() + " to " + third.toString() + ".";
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
        return new int[]{(int) getFirst().getX(), (int) getSecond().getX(), (int) getThird().getX()};
    }

    @Override
    public int[] getAllY() {
        return new int[]{(int) getFirst().getY(), (int) getSecond().getY(), (int) getThird().getY()};
    }
}
