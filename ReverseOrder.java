/*Pinak Ghosh
*Mr.Pope
* Assignment J10 Question 2
*June 11th 2020
*/


import java.io.*;//tells Java input will be used

public class ReverseOrder{
	
	public static void main(String args[])throws IOException{
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);//means input will be used
	
	int counter;//declare variables
	String data;
	double [] input = new double [10];//create arrays

	for (counter = 0; counter <= 9; counter++){//loops until all array values are filled
		
		System.out.println("User please input a number " + (counter+1) + " out of 10");//display message
		data = stdin.readLine();//input value
		input[counter] = Double.parseDouble(data);//parse value

		
	}

	for (counter = 9; counter >= 0; counter--){//prints prints numbers in reverse order
		System.out.println(input[counter]);
	}



	}
}