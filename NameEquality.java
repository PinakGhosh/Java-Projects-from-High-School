/*Pinak Ghosh
*Mr.Pope
* Assignment J9 Question 3
*June 11th 2020
*/


import java.io.*;//tells Java input will be used

public class NameEquality{
	public static void main(String args[])throws IOException{
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String user1, user2;//declare Varibles

	System.out.println("Input Name for User 1!");//display message
	user1 = stdin.readLine();//input value

	System.out.println("Input Name for User 2!");//display message
	user2 = stdin.readLine();//input value

	if (user1.equals (user2)){//if both usernames equal display message
		System.out.println("The Names are equal");
	}
	else {
		System.out.println("The Names are NOT equal");//if both usernames NOT equal display message
	}




	}
}


