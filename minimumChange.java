

import java.io.*;
class MinCoin{
	public static void main (String[] args) throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String inData;
	int intMoney, intToonie, intLoonie, intQuarter, intDime, intNickle, intPennie;

	System.out.println("Enter amount of money you would like to convert");

	inData = stdin.readLine();

	intMoney = Integer.parseInt(inData);

	intToonie = intMoney / 200;
	intLoonie = (intToonie % 100)/100;

	System.out.println(intToonie);
	System.out.println(intLoonie);












	}
}