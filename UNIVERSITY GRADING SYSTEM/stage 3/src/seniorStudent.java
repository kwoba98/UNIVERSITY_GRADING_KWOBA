//creating our seniorStudent class which is a subclass of the student class.
public class seniorStudent extends student{

/*String studentname;
String indexnumber;
double English[] =  new double[3]; 
double SST[] = new double[3];
double Science[] = new double[2];
 double marks[] = new double[4];*/
 
	//we are creating the class constructor and passing studentname, averagemark, TotalAggregate as our parameters.
 seniorStudent(String studentname, double averagemark, int TotalAggregate) {
		super(studentname, averagemark, TotalAggregate);
		
	}
 
 
 /*Creating averageMark method to compute average mark of the main subjects
 This method takes in an array of elements of the integer data type and returns average mark as a double.
 */
 public  double averageMark(int i[]){
	 totalMarks=0;
	 for (int counter=0;counter<i.length;counter++){
		 
		 totalMarks+=i[counter];
	 }
	 averagemark = totalMarks/i.length;
		return averagemark;  }
 

 //Here we are creating the totalAggregate method  to sum up  aggregates of our main subjects.
 //this method returns TotalAggregate as an integer.
 public int totalAggregate(){
	 TotalAggregate= aggreagetOfSubject1+aggreagetOfSubject2+aggreagetOfSubject3+aggreagetOfSubject4 ;
	
	 return TotalAggregate; }
 
 //here, we are creating the studentReport method, we are passing in  studentname, averagemark, aggregate, studentClass, indexnumber as our parameters
 //but its return type is void
 public void studentReport(String studentname,double averagemark,int aggregate,String studentClass,String indexnumber){
	
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("\t\t\tSTUDENT REPORT");//prnting the report header.
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("STUDENT'S NAME        :" + studentname );
		 System.out.println("STUDENT'S INDEX NUMBER: "+ indexnumber );
		 System.out.println("STUDENT'S CLASS       :" + studentClass );
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println( "|SUBJECT"+   " | STUDENT'S MARKS  "+      "|  AGGREGATE |"  );//printing the table heading.
		 System.out.println("---------------------------------------------------------------------");
		 
		 System.out.println("MATH      :" +   super.marks[0]+ "   \t   " +     aggreagetOfSubject1);
		 
		 System.out.println("    ENGLISH SUB-SUBJECTS  ");
		 System.out.println("Spelling :" +super.English[0] );
		 System.out.println("Grammar  :" +super.English[1] );
		 System.out.println("Poetry   :" +super.English[2] );
		 System.out.println("TOTAL ENGLISH MARKS :"+ super.marks[1]+"    "+    aggreagetOfSubject2);
		 
		 
		 System.out.println("    SCIENCE SUB-SUBJECTS  ");
		 System.out.println("Biology :" +super.Science[0] );
		 System.out.println("Physics :" +super.Science[1] );
		 System.out.println("TOTAL SCIENCE MARKS :"+ super.marks[2]+"    "+   aggreagetOfSubject3);
		 
		 
		 System.out.println("    SOCIAL STUDIES SUB-SUBJECTS  ");
		 System.out.println("History   :" +super.SST[0] );
		 System.out.println("Civics    :" +super.SST[1] );
		 System.out.println("Geography :" +super.SST[2] );
		 System.out.println("TOTAL SOCIAL STUDIES  :"+ super.marks[3]+"    "+   aggreagetOfSubject4);
		 
		 
		 System.out.println("STUDENT'S average mark is    :" + averagemark );//printing the averagemark
		 System.out.println("STUDENT'S total aggregate is :" + TotalAggregate );//printing the averagemark
		 System.out.println("-------------------------------------------------------------------");
		 System.out.println("\n");
		 
	 
	   
 }
 
}
 
	

