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


import java.util.Scanner;//importing the Scanner class in our program

//we then go ahead to create the Table class which contains the main  method
public class Table {
public static void main(String [] args){
	
	//creating an object for the Scanner class
	Scanner scan = new Scanner(System.in);
	
	//here we declare our variable
	int N;//is the number of students to be entered
	String grade;//this refers to the grade of the subject according to the marks of a subject
	int sum ;//this the variable to store total mark of all marks in the different subject of an individual student 
	double mean;//this is the variable to store the average mark of a student
	double var;//this is the variable for variance of the student marks
	double SD;//this is thevariable for the standard deviation of marks
	double sumsq;//this the variable for the square of sum
	
	
	//here we are prompting the user to enter 
	System.out.println("Enter the number of students");
	N = scan.nextInt();//we are storing the number of students in the N variable
	
	int marks []= new int[N];//we are creating marks array to hold marks of students 
	String firstname1[] = new String[N];//creating firstname array to hold first name of students
	String lastname1[] = new String[N];//creating the lastname array to hold last names of students
	
	for(int i = 0;i<N;i++){//creation of a for-loop ,so the program below will run up when the number of iterations is eual to number of students entered
	System.out.println("Student"+(int)(i+1));//here we are showing the  student we are dealing with
	
	System.out.println("Enter first name of student");//prompting the user to enter the first name of a student
	firstname1[i] = scan.next();//here we do store the first names into the firstname array
	
	System.out.println("Enter last name of student");//prompting the user to enter the last name of a student
	lastname1[i] = scan.next();//here we do store the last names into the lastname array
	
	System.out.println("Enter student's marks");//prompting the user to enter the students marks
	marks[i] =  scan.nextInt();//here we do store the marks of students in the marks array
	
	
	
	
	}
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println("Studentnumber\t|Firstname\t|Lastname\t|Studentmark\t|Grade\t\t|");//printing the table heading
	System.out.println("---------------------------------------------------------------------------------");
    for(int i= 0; i<N; i++){
	   
	   Gradings obj = new Gradings();//creating an object for the Name class
	   grade=obj.grading(marks[i]);//using the object created 
	   
	   //here we are feeding different fields into our table
		System.out.println((int)(i+1)+"\t         "          + firstname1[i]+"      \t  "+     lastname1[i]+"\t            "       +        marks[i] +"   \t  " + grade);
		System.out.println("---------------------------------------------------------------------------------");
   }
      
    sum =0;//initializing sum variable
    
	 for(int counter=0;counter<marks.length;counter++)//here we looping through the marks array
	 {
		sum += marks[counter];//we are summing up the marks in the marks array and storing the total  into the 'sum' variable 
		}
	
	
	 mean = (sum/N);//we are computing the average mark
	 System.out.println("mean=" + mean);//printing out the mean
	
	 sumsq = Math.pow(sum, 2);  //we are obtaining the square of the the total sum of marks 
	 var = (sumsq/N) - Math.pow(mean,2);//computing the variance and then storing it in the 'var' variable
	 
	 SD = Math.sqrt(var);//we are computing the standard deviation of marks and then assigning it in the 'SD' variable 
	 
	 System.out.println("Standard deviation = "+SD);//we are printing out the standard deviation.
	 
	 
}
}
