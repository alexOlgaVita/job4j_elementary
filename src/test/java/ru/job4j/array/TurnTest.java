package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArray2WithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {8, 9, 5, 7, 4, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 4, 7, 5, 9, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArray2WithOddAmountOfElementsThenTurnedArray() {
        int[] input = {7, 9, 1, 5, 3, 3, 6};
        int[] result = Turn.back(input);
        int[] expected = {6, 3, 3, 5, 1, 9, 7};
        assertThat(result).containsExactly(expected);
    }
}