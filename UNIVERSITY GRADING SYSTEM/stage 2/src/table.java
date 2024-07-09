/*GROUP MEMBERS          REGISTRATION NUMBER
 1.KWOBA FREDRICK        18/U/ETE/10180/PE
 2.SSOZI JOSEPH          18/U/ETE/10199/PE
 3.OKIROR MOSES          19/U/ETE/17732/PE
 4.MBOGO ABDULWAHABU     19/U/ETD/18425/GV
 5.OWINO EMMANUEL        18/U/ETE/10176/PE
 6.AINEMBABAZI MICHEAL   18/U/ETE/10166/PE
 7.KIKKA JEREMIAH PAUL   18/U/ETE/10165/PE     
 8.NICK PHILLIAM         18/U/ETE/10163/PE
 
 */

import java.util.Scanner;//importing the Scanner class 

public class table {//creating table class which contains the main method
public static void main(String [] args){
	
	 String studentname;//this will hold the student names
	 int TotalAggregate=0;//this will hold the total aggregates of students
	 double averagemark=0;//this will hold the average mark of each students
	 
	//creating an object for the scanner class
	Scanner scan = new Scanner(System.in);
	
    //prompting the user to enter the students names
	System.out.println("Enter the students names");
	studentname = scan.nextLine();//storing the student names in the studentname variable
	
	
	student rep = new student(studentname, averagemark, TotalAggregate);//creating an object for the student class
	grading grad = new grading();//creating an object for the grading class
	
	
	
	
	//prompting the user to enter the students index number.
	 System.out.println("Enter the students index number");
	 rep.indexnumber = scan.nextLine();//storing the students index number in the indexnumber variable
	
	//prompting the user to enter marks of corresponding subjects and storing these marks in the marks array 
		System.out.println("enter marks of subject 1");
		rep.marks[0]= scan.nextInt();
		System.out.println("enter marks of subject 2");
		rep.marks[1]= scan.nextInt();
		System.out.println("enter marks of subject 3");
		rep.marks[2]= scan.nextInt();
		System.out.println("enter marks of subject 4");
		rep.marks[3]= scan.nextInt();
		
		

		//passing the marks  of subjects into the gradings method in order to obtain aggregates of subjects
		rep.aggreagetOfSubject1 = grad.gradings(rep.marks[0]);
		rep.aggreagetOfSubject2 = grad.gradings(rep.marks[1]);
		rep.aggreagetOfSubject3 = grad.gradings(rep.marks[2]);
		rep.aggreagetOfSubject4 = grad.gradings(rep.marks[3]);
		
		//here, we are calling the studentReport of the student class
	rep.studentReport(studentname, rep.averageMark(rep.marks), rep.totalAggregate());
	
	
  
}
}