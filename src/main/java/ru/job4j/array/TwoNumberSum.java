package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexesNotOptimal(int[] array, int target) {
        int[] arrayResult = new int[0];
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            int s = array[i];
            while (j < array.length && s < target) {
                /* это улосвие здесь присутствует, исходя из условия задачи: "- одно и то же число можно использовать только один раз;"
                Соответственно, я поправила тест и его название: "whenTwoEqualsNumbersYesTarget()" -> "whenTwoEqualsNumbersYesSumNoTarget()" */
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

    public static int[] getIndexes(int[] array, int target) {
        int[] arrayResult = new int[0];
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if ((array[i] + array[j] > target) || (j == array.length - 1 && array[i] + array[j] < target) || (array[i] == array[j])) {
                i++;
                j = i + 1;
            } else if (array[i] + array[j] == target) {
                arrayResult = new int[2];
                arrayResult[0] = i;
                arrayResult[1] = j;
                break;
            } else {
                j++;
            }
        }
        return arrayResult;
    }
}
