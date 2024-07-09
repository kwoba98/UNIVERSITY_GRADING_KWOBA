//creating the Gradings class, where the grading of marks is done
public class Gradings {
	double marks;//declaring the marks variable as a double
	String grade;//declaring the grade variable as a string
	
	//creating the grading method,it takes in a double as the parameter and returns a String
	public String grading(double M){
		marks = M;//initialising the marks variable as M, which is the marks being graded
		
		//the following lines of code do assign various 'Letters' for various ranges of marks 
		if(marks>=85&&marks<100){
			grade="A+";
		}
		else if(marks>=80&&marks<=84){
			 grade = "A-";	
			}
		else if(marks>=75&&marks<=79){
		 grade = "B+";	
		}
		else if(marks>=70&&marks<=74){
			 grade = "B-";	
			}
		else if(marks>=65&&marks<=69){
			 grade = "C+";	
			}
		else if(marks>=60&&marks<=64){
			 grade = "C-";	
			}
		else if(marks>=55&&marks<=59){
				 grade = "D+";	
			}
		else if(marks>=50&&marks<=54){
			 grade = "D-";	
			}
		else{
			grade = "F";
		}
		return grade;//here we are returning the grade from this method
	



		
	
	
	
	
	
	
	
	
	
	
		 
	 
	
	
	
	

	
	

}}

