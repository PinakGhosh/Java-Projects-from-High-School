
/*Pinak Ghosh
*Mr.Pope
* Assignment J5 Question 2
*April 23th 2020
*/


import java.io.*;//tells Java input will be used
import java.text.DecimalFormat;//tells java rounding will be used

class HomeDepot{

	private static DecimalFormat df = new DecimalFormat("0.00");//df means round to 2 decimal points

	public static void main (String[] args) throws IOException{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	String inData;//declaring Variable
	int intNuts, intBolts, intWashers;//declaring Variable
	double dblNutsCost, dblBoltsCost, dblWasherCost, dblSubtotal;//declaring Variable

	
	System.out.println("input Number of Nuts");//input number of nuts
	inData = stdin.readLine();
	intNuts = Integer.parseInt(inData);
	if (intNuts <= 50){//if less than 50 show message
		System.out.println("A minimum of 50 Nuts required, please re-enter the amount of nuts.");
		
		inData = stdin.readLine();
		intNuts = Integer.parseInt(inData);

		if (intNuts <= 50){//if less than 50 show message
			System.out.println("A minimum of 50 Nuts must be ordered. The number of nuts has been set to 50.");
			intNuts = 50;//set value to 50
		}
		else{
			System.out.println(intNuts + " Nuts have been requested");//show number of item requested
		}
	}
	else{
		System.out.println(intNuts + " Nuts have been requested");//show number of item requested
	}


	System.out.println("input Number of bolts");//input number of bolts
	inData = stdin.readLine();
	intBolts = Integer.parseInt(inData);
	if (intBolts <= 50){//if less than 50 show message
		System.out.println("A minimum of 50 Bolts required, please re-enter the amount of bolts.");
		
		inData = stdin.readLine();
		intBolts = Integer.parseInt(inData);

		if (intBolts <= 50){//if less than 50 show message
			System.out.println("A minimum of 50 bolt must be ordered. The number of bolts has been set to 50.");
			intNuts = 50;//set value to 50
		}
		else{
			System.out.println(intBolts + " Nuts have been requested");//show number of item requested
		}
	}
	else{
		System.out.println(intBolts + " Nuts have been requested");//show number of item requested
	}
	
	
	System.out.println("input Number of Washers");//input number of washers
	inData = stdin.readLine();
	intWashers = Integer.parseInt(inData);
	if (intWashers <= 50){//if less than 50 show message
		System.out.println("A minimum of 50 Washers required, please re-enter the amount of washers.");
		
		inData = stdin.readLine();
		intWashers = Integer.parseInt(inData);

		if (intWashers <= 50){//if less than 50 show message
			System.out.println("A minimum of 50 washers must be ordered. The number of washers has been set to 50.");
			intWashers = 50;//set value to 50
		}
		else{
			System.out.println(intWashers + " Washers have been requested");//show number of item requested
		}
	}
	else{
		System.out.println(intWashers + " Washers have been requested");//show number of item requested
	}
	
	




	System.out.println("Please wait your order is being processed");//waiting message
	
	


	dblNutsCost = intNuts * 0.05;//calculate cost
	dblBoltsCost = intBolts * 0.05;//calculate cost
	dblWasherCost = intWashers * 0.02;//calculate cost

	



	System.out.println("Nuts cost: " + df.format(dblNutsCost) + "$");//display message and round cost
	System.out.println("Bolts cost: " + df.format(dblBoltsCost) + "$");//display message and round cost
	System.out.println("Washers cost: " + df.format(dblWasherCost)+ "$");//display message and round cost

	


	dblSubtotal = dblNutsCost + dblBoltsCost + dblWasherCost;//calculate subtotal

	

	System.out.println("dblSubtotal: " + df.format(dblSubtotal) + "$");//display message and round cost
	System.out.println("Total: " + df.format(dblSubtotal + (dblSubtotal * 0.15)) + "$" );//display message and round cost

	

	System.out.println("Thank you for using Home Depot!");//Thank you message
	}
} 