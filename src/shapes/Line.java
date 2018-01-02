/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 Log:
 Added global variable c to store the color of the line.
 Added getters and setter to return and set the color of the line.
 Added getters to return the x/y coordinates of the line in an array.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author 348676487
 */
public class Line implements Shape {

    private Point pointA;
    private Point pointB;

    Color c;

    /**
     * Default for creating a line with two default points.
     */
    public Line() {
        pointA = new Point();
        pointB = new Point();
    }

    /**
     * Create a line given two points.
     *
     * @param a First point.
     * @param b Second point.
     */
    public Line(Point a, Point b) {
        pointA = a;
        pointB = b;
    }

    /**
     * Return the first point of the line.
     *
     * @return The point.
     */
    public Point getPointA() {
        return pointA;
    }

    /**
     * Return the second point of the line.
     *
     * @return The point.
     */
    public Point getPointB() {
        return pointB;
    }

    /**
     * Set the first point of the line.
     *
     * @param a The point to set.
     */
    public void setPointA(Point a) {
        pointA = a;
    }

    /**
     * Set the second point of the line.
     *
     * @param b The point to set.
     */
    public void setPointB(Point b) {
        pointB = b;
    }

    @Override
    public void scale(double factor) {
        pointA.scale(factor);
        pointB.scale(factor);
    }

    @Override
    public void reflect(char axis) {
        pointA.reflect(axis);
        pointB.reflect(axis);
    }

    @Override
    public void translate(double translateX, double translateY) {
        pointA.translate(translateX, translateY);
        pointB.translate(translateX, translateY);
    }

    @Override
    public void rotate(double angle) {
        pointA.rotate(angle);
        pointB.rotate(angle);
    }

    @Override
    public double area() {
        return 0;
    }

    public double distance() {
        return pointA.distance(pointB);
    }

    @Override
    public boolean equals(Object obj) {
        Line object = (Line) obj;
        return pointA.equals(object.pointA) == true && pointB.equals(object.pointB) == true;
    }

    @Override
    public String toString() {
        return pointA.toString() + " to " + pointB.toString() + ".";
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
        return new int[]{(int) getPointA().getX(), (int) getPointB().getX()};
    }

    @Override
    public int[] getAllY() {
        return new int[]{(int) getPointA().getY(), (int) getPointB().getY()};
    }
}
