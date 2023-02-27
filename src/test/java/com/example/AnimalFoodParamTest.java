package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
@RunWith(Parameterized.class)
public class AnimalFoodParamTest {
    private final String animalKind;
    private final List<String> expectedFoodList;
    public AnimalFoodParamTest(String animalKind, List<String> expectedFoodList) {
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }
    @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void animalsHaveTheRightFood() throws Exception {
        Animal animal = new Animal();
        List<String> actualFood = animal.getFood(animalKind);
        Assert.assertEquals(this.expectedFoodList, actualFood);
    }
}
