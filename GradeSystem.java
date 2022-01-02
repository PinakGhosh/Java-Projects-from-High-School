/*Pinak Ghosh
*Mr.Pope
* Assignment J8 Question 2
*June 10th 2020
*/


public class GradeSystem{
	public static void main(String args[]){

		Calculation student1 = new Calculation();//Create new student
		student1.quiz1 = 6;
		student1.quiz2 = 8;
		student1.quiz3 = 5;
		student1.quiz4 = 7;
		student1.quiz5 = 7;
		student1.midterm = 76;
		student1.exam = 93;
		student1.name  = "Andre";
		student1.results();


		Calculation student2 = new Calculation();//Create new student
		student2.quiz1 = 10;
		student2.quiz2 = 10;
		student2.quiz3 = 10;
		student2.quiz4 = 10;
		student2.quiz5 = 10;
		student2.midterm = 100;
		student2.exam = 100;
		student2.name  = "Pinak";
		student2.results();

		Calculation student3 = new Calculation();//Create new student
		student3.quiz1 = 9;
		student3.quiz2 = 9;
		student3.quiz3 = 8;
		student3.quiz4 = 9;
		student3.quiz5 = 10;
		student3.midterm = 90;
		student3.exam = 93;
		student3.name  = "Emily";
		student3.results();

		Calculation student4 = new Calculation();//Create new student
		student4.quiz1 = 6;
		student4.quiz2 = 3;
		student4.quiz3 = 5;
		student4.quiz4 = 2;
		student4.quiz5 = 1;
		student4.midterm = 67;
		student4.exam = 59;
		student4.name  = "Andrew";
		student4.results();

		Calculation student5 = new Calculation();//Create new student

		student5.quiz1 = 8;
		student5.quiz2 = 8;
		student5.quiz3 = 8;
		student5.quiz4 = 9;
		student5.quiz5 = 8;
		student5.midterm = 85;
		student5.exam = 97;
		student5.name  = "Marshall";
		student5.results();



	}
}	

class Calculation{
 int quiz1,quiz2,quiz3,quiz4,quiz5,midterm,exam,average;//declare Variables
 String name, grade;

	public int getQuiz1(){//set quiz
		return quiz1;
	}


	public int getQuiz2(){//set quiz
		return quiz2;
	}


	public int getQuiz3(){//set quiz
		return quiz3;
	}


	public int getQuiz4(){//set quiz
		return quiz4;
	}

	public int getQuiz5(){//set quiz
		return quiz5;
	}

	public int getMidterm(){//set Midterm
		return midterm;
	}

	public int getExam(){//set exam
		return exam;
	}

	public String getName(){//set name
		return name;
	}

	public int getAverage(){//find average
		average = (exam/4) + (midterm/4) +((((quiz1 + quiz2 + quiz3 + quiz4 + quiz5)/5)*10)/2);
		return average;
	}

	public String letterGrade(){//find letter grade
		if (getAverage()>= 90){
			grade = "A";
		}

		else if (getAverage() >= 80 && getAverage() < 90 ){
			grade = "B";
		}

		else if (getAverage() >= 70 && getAverage() < 80 ){
			grade = "C";
		}

		else if (getAverage() >= 60 && getAverage() < 70 ){
			grade = "D";
		}

		else if (getAverage() < 60){
			grade = "F";
		}
		
		return grade;
	}




	


	void results(){//action to display message
		System.out.println(name + " average is " + getAverage() + " or " + letterGrade());
	}



}
