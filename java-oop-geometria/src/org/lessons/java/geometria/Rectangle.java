package org.lessons.java.geometria;

public class Rectangle {

    private double base, height;
    private double area, perimeter;

    public Rectangle(double base, double height) {
        this.base = base >= 0 ? base : 0.0d;
        this.height = height >= 0 ? height : 0.0d;
        update();
    }

    private void update() {
        calculateArea();
        calculatePerimeter();
    }

    private void calculateArea() {
        area = base * height;
    }

    private void calculatePerimeter() {
        perimeter = base * 2 + height * 2;
    }

    public void setBase(double base) {
        this.base = base >= 0 ? base : 0.0d;
        update();
    }

    public void setheight(double height) {
        this.height = height >= 0 ? height : 0.0d;
        update();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void printOnConsole(String character, String blankSpace) {

        for (int r = 0; r < height; r++) {
            printEdge(character);

            if (r == 0 || r == height - 1)
                fillRow(character, (int) (base - 2));
            else
                fillRow(blankSpace, (int) (base - 2));

            printEdge(character);
            System.out.println();
        }
    }

    private void fillRow(String str, int times) {
        for (int i = 0; i < times; i++)
            System.out.print(str);
    }

    private void printEdge(String str) {
        System.out.print(str);
    }

}