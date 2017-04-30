package ru.stqa.pft.sandbox;

/**
 * Created by IEUser on 4/26/2017.
 */
public class Distance {
    public static void main(String[] args) {
        Point pointA = new Point(1, 6);
        Point pointB = new Point(1, 9);

        System.out.println("Distance between a and b = " + pointA.distance(pointB));
    }

}
