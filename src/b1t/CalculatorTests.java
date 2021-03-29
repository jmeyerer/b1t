package b1t;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    void binaryToDec()
    {
        Calculator calc = new Calculator();
        String input = buildBinaryString(0, 20);
        int convertedDecimal = Integer.parseInt(calc.binary_to_dec(input));

        assertEquals(convertedDecimal, Integer.parseInt(input, 2));
    }

    @Test
    void binaryToHex()
    {
        Calculator calc = new Calculator();
        String input = buildBinaryString(0, 20);
        int convertedHex = Integer.parseInt(calc.binary_to_hex(input));

        assertEquals(convertedHex, Integer.parseInt(input, 16));
    }

    @Test
    void decToHex()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void decToBinary()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void hexToDec()
    {
        Calculator calc = new Calculator();


    }

    @Test
    void hexToBinary()
    {
        Calculator calc = new Calculator();


    }

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
