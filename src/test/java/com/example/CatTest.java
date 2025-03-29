package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class CatTest {

    @Test
    public void testGetSoundReturnsMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFoodReturnsExpectedList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), food);
    }
}
