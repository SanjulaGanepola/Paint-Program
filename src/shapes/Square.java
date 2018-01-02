/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 Log of Changes:
 Changed the constructor to only take in two parameters.
 Changed the if statement for throwing an exception.
 */
package shapes;

/**
 *
 * @author 348676487
 */
public class Square extends Rectangle {

    /**
     * Default for creating a square with four default points. The points
     * connect such that: the first point connects with second point, the second
     * point connects with third point, the third point connects with fourth
     * point, and the fourth point connects with first point.
     */
    public Square() {
        super();
    }

    /**
     * A square is created given four points. The points are sent in as
     * parameters where each point connects to the next: First connects with
     * second, second connects with third, third connects with fourth, and
     * fourth connects with first. An exception is thrown when points are given
     * that do not create a square.
     *
     * @param one First point (connects to second and fourth).
     * @param two Second point (connects to third and first).
     */
    public Square(Point one, Point two) {
        super(one, two);
        if ((two.getX() - one.getX()) != (two.getY() - one.getY())) {
            throw new IllegalStateException("NOT A SQUARE");
        }
    }

}
