package ru.job4j.condition;

public class Rectangle {

    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double length = 9, width = 9;
        double result = diagonal(length, width);
        System.out.println(String.format("Diagonal of rectangle with length %s and width %s is ", length, width) + result);
    }
}
