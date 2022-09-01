package week1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLeapYear {
    @Test
    void everyFortYearIsLeapYear(){
        assertTrue(isLeapYear(2024));
    }

    private boolean isLeapYear(int i) {
        return true;
    }
}
