package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] arrayResult = new int[0];
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            int s = array[i];
            while (j < array.length && s < target) {
                if (array[i] != array[j]) {
                    s = array[i] + array[j];
                }
                j++;
            }
            if (s == target) {
                arrayResult = new int[2];
                arrayResult[0] = i;
                arrayResult[1] = j - 1;
                break;
            }
        }
        return arrayResult;
    }
}
