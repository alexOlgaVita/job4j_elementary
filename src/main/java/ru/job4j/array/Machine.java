package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int sum = price;
        while (sum < money) {
            for (int coin : coins) {
                if (sum + coin <= money) {
                    sum += coin;
                    result[size++] = coin;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }
}
