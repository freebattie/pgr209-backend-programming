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
    void RomanValueFive(){
        assert(romanNumber(5).equalsIgnoreCase("V"));
    }
    @Test
    void RomanValueFour(){
        assert(romanNumber(4).equalsIgnoreCase("IV"));
    }

    private String romanNumber(int number) {
       String romanNumber = "";
       if (number < 5){
           for (int x = 0; x < number; x++){
               romanNumber += "I";
               if (x == 3){
                   return "IV";
               }

           }
       }
       else return "V";


        return romanNumber;
    }
}
