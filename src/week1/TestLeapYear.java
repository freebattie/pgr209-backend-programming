package week1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLeapYear {
    @Test
    void everyFortYearIsLeapYear(){
        assertTrue(isLeapYear(2024));
    }

    private boolean isLeapYear(int year) {
        return true;
    }

    @Test
    void everyNoneFourthIsNotLeapYear(){
        assertFalse(isNotLeapYear(2021));
    }

    private boolean isNotLeapYear(int year) {
        return false;
    }
}
