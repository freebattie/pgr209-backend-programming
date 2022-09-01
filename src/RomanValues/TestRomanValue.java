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
    @Test
    void RomanValueThree(){
        assert(romanNumber(3) == "III");
    }

    private String romanNumber(int number) {
       if (number == 1 ) return  "I";
       else return  "II";
    }
}
