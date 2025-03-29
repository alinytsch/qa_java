package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LionTest {

    @Test
    public void testDoesHaveManeReturnsTrueForMale() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самец", feline);
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeReturnsFalseForFemale() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самка", feline);
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void testGetKittensReturnsCorrectValue() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);
        assertEquals(3, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void testLionThrowsExceptionForInvalidSex() throws Exception {
        Feline feline = mock(Feline.class);
        new Lion("Неизвестный", feline);
    }

    @Test
    public void testGetFoodReturnsCorrectList() throws Exception {
        Feline feline = mock(Feline.class);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        when(feline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", feline);
        assertEquals(expectedFood, lion.getFood());
    }
}
