
public class grading {
	double marks;//declaring the marks variable as a double.
	int aggregate;//declaring the aggregate variable as an 
	
// creating the gradings method taking in a double and returning an integer
	public int gradings(double M){
		marks = M;//Initializing the marks variable
		//In the next steps , we assigning the aggregate variable with different numbers according to various marks ranges 
		
		if(marks>=80&&marks<=100){
			aggregate=1;
		}
		else if(marks>=75&&marks<=79){
			aggregate = 2;
		}
		else if(marks>=70&&marks<=74){
			aggregate = 3;
		}
		else if(marks>=65&&marks<=69){
			aggregate = 4;
		}
		else if(marks>=60&&marks<=64){
			aggregate = 5;
		}else if(marks>=55&&marks<=59){
			aggregate = 6;
		}
		else if(marks>=45&&marks<=54){
			aggregate = 7;
		}
		else if(marks>=35&&marks<=44){
			aggregate = 8;
		}
		else if(marks>=0&&marks<=34){
			aggregate = 9;
		}
			
		return aggregate;//returning the aggregate 
	
}}

