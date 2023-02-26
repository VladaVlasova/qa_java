package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
        public void getKittensReturnsCorrectGetKittens() throws Exception {
            Lion lion = new Lion("Самец", feline);
            int expectedKittens = 10;
            Mockito.when(lion.getKittens()).thenReturn(10);
            int actualKittens = lion.getKittens();
            Assert.assertEquals(expectedKittens, actualKittens);
        }
    @Test(expected = Exception.class)
    public void doesHaveManeReturnsCorrectHasMane() throws Exception {
        Lion lion = new Lion("bla", feline);
        try {
            lion.doesHaveMane();
        } catch (Exception exception) {
        }
    }
    @Test
    public void getFoodReturnsCorrectGetFoodForLine() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedArrayListLion = Arrays.asList();
        List<String> actualArrayListLion = lion.getFood();
        Assert.assertEquals(expectedArrayListLion, actualArrayListLion);
    }
}
