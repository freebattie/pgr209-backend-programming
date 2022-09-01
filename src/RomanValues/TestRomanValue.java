package RomanValues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRomanValue {

    @Test
    void RomanValueOne(){
        assert(romanNumber(1) == "I");
    }

    @Test
    void RomanValueTwo(){
        assert(romanNumber(2) == "II");
    }

    private String romanNumber(int number) {
        return "I";
    }
}
