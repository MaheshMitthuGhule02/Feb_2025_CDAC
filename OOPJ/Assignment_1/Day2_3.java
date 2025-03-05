class Day2_3{
	public static void main(String args[]){
		//Write a program to calculate the average of three int numbers using typecasting to display the result in double.
	
		int a=8768;
		short s=58;
		//float f=569.87;//  error: incompatible types: possible lossy conversion from double to float
		float f=569.87f;
		double result=(double)((a+s+f)/3);
		System.out.println("Average of three no is: "+result);
	}	
}