package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
public class FelineTest {
    @Test
    public void getFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }
    @Test
    public void eatMeatReturnsCorrectFoodForFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedArrayListFeline = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualArrayListFeline = feline.eatMeat();
        Assert.assertEquals(expectedArrayListFeline, actualArrayListFeline);
    }
    @Test
    public void getKittensCount() {
        Feline feline = new Feline();
        int expectedKittensCount = 10;
        int actualKittensCount = feline.getKittens(10);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
    @Test
    public void getKittensCountWithoutKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
