package ru.agavrilova.figure;

public class Cube extends Figure{

    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return this.edge * this.edge * this.edge;
    }

    @Override
    public double square() {
        return 6 * this.edge * this.edge;
    }
}
