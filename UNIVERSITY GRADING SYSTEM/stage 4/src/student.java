
public class student {
	//declaring all our variables and initializing some of them.
	double averagemark=0;
	String studentname;
	String indexnumber;
	int totalMarks;
	int TotalAggregate;
	int classInteger;
	String studentClass = "P."+classInteger;
	

	//declaring the marks array, which is going to hold average marks for the math subject, English array,SST array  and Science array
	 double marks[] = new double[4];
	 
	 //here we are declaring our arrays to hold sub-subjects of the main subjects having sub-subjects i.e English,SST,Science
	 double English[] =  new double[3]; 
	 double SST[] = new double[3];
	 double Science[] = new double[2];
	 
	 //declaring the aggregates array to hold aggregates of the main subjects.
	 int aggregates[] = new int[4];
	
	 //here we are creating an object for the grading class
	grading Agg = new grading();
	
	//We are passing marks of the main subjects into the gradings method of the grading class ,in order to obtain aggregates of each main subject
	int aggreagetOfSubject1 = Agg.gradings(marks[0]);
	int aggreagetOfSubject2 = Agg.gradings(marks[1]);
	int aggreagetOfSubject3 = Agg.gradings(marks[2]);
	int aggreagetOfSubject4 = Agg.gradings(marks[3]);
	
	//we are creating the class constructor and passing studentname, averagemark, TotalAggregate as our parameters.
	student(String studentname,double averagemark,int TotalAggregate){
		this.studentname= studentname;
		this.averagemark=averagemark;
		this.TotalAggregate=TotalAggregate;
	}
	
	
	 /*Creating averageMark method to compute average mark of the main subjects
	  This method takes in an array of elements of the double data type and returns average mark as a  double.
	  */
	 public  double averageMark(double marks[]){
		 totalMarks=0;
		 for (int counter=0;counter<marks.length;counter++){
			 
			 totalMarks+=marks[counter];
		 }
		 averagemark = totalMarks/marks.length;
			return averagemark;  
		 }
		
	 //Here we are creating the totalAggregate method  to sum up  aggregates of our main subjects.
	 //this method returns TotalAggregate as an integer.
	 public int totalAggregate(){
		 TotalAggregate= aggreagetOfSubject1+aggreagetOfSubject2+aggreagetOfSubject3+aggreagetOfSubject4 ;
		
		 return TotalAggregate;	 
	 }
	
	 //Creation of the studentReport method to print out the students report.
	 //It takes in studentname, studentClass, indexnumber, TotalAggregate as parameters and returns the report as a string.
	String studentReport(String studentname,String studentClass,String indexnumber,int TotalAggregate){
		return  "Student name    : " + studentname +"\n"+
	            " Index number   : " + indexnumber +"\n"+
				" studentClass   : " +studentClass +"\n"+
	            "------------------------------------------------------------\n"+
				"|SUBJECT"+ " | STUDENT'S MARKS  "+      "|  AGGREGATE |"  +"\n"+
				 "------------------------------------------------------------\n"+
				"MATH                       "+"   \t\t  "    + marks[0]+"     \t\t                      "+   aggreagetOfSubject1+"\n"+
				"ENGLISH                    "+"   \t\t  "    + marks[1]+"      \t\t                     "+   aggreagetOfSubject2+"\n"+
				"SCIENCE                    "+"   \t\t  "    + marks[2]+"      \t\t                     "+   aggreagetOfSubject3+"\n"+
				"SOCIAL-STUDIES          "+ marks[3]+"    \t\t                      "+   aggreagetOfSubject4+"\n"+
				 "------------------------------------------------------------\n"+
				"STUDENT'S average mark is    :  " + averageMark(marks)+"\n"+
				"STUDENT'S total aggregate is :  " + TotalAggregate+"\n\n"
				
				;}}



	
