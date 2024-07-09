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

//Importing classes we are going to use.

import javax.swing.JOptionPane;
import java.util.Scanner;

//creating table2 class which contains the main method
public class table2 {
public static void main(String [] args){
	
	try{//we are starting off with catching all exceptions which might occur in our code.
	//declaring all our variables and initializing some of them.	
	String studentname;
	String indexnumber;
	double averagemark=0;
	int TotalAggregate=0;
	int classInteger=0;
	String studentClass ;
	int N;//N is the number of students
	
	//creating an object for the grading class.
	grading grad = new grading();
	
    //creatin an object scan, for the scanner class.
	 Scanner scan = new Scanner(System.in);
	
	/*Using the JOptionPane to input our "number of students"
	 JOptionPane only inputs String data type inputs
	 So we first capture the number of students as a string fn, and the convert it into an integer
	 finally we store this integer in the N variable. 
	 */
	String fn = JOptionPane.showInputDialog("Enter number of students");
	N = Integer.parseInt(fn);
	
	
	
	for(int i =0;i<N;i++){/*here we are making the following lines of code to repeat running until the iterations are equal to the number
	of students entered.
	*/
	
	//Directly storing the student names in the studentname variable by the help of the JOptionPane.
	studentname = JOptionPane.showInputDialog("Enter the students names");
	
	
	
	//Directly storing the index number in the indexnumber variable by the help of the JOptionPane.
	indexnumber = JOptionPane.showInputDialog("Enter the students index number");
	
	/*Here we are declaring classInteger1 as a string, and passing assigning it number of the class of the student
	
	 * */
	String classInteger1=JOptionPane.showInputDialog("The student is in primary ?");
	
	//here we are changing the classInteger1 into an integer and assigning this integer to classInteger variable  
	classInteger =Integer.parseInt(classInteger1);
	studentClass = "P."+ classInteger;//here we are coming up with the class of the student and storing it into the studentsClass variable.
	
	student rep = new student( studentname, averagemark, TotalAggregate);//creation of student class object and passing in respective parameters.
	student sen= new seniorStudent(studentname, averagemark, TotalAggregate);//creation of seniorStudent class object and passing in respective parameters.
	
	if(classInteger>=5&&classInteger<=7){//the following lines of code will run as long as the student is in primary five and above.
		
		//here we are declaring our arrays to hold sub-subjects of the main subjects having sub-subjects i.e English,SST,Science
		 double English[] =  sen.English; 
		 double SST[]     = sen.SST;
		 double Science[] = sen.Science;
		
		//Inputing marks for sub-subjects of the following main subjects, with the help of JoptionPane
		//for English
		String spelling = JOptionPane.showInputDialog("enter marks of Spelling");
		English[0]= Double.parseDouble(spelling);
		
		String grammar = JOptionPane.showInputDialog("enter marks of Grammar");
		English[1]= Double.parseDouble(grammar);
		
		String poetry = JOptionPane.showInputDialog("enter marks of Poetry");
		English[2]= Double.parseDouble(poetry);
		
		//for SST
		String sst1 = JOptionPane.showInputDialog("enter marks of History");
		SST[0]= Double.parseDouble(sst1);

		String sst2 = JOptionPane.showInputDialog("enter marks of Civics");
		SST[1]= Double.parseDouble(sst2);
		
		String sst3 = JOptionPane.showInputDialog("enter marks of Geography");
		SST[2]= Double.parseDouble(sst3);
		
		
		//for SCIENCE
		String science1 = JOptionPane.showInputDialog("enter marks of Biology");
		Science[0]= Double.parseDouble(science1);
		
		String science2 = JOptionPane.showInputDialog("enter marks of Physics");
		Science[1]= Double.parseDouble(science2);
		
		
		//for math
		//for math which doesnot have sub-subjects, its marks are directly stored in the marks[0].
		String math = JOptionPane.showInputDialog("enter marks of Maths");
		sen.marks[0]= Double.parseDouble(math);
		

		//here, we are obtaining marks of our main subjects by obtaining an average of their subsequent sub-subjects.
		sen.marks[1]= sen.averageMark(English);
		sen.marks[2]= sen.averageMark(Science);
		sen.marks[3]= sen.averageMark(SST);
		
		//passing of the marks of main subjects into the gradings method in order to obtain aggregates of individual main subject 
		sen.aggreagetOfSubject1 = grad.gradings(sen.marks[0]);
		sen.aggreagetOfSubject2 = grad.gradings(sen.marks[1]);
		sen.aggreagetOfSubject3 = grad.gradings(sen.marks[2]);
		sen.aggreagetOfSubject4 = grad.gradings(sen.marks[3]);
		
		
	
	
	/*we are calling showMessageDialog method of the JOptionPane class ,in which we call our studentReport method found in the seniorStudent classand pass in  
	                   respective parameters          */
		JOptionPane.showMessageDialog(null, sen.studentReport(studentname,studentClass,indexnumber,sen.totalAggregate()),"REPORT",JOptionPane.PLAIN_MESSAGE);
		 
	}
	else{//the following lines of code will run if the student is not a senior student i.e below primary five.
	
		//entering marks of individual subjects and then storing then into the marks array of the student class
	   String maths = JOptionPane.showInputDialog("enter marks of Maths");
	   rep.marks[0]= Double.parseDouble(maths);
	
		
		
	   String english = JOptionPane.showInputDialog("enter marks of English");
	   rep.marks[1]= Double.parseDouble(english);
	  
	   
	   String science = JOptionPane.showInputDialog("enter marks of Science");
	   rep.marks[2]= Double.parseDouble(science);
		
	   String sst = JOptionPane.showInputDialog("enter marks of Social Studies");
	   rep.marks[3]= Double.parseDouble(sst);
		
		
		/*here we are obtaining aggregates of main subjects,respective marks of main subjects are passed into the gradings method 
		 of the grading class
	   */
		rep.aggreagetOfSubject1 = grad.gradings(rep.marks[0]);
		rep.aggreagetOfSubject2 = grad.gradings(rep.marks[1]);
		rep.aggreagetOfSubject3 = grad.gradings(rep.marks[2]);
		rep.aggreagetOfSubject4 = grad.gradings(rep.marks[3]);
		
		/*we are calling showMessageDialog method of the JOptionPane class ,in which we call our studentReport  method found in student class
		 and pass in  respective parameters          */
	JOptionPane.showMessageDialog(null, rep.studentReport(studentname,studentClass,indexnumber,rep.totalAggregate()),"\t\tSTUDENTS REPORT",JOptionPane.PLAIN_MESSAGE);
	};
}
	}
	/* the following lines of code, are for catching any exception found in the above code ,
	  prints out what the user should do
	 * */
	catch(Exception e){
		
		JOptionPane.showMessageDialog(null, "Please enter correct inputs in respective entries");
	}
   
	

}}