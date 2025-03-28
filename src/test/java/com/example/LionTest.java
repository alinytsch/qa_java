package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LionTest {

    @Test
    public void lionHasManeWhenMale() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionHasNoManeWhenFemale() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionThrowsExceptionWhenSexInvalid() throws Exception {
        Feline feline = mock(Feline.class);
        new Lion("Неизвестно", feline);
    }

    @Test
    public void getFoodReturnsMockedMeatList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(Arrays.asList("Животные"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(Arrays.asList("Животные"), lion.getFood());
    }
}