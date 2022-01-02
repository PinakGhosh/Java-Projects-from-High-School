/*Pinak Ghosh
*Mr.Pope
* Assignment J9 Question 5
*June 11th 2020
*/

import java.io.*;//tells Java input will be used


class CaseChanger {

	public static void main (String[] args) throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);

	String input;//input Varibales

	System.out.println("please input caracter one by one");//display message
	input = stdin.readLine();//input value

	if (input.equals(input.toUpperCase())){//if uppercase change to lowercase and display
		System.out.println(input.toLowerCase());
	}
	else if (input.equals(input.toLowerCase())){//if lowercase change to uppercase and display
		System.out.println(input.toUpperCase());
	}

	
	while (!input.equals(".")){//loop until equal to variable stop which is ".""

		System.out.println("please input caracter one by one");//display message
		input = stdin.readLine();//input value

		if (input.equals(input.toUpperCase())){//if uppercase change to lowercase and display
			System.out.println(input.toLowerCase());
		}
		else if (input.equals(input.toLowerCase())){//if lowercase change to uppercase and display
			System.out.println(input.toUpperCase());
		}
	}	

	



	}
}
