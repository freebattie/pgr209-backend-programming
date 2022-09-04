package week1.RomanValues;


import org.junit.jupiter.api.Test;

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
    void RomanValueThree(){assert(romanNumber(3).equalsIgnoreCase("III"));}
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
    @Test
    void RomanValue50(){
        assert(romanNumber(50).equalsIgnoreCase("L"));
    }
    @Test
    void RomanValue2000(){
        assert(romanNumber(2000).equalsIgnoreCase("MM"));
    }
    @Test
    void RomanValue44(){assert(romanNumber(44).equalsIgnoreCase("XLIV"));}
    @Test
    void RomanValue55(){
        assert(romanNumber(55).equalsIgnoreCase("LV"));
    }
    @Test
    void RomanValue900(){
        assert(romanNumber(900).equalsIgnoreCase("CM"));
    }
    @Test
    void RomanValue444(){
        assert(romanNumber(444).equalsIgnoreCase("CDXLIV"));
    }


    private String romanNumber(int number) {

        StringBuilder romanNumber = new StringBuilder();
        String [] romanStrings = {"I","IV", "V", "IX","X", "XL", "L", "XC","C","CD","D","CM","M"};
        int [] romanIntValue = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int offset = String.valueOf(number).length();
        int index = offset >= 4 ? romanIntValue.length -1 : offset*4 -1;

        while (number > 0){
            if (number >= romanIntValue[index]){
                romanNumber.append(romanStrings[index]);
                number -=  romanIntValue[index];
            }
            else
                index--;
        }
        return romanNumber.toString();
    }


}
