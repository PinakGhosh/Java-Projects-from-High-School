/*Pinak Ghosh
*Mr.Pope
* Assignment J8 Question 2
*June 10th 2020
*/


public class VirtualBasketball{
	public static void main(String args[]){

		Basketball player1 = new Basketball("Lebron James","Los Angeles Lakers",23);//Create the Greatest of all time
		Basketball player2 = new Basketball("Anthony Davis","Los Angeles Lakers",3);//Create Anthony Davis

		player2.dribble();//Anthony Davis Dribbles
		player2.pass();//Anthony Davis Passes
		player1.dribble();//Lebron James Dribbles
		player1.shoot();//Lebron James Shoots

	}
}

class Basketball{
	private String strName, strTeam;//declare variables
	private int intNumber;

	public String getName(){//get name
		return strName;
	}
	public void setName(String nameIn){//set name
		strName = nameIn;
	}

	public String getTeam(){//get team
		return strTeam;
	}
	public void setTeam(String teamIn){//set team
		strTeam = teamIn;
	}

	public int getNumber(){//get Number
		return intNumber;
	}	
	public void setNumber(int numberIn){//set Number
		intNumber = numberIn;
	}



	public Basketball(String nameIn, String teamIn, int numberIn){
		strName = nameIn;//variable equal to values
		strTeam = teamIn;
		intNumber= numberIn;

		//display 
		System.out.println("creating Player who's name is " + strName + " wears Number " + intNumber + " and plays for the " + strTeam);
	}



	void dribble(){//Message for when dribble
		System.out.println(strName + " took  10 dribbles.");
	}

	void shoot(){//Message for when Shoot
		System.out.println(strName + " made a fadaway.");
	}

	void pass(){//Message for when pass
		System.out.println(strName + " passes the ball");
	}

}