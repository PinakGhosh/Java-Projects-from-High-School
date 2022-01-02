/*Pinak Ghosh
*Mr.Pope
* Assignment J9 Question 4
*June 11th 2020
*/

import java.io.*;//tells Java input will be used

public class CharacterCounter{
	
	public static void main(String args[])throws IOException{
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);

	int counter;
	//declare variables
	String input;

	System.out.println("please input caracters");//display message
	input = stdin.readLine();//input value
	counter = input.length();//assign value as number of caracters of input
		
		while (!input.equals(".")){//loop until input is equal to variable end which is "."
			
			System.out.println("please input caracters");//display message
			input = stdin.readLine();//input value
			counter = counter + input.length();//counter value is length of every new input plus sum of old values
			
		}		
			
	System.out.println("you input " + counter + " caracters");//display number of total caracters inputted
	
	}	

}