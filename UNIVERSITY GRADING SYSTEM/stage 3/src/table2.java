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
import java.util.Scanner;//Importing Scanner class we are going to use.

//creating table2 class which contains the main method
public class table2 {
public static void main(String [] args){
	//declaring all our variables and initializing some of them.
	String studentname;
	String indexnumber;
	int classInteger=0;
	String studentClass ;
	int TotalAggregate=0;
	double averagemark=0;
	int N;//N is the number of students
	
	
	
	
//	student sen= new seniorStudent(studentname, averagemark, TotalAggregate);
	
	//creating an object for the grading class.
	grading grad = new grading();
	
	//Creating an object for the Scanner class
	 Scanner scan = new Scanner(System.in);
	 
	 //promptiing the user to enter number of students
	System.out.println("Enter number of students");
	N = scan.nextInt(); 
	
	
	
	for(int i =0;i<N;i++){
		/*here we are making the following lines of code to repeat running until the iterations are equal to the number
		of students entered.
		*/
	System.out.println("Student:"+(int)(i+1));//this line of code shows the number of student you are dealing with
	System.out.println("Enter the students names");//prompting the user to enter student names
	studentname = scan.next();//student names are stored in the studentname variable.
	
	
	student rep = new student( studentname,averagemark,TotalAggregate);//creating object for the student class
	student sen= new seniorStudent(studentname, averagemark, TotalAggregate);//creating an object for the seniorStudent class
	
	System.out.println("Enter the students index number");//prompting the user to enter the students index number
	indexnumber = scan.next();//the index number is stored in the indexnumber variable
	
	System.out.println("The student is in primary ?");//prompting the user to enter the primary integer of the class the student is in.
	classInteger =scan.nextInt();//the class integer is stored in the classInteger variable
	studentClass = "P."+ classInteger;//here we are coming up with the Class of the student using the class integer variable
	
	
	if(classInteger>=5&&classInteger<=7){//the following lines of code will run as long as the student is in primary five and above.
		
		//here we are declaring our arrays to hold sub-subjects of the main subjects having sub-subjects i.e English,SST,Science
		 double English[] =  sen.English; 
		 double SST[]     =  sen.SST;
		 double Science[] =  sen.Science;
		
		 //Here we are prompting the user to enter marks of various sub-subjects 
		//for math which doesnot have sub-subjects, its marks are directly stored in the marks[0].
		//for math.
		System.out.println("FOR THE MATH SUBJECT");
		System.out.println("enter marks of math");
		sen.marks[0] = scan.nextDouble();
				
		
		//Here we are prompting the user to enter marks of various sub-subjects. and storing them in their respective arrays
		//for English
		System.out.println("FOR THE ENGLISH SUBJECT");
		System.out.println("enter marks of Spelling");
		English[0]= scan.nextDouble();
		System.out.println("enter marks of Grammar");
		English[1]= scan.nextDouble();
		System.out.println("enter marks of Poetry");
		English[2]= scan.nextDouble();
		
				
		
		//for SCIENCE
		System.out.println("FOR THE SCIENCE SUBJECT");
		System.out.println("enter marks of Biology");
		Science[0]= scan.nextDouble();
		System.out.println("enter marks of Physics");
		Science[1]= scan.nextDouble();
		
		//for SST
		System.out.println("FOR THE SST SUBJECT");
		System.out.println("enter marks of History ");
		SST[0]= scan.nextDouble();
		System.out.println("enter marks of Civics");
		SST[1]= scan.nextDouble();
		System.out.println("enter marks of Geography");
		SST[2]= scan.nextDouble();
				

		
		
		//here, we are obtaining marks of our main subjects by obtaining an average of their subsequent sub-subjects
		
		sen.marks[1]= sen.averageMark(English);
		
		sen.marks[2]= sen.averageMark(Science);
		
		sen.marks[3]= sen.averageMark(SST);
		
		//passing of the marks of main subjects into the gradings method in order to obtain aggregates of individual main subjects
		sen.aggreagetOfSubject1 = grad.gradings(sen.marks[0]);
		sen.aggreagetOfSubject2 = grad.gradings(sen.marks[1]);
		sen.aggreagetOfSubject3 = grad.gradings(sen.marks[2]);
		sen.aggreagetOfSubject4 = grad.gradings(sen.marks[3]);
		
		
	
	
	
	
		/*here we are calling the studentReport method of the seniorStudent class */
	sen.studentReport(studentname, sen.averageMark(sen.marks), sen.totalAggregate(),studentClass,indexnumber);
	
	
  
}else{//the following lines of code will run if the student is not a senior student i.e below primary five.
	
	//entering marks of individual subjects and then storing then into the marks array of the seniorStudent class
		System.out.println("enter marks of Math");
		rep.marks[0]= scan.nextInt();
		
	   System.out.println("enter marks of English");
	   rep.marks[1]= scan.nextInt();
		
	   
	  
	   System.out.println("enter marks of Science");
		rep.marks[2]= scan.nextInt();
	  
		System.out.println("enter marks of Social Studies");
		rep.marks[3]= scan.nextInt();
	  
		
		

		/*here we are obtaining aggregates of main subjects,respective marks of main subjects are passed into the gradings method 
		 of the grading class
	   */
		rep.aggreagetOfSubject1 = grad.gradings(rep.marks[0]);
		rep.aggreagetOfSubject2 = grad.gradings(rep.marks[1]);
		rep.aggreagetOfSubject3 = grad.gradings(rep.marks[2]);
		rep.aggreagetOfSubject4 = grad.gradings(rep.marks[3]);
		
		
	
	
	
	
		/*here we are calling the studentReport method of the student class */
	rep.studentReport(studentname,rep.averageMark(rep.marks), rep.totalAggregate(),studentClass,indexnumber);
	
	};
}
}}