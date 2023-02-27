package com.example;
import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundReturnsCorrectText() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }
    @Test
    public void getFoodShowsMeat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Meat");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
