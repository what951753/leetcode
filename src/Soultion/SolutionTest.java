package Soultion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mostWordsFound() {
        Solution solution = new Solution();
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int result = solution.mostWordsFound(sentences);
        assertEquals(6, result);
    }
    @Test
    void mostWordsFoundSymbol() {
        Solution solution = new Solution();
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great , thanks very much"};
        int result = solution.mostWordsFound(sentences);
        assertEquals(6, result);
    }
}