package ru.agavrilova;

import ru.agavrilova.figure.Cube;
import ru.agavrilova.equation.Equation;
import ru.agavrilova.figure.Parallelepiped;
import ru.agavrilova.figure.Sphere;

public class Main {

    public int value;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!!!");

        Sphere sphere = new Sphere(25);
        System.out.println("Shp Vol " + sphere.volume());
        System.out.println("Shp Sq " + sphere.square());

        Cube cube = new Cube(11);
        System.out.println("Cube Vol " + cube.volume());
        System.out.println("Shp Sq " + cube.square());

        Parallelepiped parallelepiped = new Parallelepiped(1,4,6);
        System.out.println("Par Vol " + parallelepiped.volume());
        System.out.println("Par Sq " + parallelepiped.square());

        Equation equation = new Equation(3,7,-6);

        equation.calcRoot();

        System.out.println("FirstRoot " + equation.getX1());
        System.out.println("SecondRoot " + equation.getX2());

        equation = new Equation(4,4,1);
        equation.calcRoot();
        System.out.println("FirstRoot " + equation.getX1());
        System.out.println("SecondRoot " + equation.getX2());

        equation = new Equation(2,1,1);
        equation.calcRoot();
        System.out.println("FirstRoot " + equation.getX1());
        System.out.println("SecondRoot " + equation.getX2());

        equation = new Equation(2,3,0);
        equation.calcRoot();
        System.out.println("FirstRoot " + equation.getX1());
        System.out.println("SecondRoot " + equation.getX2());
    }
}
