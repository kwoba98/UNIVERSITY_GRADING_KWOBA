//importing the Scanner class
import java.util.Scanner;
public class student {
	//declaring all our variables and initializing some of them.
	double averagemark=0;
	String studentname;
	String indexnumber;
	double totalMarks;
	int TotalAggregate;
	
	Scanner scan = new Scanner(System.in);
	
    grading Agg = new grading();//creating an object for the grading class
    
    int marks[] = new int[4];//creating the marks array to hold students marks
  
  //We are passing marks of the subjects into the gradings method of the grading class ,in order to obtain aggregates of each  subject
	int aggreagetOfSubject1 = Agg.gradings(marks[0]);
	int aggreagetOfSubject2 = Agg.gradings(marks[1]);
	int aggreagetOfSubject3 = Agg.gradings(marks[2]);
	int aggreagetOfSubject4 = Agg.gradings(marks[3]);
	
	//we are creating the class constructor and passing studentname, averagemark, TotalAggregate as ur parameters.
	student(String studentname,double averagemark,int TotalAggregate){
		this.studentname= studentname;
		this.averagemark=averagemark;
		this.TotalAggregate=TotalAggregate;
		
	}
	
     //method for calculating the average mark.
	 /*Creating averageMark method to compute average mark of our subjects
	  This method takes in an array of elements of the integer data type and returns average mark as a double.
	  */ 
	 public  double averageMark(int marks[]){
		 totalMarks=0;
		 for (int counter=0;counter<marks.length;counter++){
			 
			 totalMarks+=marks[counter];
		 }
		 averagemark = totalMarks/marks.length;
			return averagemark;  
		 }
	 
	 //method for calculating the total aggregate.
	 //Here we are creating the totalAggregate method  to sum up  aggregates of our  subjects.
	 //this method returns TotalAggregate as an integer.
	 public int totalAggregate(){
		 TotalAggregate= aggreagetOfSubject1+aggreagetOfSubject2+aggreagetOfSubject3+aggreagetOfSubject4 ;
		
		 return TotalAggregate;
		 
	 }
	 
	 //creating the studentReport method for printing out the report.
	 //It takes in studentname,averagemark,TotalAggregate, studentClass, indexnumber as parameters 
	 public void studentReport(String studentname,double averagemark,int TotalAggregate){
			
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("\t\tSTUDENT REPORT");
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("STUDENT'S NAME:" + studentname );
		 System.out.println("STUDENT'S INDEX NUMBER: " + indexnumber );
		 System.out.println("STUDENT'S MARKS  "+"AGGREGATE");
		 System.out.println("Subject 1 :"+ marks[0]+"    "+   aggreagetOfSubject1);
		 System.out.println("Subject 2 :"+ marks[1]+"    "+   aggreagetOfSubject2);
		 System.out.println("Subject 3 :"+ marks[2]+"    "+   aggreagetOfSubject3);
		 System.out.println("Subject 4 :"+ marks[3]+"    "+   aggreagetOfSubject4);
		 
		 
		 
		 System.out.println("STUDENT'S average mark is :" + averageMark(marks) );//printing the students average mark
		 
		 
		 System.out.println("STUDENT'S total aggregate is :" + TotalAggregate );//printing the total aggregates of all subjects of the student
		 
	 
	 
 }
	 
	
	

}
