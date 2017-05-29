package ru.stqa.ptf.sandbox;

/**
 * Created by Denis on 28.05.2017.
 */
public class Point {
    public double x;
    public double y;

    double getDistance(Point a) {
        return Math.sqrt( Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2) );

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

public double distance(Point p2) {
        double x = this.x - p2.x;
        double y = this.y - p2.y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
}

}
