package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        int x1 = 9, y1 = 9, x2 = -9, y2 = -9;
        double result = distance(x1, y1, x2, y2);
        System.out.println("result = " + result);
    }
}
