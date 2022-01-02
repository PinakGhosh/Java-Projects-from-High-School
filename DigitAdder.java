/*Pinak Ghosh
*Mr.Pope
* Assignment J4 Question 2
*April 16th 2020
*/


import java.io.*;//tells Java input will be used
class DigitAdder{
	public static void main (String[] args) throws IOException{
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData; // Declare string Variable
		int maxNum, intDigit1, intDigit2, intDigit3; // declare integer Variable
		
		System.out.println("enter a value between 1 and 1000"); //display message
		inData = stdin.readLine();/*places input into inData 
                                   * variable */
		
		maxNum = Integer.parseInt(inData); /*converts inData character
                                           data to int data type*/

		intDigit1 = maxNum / 100; // isolates first digit
		intDigit2 = (maxNum % 100) / 10;// isolates second digit
		intDigit3 = maxNum % 10;// isolates third digit

		System.out.print("The sum of the digits of " + inData + " is: "); //display message
		System.out.println(intDigit1 + intDigit2 + intDigit3); //add numbers together

		




 














	}
}