/*Pinak Ghosh
*Mr.Pope
* Assignment J7 Part 3
*May 20th 2020
*/

/* BAsically use % to see if there will be remainder and loop every number between 1 
and desired number
*/


import java.io.*;//tells Java input will be used

class primenumber{
	public static void main(String[] args) throws IOException{
		InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String intData;//declaring Variables
	int intPrime, intCounter, intDivider, intPerfectDiv;


	intPerfectDiv = 0;//variable value is 0

	System.out.println("Please input a number.");//input number that will be number you want to check
	intData = stdin.readLine();
	intPrime = Integer.parseInt(intData);


	for(intCounter=2; intPerfectDiv != intCounter%intPrime; intCounter++){
		 if ( intPerfectDiv == intPrime % intCounter){//loop that keeps going until devides so there is no remainder
		 	System.out.println("Number is not prime.");//display message

		 }
		 
	}
	
	System.out.println("If no messages are shown number is prime.");//display message



	}
}
