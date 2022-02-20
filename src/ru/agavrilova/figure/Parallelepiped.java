package ru.agavrilova.figure;

public class Parallelepiped extends Figure{
    private double height;
    private double length ;
    private double width ;

    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double volume() {
        return this.height * this.width * this.length;
    }

    @Override
    public double square() {
        return 2 * (this.length * this.height + this.length * this.width + this.width * this.height);
    }
}
