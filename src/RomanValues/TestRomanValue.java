package RomanValues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRomanValue {

    @Test
    void RomanValueOne(){
        assert(romanNumber(1).equalsIgnoreCase("I"));
    }

    @Test
    void RomanValueTwo(){
        assert(romanNumber(2).equalsIgnoreCase("II"));
    }
    @Test
    void RomanValueThree(){
        assert(romanNumber(3).equalsIgnoreCase("III"));
    }
    @Test
    void RomanValueFour() {
        assert (romanNumber(4).equalsIgnoreCase("IV"));
    }

    @Test
    void RomanValueFive(){
        assert(romanNumber(5).equalsIgnoreCase("V"));
    }
    @Test
    void RomanValueSix(){
        assert(romanNumber(6).equalsIgnoreCase("VI"));
    }
    @Test
    void RomanValueNine(){
        assert(romanNumber(9).equalsIgnoreCase("IX"));
    }
    @Test
    void RomanValueFourteen(){
        assert(romanNumber(14).equalsIgnoreCase("XIV"));
    }
    @Test
    void RomanValueTwenty(){
        assert(romanNumber(20).equalsIgnoreCase("XX"));
    }

    private String romanNumber(int number) {
       String romanNumber = "";
       int value = number;
       int temval = number;

        while (value > 0){

            if (value <= 3){
                romanNumber += "I";
                value --;
            }
            if(value >= 10){
                romanNumber += "X";
                value-= 10;
            }
            if(value == 9){
                romanNumber += "IX";
                value -=9;
            }
            if (value >= 5 && value < 10){
                romanNumber += "V";
                value -= 5;
            }
            if(value == 4){
                romanNumber += "IV";
                value -=4;
            }

        }



        return romanNumber;
    }
}
