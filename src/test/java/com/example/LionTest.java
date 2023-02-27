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
        Lion lion = new Lion("Bla", feline);
        Assert.assertThrows("Используйте допустимые значения пола животного - самец или самка",
                Exception.class, () -> lion.doesHaveMane());
    }
    @Test
    public void getFoodReturnsMeatForLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Meat"));
        Assert.assertEquals(List.of("Meat"), lion.getFood());
    }
}
