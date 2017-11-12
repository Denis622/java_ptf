package ru.stqa.ptf.sandbox;

public class Starter {

    public static void main(String[] args) {

        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 10);

        System.out.println("Расстояние между точками P1" + "(" + p1.x + "," + p1.y + ")" + " и " + "P2(" + p2.x + "," + p2.y + ")" + "=" + p2.distance(p1));
    }
}
