//creating our seniorStudent class which is a subclass of the student class.
public class seniorStudent extends student{
	
	//we are creating the class constructor and passing studentname, averagemark, TotalAggregate as our parameters.
	seniorStudent(String studentname, double averagemark, int TotalAggregate) {
		super(studentname, averagemark, TotalAggregate);/*we are using the super keyword because this class is using same variables as the
		student class
		*/
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
 
 
 //Creation of the studentReport method to print out the students report.
 //It takes in studentname, studentClass, indexnumber, TotalAggregate as parameters and returns the report as a string.
 String studentReport(String studentname,String studentClass,String indexnumber,int TotalAggregate){
		return "Student name   : " + studentname +"\n" +
	           " Index number  : " + indexnumber +"\n"+
				" studentClass : " +studentClass +"\n"+
				 "------------------------------------------------------------\n"+
				 "|SUBJECT"+ " | STUDENT'S MARKS  "+      "|  AGGREGATE |"  +"\n"+
				 "------------------------------------------------------------\n"+
				"MATH         :" +   super.marks[0]+ "      \t\t      " +     aggreagetOfSubject1+"\n\n"+
				"    ENGLISH SUB-SUBJECTS  "+"\n"+
				" spelling    :"+super.English[0]+"\n"+
				" Grammar     :"+super.English[1]+"\n"+
				"Poetry       :"+super.English[2]+"\n"+
				"TOTAL ENGLISH MARKS :"+ super.marks[1]+"    "+    aggreagetOfSubject2+"\n\n"+
				"    SCIENCE SUB-SUBJECTS  "+"\n"+
				" Biology     :"+super.Science[0]+"\n"+
				"Physics      :"+super.Science[1]+"\n"+
				"TOTAL SCIENCE MARKS :"+ super.marks[2]+"    "+    aggreagetOfSubject3+"\n\n"+
				"    SOCIAL STUDIES SUB-SUBJECTS  "+"\n"+
				" History      :"+super.SST[0]+"\n"+
				" civics       :"+super.SST[1]+"\n"+
				"geography     :"+super.SST[2]+"\n"+
				 
				"TOTAL SOCIAL-STUDIES MARKS :"+ super.marks[3]+"    "+    aggreagetOfSubject4+"\n"+
				"------------------------------------------------------------\n"+
				"STUDENT'S average mark is    :  " + averageMark(super.marks)+"\n"+
				"STUDENT'S total aggregate is :  " + TotalAggregate+"\n"
				
				
				
				;
	} 
}
 
	

