/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author 348676487
 */
public interface Shape {

    /**
     * Scale a shape by multiplying its coordinates by a given factor.
     *
     * @param factor The number to scale the shape by.
     */
    public void scale(double factor);

    /**
     * Reflect a shape across the x or y axis given the axis to reflect across.
     *
     * @param axis The axis that the shape is reflected across.
     */
    public void reflect(char axis);

    /**
     * Translate a shape by shifting its coordinates in the x and y axis given x
     * and y shift value.
     *
     * @param translateX The number to shift in the x axis.
     * @param translateY The number to shift in the y axis.
     */
    public void translate(double translateX, double translateY);

    /**
     * Rotate a shape by rotating it about the origin.
     *
     * @param angle The angle to rotate the shape by.
     */
    public void rotate(double angle);

    /**
     * Return the area of a shape.
     *
     * @return Area of the shape.
     */
    public double area();

    /**
     * Return whether a shape is equal to another shape given an object by
     * comparing its points.
     *
     * @param obj The object to compare the shape to.
     * @return True if the shapes are equal. False if the shapes are not equal.
     */
    @Override
    public boolean equals(Object obj);

    /**
     * Output the coordinates that make up the shape.
     *
     * @return The coordinates of the shape as a string.
     */
    @Override
    public String toString();

    /**
     * Return the color.
     * @return The color.
     */
    public Color getColor();

    /**
     * Set the color.
     * @param c The color to set
     */
    public void setColor(Color c);

    /**
     * Array of all the x coordinates of the shape.
     *
     * @return Array of x coordinates.
     */
    public int[] getAllX();

    /**
     * Array of all the y coordinates of the shape.
     *
     * @return Array of y coordinates.
     */
    public int[] getAllY();
}
