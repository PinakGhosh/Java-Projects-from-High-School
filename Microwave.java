/*Pinak Ghosh
*Mr.Pope
* Assignment J5 Question 3
*April 23th 2020
*/

import java.io.*;//tells Java input will be used


class Microwave{
	public static void main (String[] args) throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String inData;//declaring Variable
	int intItems;//declaring Variable
	double dblTime;//declaring Variable

	System.out.println("please input number of items you will be placing in the microwave.");
	inData = stdin.readLine();//input number of items
	intItems = Integer.parseInt(inData);
	
	if (intItems > 4){//if more than 4 items display message
		System.out.println("heating more than 4 items is not recommended");
	}

	

	System.out.println("Please input Time(seconds) you would like to heat");
	inData = stdin.readLine();//input time you would like to heat for
	dblTime = Integer.parseInt(inData);

	if (intItems == 2){//if time is equal to 2
		dblTime = dblTime * 1.25;
		System.out.println("you have entered: " + intItems);//display number of items
		System.out.println("your heat time is: " + dblTime + " seconds");//display time to heat
	}
	else if (intItems == 3){//if time is equal to 3
		dblTime = dblTime * 1.5;
		System.out.println("you have entered: " + intItems);//display number of items
		System.out.println("your heat time is: " + dblTime + " seconds");//display time to heat
	}
	else if (intItems >= 4){//if time is equal to 4 or more
		dblTime = dblTime * 2;
		System.out.println("you have entered: " + intItems);//display number of items
		System.out.println("your heat time is: " + dblTime + " seconds");//display time to heat
	}	
	else if (intItems <= 0 || dblTime <= 0){// if items equal too or less than 0 then display this message
		System.out.println("you can't input negative numbers");//display time to heat
	}
	
	System.out.println("Thank you for using Panasonic!");//thank you message

	}
}