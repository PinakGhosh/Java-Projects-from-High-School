/*Pinak Ghosh
*Mr.Pope
* Assignment J7 Part 1
*May 20th 2020
*/

import java.io.*;//tells Java input will be used

class SimpleGame {

	public static void main (String[] args) throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String intData;//declare variables
	int intNumber,intCounter,intAttempt;
	
	System.out.println("Welcome to the guessing game!");//display message

	System.out.println("Player 1 input a positive integer less than 1000!");

	intData = stdin.readLine();
	intNumber = Integer.parseInt(intData);// player 1 inputs number between 1 and 1000

	if (intNumber > 0 && intNumber < 1000){// if number between 1 and 1000


		System.out.println("Player 2 guess a Number between 1 and 1000");//ask player 2 to guess number between 1 and 1000
		intData = stdin.readLine();
		intAttempt = Integer.parseInt(intData);

		
		for (intCounter= 0; intAttempt != intNumber ;intCounter++){ //loop until the guess is equal to number
			if (intAttempt > intNumber){// if guess to high display message saying its too high
				System.out.println("your guess is to High! Try a Lower Number");
				intData = stdin.readLine();//ask to guess  again
				intAttempt = Integer.parseInt(intData);
			}	
			else if (intAttempt < intNumber){// if guess to low display message saying its too low
				System.out.println("your guess is to Low! Try a Higher Number");
				intData = stdin.readLine();//ask to guess again
				intAttempt = Integer.parseInt(intData);
			}
		}	
		
		System.out.println("You took " + (intCounter+1) + " guess's!");//display number of guesses
		System.out.println("Thank you for playing the guessing game!");//display thank you message

		

	}

	else{ //if not between 1 and 1000 ask again, or program will end
			System.out.println("Player 1 input a positive integer less than 1000 or program will end!");
			intData = stdin.readLine();
			intNumber = Integer.parseInt(intData);
	}
	
	}
}










	 
	