package com.example;

import org.junit.Assert;
import org.junit.Test;
public class AnimalTest {
    @Test
    public void getFoodWithoutAnimalKindShowsError() {
        Animal animal = new Animal();
        Assert.assertThrows("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                Exception.class, () -> animal.getFood("НеведомыйЗверь"));
    }
    @Test
    public void getFamilyReturnsText() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        Assert.assertEquals(expected, actual);
    }
}
