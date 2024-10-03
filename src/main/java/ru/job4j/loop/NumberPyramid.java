package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
        System.out.println("Number pyramid of height 7:");
        draw(7);
        System.out.println("Number pyramid of height 0:");
        draw(0);
        System.out.println("Number pyramid of height 1:");
        draw(1);
        System.out.println("Number pyramid of height 2:");
        draw(2);
    }
}
