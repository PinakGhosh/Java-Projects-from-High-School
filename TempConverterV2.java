/*Pinak Ghosh
*Mr.Pope
* Assignment J8 Question 2
*June 10th 2020
*/

import java.io.*;//tells Java input will be used

public class TempConverterV2{
	public static void main(String[] args)throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	Convert temperature = new Convert();//call temperature
 
 	String data;//declare variables
 	int number;

 	System.out.println("Select celsius or fahrenheit!");//display message
 	data = stdin.readLine();//input value

 	if (data.equals("celsius")){//if type celsius

 	System.out.println("How much celsius would you like to convert to fahrenheit");//ask what value you would like to convert
 	data = stdin.readLine();
 	number = Integer.parseInt(data);//input value

 	System.out.println(number + " celsius is " + temperature.changeFahrenheit(number) + " fahrenheit." ); //display message





 	}
 	else if (data.equals("fahrenheit")){//if type fahrenheit

 	System.out.println("How much fahrenheit would you like to convert to celsius");//ask what value you would like to convert
 	data = stdin.readLine();
 	number = Integer.parseInt(data);//input value

 	System.out.println(number + " fahrenheit is " + temperature.changeCelsius(number) + " celsius." ); //display message



 	}


 	}
}

class Convert{

	public double changeFahrenheit (double celsius) {//do conversion
		double fahrenheit = celsius * 9/5 + 32;
		return fahrenheit;

	}

	public double changeCelsius (double fahrenheit) {//do conversion
		double celsius =(fahrenheit - 32) * 5/9 ;
		return celsius;

	}

}

