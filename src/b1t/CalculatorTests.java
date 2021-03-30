package b1t;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {

//------------------------------------------
//      Test Cases
//------------------------------------------


//------------------------------------------
//      Valid Input Test Cases

    @Test
    void binaryToDec_ValidInputs()
    {
        Calculator calc = new Calculator();
        String input = buildBinaryString(0, 20);
        int convertedDecimal = Integer.parseInt(calc.binary_to_dec(input));

        assertEquals(convertedDecimal, Integer.parseInt(input, 2));
    }

    @Test
    void binaryToHex_ValidInputs()
    {
        Calculator calc = new Calculator();
        String input = buildBinaryString(0, 20);
        int convertedHex = Integer.parseInt(calc.binary_to_hex(input));

        assertEquals(convertedHex, Integer.parseInt(input, 16));
    }

    @Test
    void decToHex_ValidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void decToBinary_ValidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void hexToDec_ValidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void hexToBinary_ValidInputs()
    {
        Calculator calc = new Calculator();


    }

//--------------------------------------------------------
//      Invalid Input Test Cases

    @Test
    void binaryToDec_InvalidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void binaryToHex_InvalidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void decToHex_InvalidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void decToBinary_InvalidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void hexToDec_InvalidInputs()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void hexToBinary_InvalidInputs()
    {
        Calculator calc = new Calculator();


    }





//--------------------------------------------------------
//      Helper Functions

    public String buildBinaryString(int min, int max)
    {
        int length = (int)(Math.random() * (max - min + 1) + min); //used to create random length string
        String input = "";

        for(int i = 0; i < length; i++)
        {
            input += Integer.toString((int)(Math.round(Math.random()))); //adds a random set of 1's and 0's
        }

        return input;
    }


}
