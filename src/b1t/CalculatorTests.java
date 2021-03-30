package b1t;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import static org.junit.Assert.assertEquals;

//TODO:: Add Parameterized Tests

@RunWith(Parameterized.class)
public class CalculatorTests {

//------------------------------------------
//      Test Cases
//------------------------------------------
//      Global Variables

    Calculator calc;

//------------------------------------------
//      Valid Input Test Cases

    @Before                     //initialize new calculator object before each test case
    public void initialize()
    {
        calc = new Calculator();
    }

    @Test
    void binaryToDec_ValidInputs()
    {
        String input = buildBinaryString(0, 20);
        int convertedDecimal = Integer.parseInt(calc.binary_to_dec(input));

        assertEquals(convertedDecimal, Integer.parseInt(input, 2));
    }

    @Test
    void binaryToHex_ValidInputs()
    {
        String input = buildBinaryString(0, 20);
        int convertedHex = Integer.parseInt(calc.binary_to_hex(input));

        assertEquals(convertedHex, Integer.parseInt(input, 16));
    }

    @Test
    void decToHex_ValidInputs()
    {


    }

    @Test
    void decToBinary_ValidInputs()
    {


    }

    @Test
    void hexToDec_ValidInputs()
    {


    }

    @Test
    void hexToBinary_ValidInputs()
    {


    }

//--------------------------------------------------------
//      Invalid Input Test Cases

    @Test
    void binaryToDec_InvalidInputs()
    {


    }

    @Test
    void binaryToHex_InvalidInputs()
    {


    }

    @Test
    void decToHex_InvalidInputs()
    {


    }

    @Test
    void decToBinary_InvalidInputs()
    {


    }

    @Test
    void hexToDec_InvalidInputs()
    {


    }

    @Test
    void hexToBinary_InvalidInputs()
    {


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
