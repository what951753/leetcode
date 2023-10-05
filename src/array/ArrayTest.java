package array;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class ArrayTest {




    @Test
    @DisplayName("twoSum test fellow by leetcode example")
    void twoSum() {
        TwoSum instance = new TwoSum();
        Assert.assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[]{0,1}, instance.twoSum(new int[]{2,7,11,15}, 9));
        Assert.assertArrayEquals(new int[]{0,1}, instance.twoSum(new int[]{3,3}, 6));
    }

    @Test
    @DisplayName("maxProfit test fellow by leetcode example")
    void maxProfit() {
        BestTimeToBuyAndSellStock instance = new BestTimeToBuyAndSellStock();
        assertEquals(5, instance.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, instance.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    @DisplayName("containsDuplicate test fellow by leetcode example")
    void containsDuplicate() {
        ContainsDuplicate instance = new ContainsDuplicate();
        assertTrue(instance.containsDuplicate(new int[]{1,2,3,1}));
        assertFalse(instance.containsDuplicate(new int[]{1,2,3,4}));
        assertTrue(instance.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}