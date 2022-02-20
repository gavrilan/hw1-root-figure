package ru.agavrilova.figure;

public class Sphere extends Figure{

    private double radius;

    private double pi = 3.14;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4 / 3 * this.pi * this.radius * this.radius * this.radius;
    }

    @Override
    public double square() {
        return 4 * this.pi * this.radius * this.radius;
    }

}
