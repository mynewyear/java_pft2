package ru.stqa.pft.sandbox;

/**
 * Created by IEUser on 4/26/2017.
 */
public class Distance {
    public static void main(String[] args) {
        Point pointA = new Point(1, 6);
        Point pointB = new Point(1, 12);

        System.out.println("Distance between a and b = " + distance(pointA, pointB));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt((p1.a - p2.a) * (p1.a - p2.a) + (p1.b - p2.b) * (p1.b - p2.b));
    }

}
