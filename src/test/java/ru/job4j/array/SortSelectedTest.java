package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when473Sort347() {
        int[] data = new int[] {4, 7, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 4, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when91342Sort12349() {
        int[] data = new int[] {9, 1, 3, 4, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 9};
        assertThat(result).containsExactly(expected);
    }
}