/*
    Jackson Meyer
    Dec 2020
    jacksonmeyer.com
 */

package b1t;

/*
                                !------------- PURPOSE OF THIS PROGRAM ----------------!
    This is not meant to be a quick, easy solution. There are obviously tools in Java that already do this, of course.
    Simply using parseInt(string, int) will obviously give you the answer with much less hassle. This program is meant
    to demonstrate the understanding of the math and concepts, as well as putting that into a nice GUI package.
 */

public class Calculator {
    public String binary;
    public String hex;
    public String dec;


    // !--Constructor--!
    public Calculator()
    {
        this.binary = null;
        this.hex = null;
        this.dec = null;
    }


    /*
        Binary to Decimal conversion
     */
    public String binary_to_dec(String binary)
    {
        long temp = 0;
        long power = binary.length() - 1;

        for (int i = 0; i < binary.length(); i++)
        {
            temp += (long)(Math.pow(2 * (Integer.parseInt(binary.substring(i, i+1))), power));
            power--;
        }

        return Long.toString(temp);
    }

    /*
        Binary to Hexadecimal conversion
     */
    public String binary_to_hex(String binary)
    {
        this.binary = binary;


        return "";
    }

    /*
        Decimal to Hexadecimal conversion
     */
    public String dec_to_hex(String decimal)
    {
        this.dec = decimal;


        return "";
    }

    /*
        Decimal to Binary conversion
     */
    public String dec_to_binary(String decimal)
    {
        this.dec = decimal;

        return "";
    }

    /*
        Hexadecimal to Decimal conversion
     */
    public String hex_to_dec(String hexadecimal)
    {
        this.hex = hexadecimal;

        return "";
    }

    /*
        Hexadecimal to Binary conversion
     */
    public String hex_to_binary(String hexadecimal)
    {
        this.hex = hexadecimal;


        return "";
    }










}
