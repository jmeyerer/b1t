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

//------------------------------------------------

    // !--Constructor--!
    public Calculator()
    {
        this.binary = null;
        this.hex = null;
        this.dec = null;
    }

//------------------------------------------------

    // !--Set Methods--!
    public void setBinary(String binary)
    {
        this.binary = binary;
    }

    public void setDec(String decimal)
    {
        this.dec = decimal;
    }

    public void setHex(String hexadecimal)
    {
        this.hex = hexadecimal;
    }

//------------------------------------------------
//      Conversion Methods

    /*
        Binary to Decimal conversion
     */
    public String binary_to_dec(String binary)
    {
        long temp = 0;
        long power = binary.length() - 1;

        for (int i = 0; i < binary.length(); i++)
        {
            int bit = Integer.parseInt((binary.substring(i, i+1)));
            if (bit == 1)                       //only do the calculation if the bit == 1
            {
                temp += Math.pow(2, power);
            }
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
        this.hex = "";

        while(this.binary.length() % 4 != 0)           //adds buffer of 0's at beginning of binary if bytes aren't full
        {
            this.binary = "0" + this.binary;
        }

        for(int i = this.binary.length(); i > 0; i -= 4) {  //iterate from end to beginning because switch case deals with it that way
            String temp = this.binary.substring(i - 4, i);  //still read in bytes beginning to end
            temp = binary_to_dec(temp);                 //puts string value of current byte into temp

            int currentByte = Integer.parseInt(temp);   //parses int value from temp of the current byte
            dec_hex_switch(currentByte);            //switch case, put into separate method
        }
        return this.hex;        //return hex value;
    }

    /*
        Decimal to Hexadecimal conversion
     */
    public String dec_to_hex(String decimal)
    {
        this.dec = decimal;
        this.hex = "";

        long num = Integer.parseInt(decimal);
        long quotient = num / 16;
        long remainder = num % 16;

        while(quotient != 0)                            //until the quotient is 0, repeat
        {
            dec_hex_switch((int)(remainder));

            remainder = quotient % 16;      //get next remainder before overwriting quotient
            quotient = quotient / 16;       //get next quotient
        }
        dec_hex_switch((int)(remainder));
        return this.hex;        //return the final value
    }

    /*
        Decimal to Binary conversion
     */
    public String dec_to_binary(String decimal)
    {
        this.dec = decimal;
        this.binary = "";

        int quotient;
        int num = Integer.parseInt(decimal);

        quotient = num / 2;
        int remainder = num % 2;

        while(quotient != 0)                            //until the quotient is 0, repeat
        {
            this.binary = Integer.toString(remainder) + this.binary;  //else it can just be added as a number

            remainder = quotient % 2;      //get next remainder before overwriting quotient
            quotient = quotient / 2;       //get next quotient
        }
        this.binary = Integer.toString(remainder) + this.binary;
        return this.binary;        //return the final value
    }

    /*
        Hexadecimal to Decimal conversion
     */
    public String hex_to_dec(String hexadecimal)
    {
        this.hex = hexadecimal;
        this.dec = "";
        int power = hexadecimal.length() - 1;
        long temp = 0;

        for(int i = 0; i < this.hex.length(); i++)
        {
            String currentNum = this.hex.substring(i, i+1);

            switch(currentNum)
            {
                case "A":
                    temp += (int)(10 * Math.pow(16, power));
                    break;
                case "B":
                    temp += (int)(11 * Math.pow(16, power));
                    break;
                case "C":
                    temp += (int)(12 * Math.pow(16, power));
                    break;
                case "D":
                    temp += (int)(13 * Math.pow(16, power));
                    break;
                case "E":
                    temp += (int)(14 * Math.pow(16, power));
                    break;
                case "F":
                    temp += (int)(15 * Math.pow(16, power));
                    break;
                default:
                    temp += (int)(Integer.parseInt(currentNum) * Math.pow(16, power));
            }
            power--;
        }

        this.dec = Long.toString(temp);
        return this.dec;
    }

    /*
        Hexadecimal to Binary conversion
     */
    public String hex_to_binary(String hexadecimal)
    {
        this.hex = hexadecimal;
        this.binary = "";

        this.dec = hex_to_dec(this.hex);
        this.binary = dec_to_binary(this.dec);

        return this.binary;
    }


    public void dec_hex_switch(int input)
    {
            switch (input) {
                case 10:
                    this.hex = "A" + this.hex;
                    break;

                case 11:
                    this.hex = "B" + this.hex;
                    break;

                case 12:
                    this.hex = "C" + this.hex;
                    break;

                case 13:
                    this.hex = "D" + this.hex;
                    break;

                case 14:
                    this.hex = "E" + this.hex;
                    break;

                case 15:
                    this.hex = "F" + this.hex;
                    break;

                default:
                    this.hex = Integer.toString(input) + this.hex;
            }
    }

//------------------------------------------------
//      Helper Methods

    public String add_to_hex()
    {



        return "";
    }

    public String add_to_binary()
    {



        return "";
    }

    //checks that input string follows binary notation
    public boolean binaryCheck(String input)
    {


        return false;
    }

    //checks that string input follows decimal notation
    public boolean decCheck(String input)
    {


        return false;
    }

    //checks that string input follows hexadecimal notation
    public boolean hexCheck(String input)
    {


        return false;
    }


}
