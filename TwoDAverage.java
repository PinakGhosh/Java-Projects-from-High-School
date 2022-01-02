/*Pinak Ghosh
*Mr.Pope
* Assignment J10 Question 3
*June 11th 2020
*/

import java.io.*;//tells Java input will be used

public class TwoDAverage{
	
	public static void main(String args[])throws IOException{
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);//means input will used



	int counterRow,counterCollumn;//declare variables
	String data;
	double average;
	int [][] input = new int [4][5];//create array


	average = 0;//assign value


	for (counterRow = 0; counterRow <= 3; counterRow++){//loop rows until all rows are filled
		
		for (counterCollumn = 0; counterCollumn <=4; counterCollumn++){//loop column until column in row filled 

			System.out.println("row: " + (counterRow+1));//display row number
			System.out.println("collumn: " + (counterCollumn+1));//display column number
			
			System.out.println("User please input a number");//display message
			data = stdin.readLine();//input value
			input[counterRow] [counterCollumn] = Integer.parseInt(data);//pase input

		}

	}

	for (counterRow = 0; counterRow <= 3; counterRow++ ){//loop until no more rows remaining

		System.out.print("Row " + (counterRow +1) +" :");//display row number

		for (counterCollumn = 0; counterCollumn <=4; counterCollumn++){//get average of inputs of each column
			
			System.out.print(input [counterRow] [counterCollumn] + " ");//display input value and column
			

		}
		
		System.out.println();//go to next line


	}


	for (counterRow = 0; counterRow <= 3; counterRow++ ){//loop until no more rows remaining

		System.out.print("Row " + (counterRow +1) + " Average:");//display row number

		for (counterCollumn = 0; counterCollumn <=4; counterCollumn++){//get average of inputs of each column
			average = average + (input[counterRow] [counterCollumn] / 5);
			

		}
		System.out.print(average);//display average
		System.out.println();//go to next line
		average = 0;//reset average variable


	}


	}
}