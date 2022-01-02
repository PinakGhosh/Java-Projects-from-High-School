/*Pinak Ghosh
*Mr.Pope
* Assignment J10 Question 1
*June 11th 2020
*/



import java.io.*;//tells Java input will be used

public class AverageArray{
	
	public static void main(String args[])throws IOException{
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);//means input will be used

	int counter;//declare variables
	double average;
	String data;

	average = 0;//set value 

	double [] input = new double [10];//create array

	for (counter = 0; counter <= 9; counter++){
		
		System.out.println("User please input a number " + (counter+1) + " out of 10");//display message
		data = stdin.readLine();//input value
		input[counter] = Double.parseDouble(data);//parse input value

		average = average + input[counter];//adds all inputed value into variable

	}
	
	System.out.println("The average of inputed numbers are: " + (average/10));//display message and divid variable by 10 to get average

	}
}