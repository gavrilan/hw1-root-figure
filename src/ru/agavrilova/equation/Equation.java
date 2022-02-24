package ru.agavrilova.equation;

public class Equation {
    private double a, b, c;
    private double d;
    private Double x1 = null;
    private Double x2 = null;

    public Double getX1() {
        return this.x1;
    }

    public Double getX2() {
        return this.x2;
    }

    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calcDisc() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public void calcRoot() {
        if (a == 0){
            throw new IllegalArgumentException("Неверный аргумент а");
        }
        double d = calcDisc();
        if (d < 0) {
            this.x1 = null;
            this.x2 = null;
            return;
        } else if (d == 0) {
            this.x1 = Double.valueOf((-this.b) / (2 * this.a));
            this.x2 = null;
        } else {
            this.x1 = Double.valueOf((-this.b + Math.sqrt(d))/ (2 * this.a));
            this.x2 = Double.valueOf((-this.b - Math.sqrt(d))/ (2 * this.a));
        }

    }
}
