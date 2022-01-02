/*Pinak Ghosh
*Mr.Pope
* Assignment J7 Part 2
*May 20th 2020
*/

import java.text.DecimalFormat; //will be rounding to second decimal

class TuitionCalc{

	private static DecimalFormat df = new DecimalFormat("0.00");//round to 2 decimals

	public static void main (String[] args){
	int intCounter;// declaring Variables
	double dblTuition;

	dblTuition = 12000;//setting value to variables

	System.out.println("The starting tuition is 12,000$ and increases by 6% a year.");//display message

	for (intCounter=2020; intCounter <= 2030; intCounter++){// loop this equation 10 times to find tution in 10 years
		dblTuition = dblTuition + (dblTuition * 0.06);
	}

	System.out.println("After 10 years the tuition will be " + df.format(dblTuition) + "$");//display tuition in 10 years

	}	

}
