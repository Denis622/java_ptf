package ru.stqa.ptf.sandbox;

/**
 * Created by Denis on 28.05.2017.
 */
public class Square {

    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double area() {
        return this.l * this.l;
    }

}
