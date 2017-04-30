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

    public double distance(Point pointA) {
                return Math.sqrt((pointA.a - this.a) * (pointA.a - this.a) + (pointA.b - this.b) * (pointA.b - this.b));
    }
}
