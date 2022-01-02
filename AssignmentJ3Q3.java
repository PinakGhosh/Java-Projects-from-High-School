/*Pinak Ghosh
*Mr.Pope
* Assignment J4 Question 2
*April 16th 2020
*/

import java.io.*;//tells Java input will be used
class MinCoin{
	public static void main (String[] args) throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String inData;//Declare string Variable
	int intMoney, intToonie, intLoonie, intQuarter, intDime, intNickle, intPennie;//declare integer Variable

	System.out.println("Enter amount of money you would like to convert");//Display given message

	inData = stdin.readLine();/*places input into inData 
                                   * variable */

	intMoney = Integer.parseInt(inData);/*converts inData character
                                           data to int data type*/

	intToonie = intMoney / 200; //calculate Amount of toonies 
	intLoonie = (intMoney % 200)/100;//calculate Amount of loonies 
	intQuarter = ((intMoney % 200) % 100)/25;//calculate Amount of quarters 
	intDime = (((intMoney % 200) % 100) % 25)/10;//calculate Amount of dimes 
	intNickle = ((((intMoney % 200) % 100) % 25) % 10)/5;//calculate Amount of nickles 
	intPennie =(((((intMoney % 200) % 100) % 25) % 10) % 5)/1;//calculate Amount of pennies 

	System.out.println("Toonies: " + intToonie);//Display Amount of toonies needed
	System.out.println("Loonies: " + intLoonie);//Display Amount of loonies needed
	System.out.println("Quarters: " + intQuarter);//Display Amount of quarters needed
	System.out.println("Dimes: " + intDime);//Display Amount of dimes needed
	System.out.println("Nickles: " + intNickle);//Display Amount of nickles needed
	System.out.println("Pennies: "+ intPennie);//Display Amount of pennies needed














	}
}