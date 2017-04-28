package ru.stqa.pft.sandbox;

/**
 * Created by IEUser on 4/26/2017.
 */
public class Point {
    int a;
    int b;

    public Point(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static double distance(Point pointA, Point pointB) {
                return Math.sqrt((pointA.a - pointB.a) * (pointA.a - pointB.a) + (pointA.b - pointB.b) * (pointA.b - pointB.b));
    }
}
