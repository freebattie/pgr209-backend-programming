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

    private String romanNumber(int number) {
       String romanNumber = "";
       int temval = number;
       if (number >= 9){
           romanNumber = "X";
           temval = temval - 10;
       }
        if (temval >= 4){
            romanNumber = "V";
            temval = temval - 5;
        }
       if (temval > 0){
           for (int x = 0; x < temval; x++){
               romanNumber += "I";

           }
       }
       else if (temval == -1){

           romanNumber = "I".concat(romanNumber);
       }


        return romanNumber;
    }
}
