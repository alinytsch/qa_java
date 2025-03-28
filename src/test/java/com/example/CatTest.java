package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {

    @Test
    public void testGetSoundReturnsMeow() {
        Feline feline = mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFoodReturnsExpectedList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(java.util.List.of("Рыба", "Мясо"));

        Cat cat = new Cat(feline);
        assertEquals(java.util.List.of("Рыба", "Мясо"), cat.getFood());
    }
}
