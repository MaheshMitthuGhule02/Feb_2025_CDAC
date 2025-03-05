class Day2_2{
	public static void main(String args[]){
		//Write a program to convert a double value to int using typecasting and explain the data loss.
	
		double a=867658.858989d;
		int d=(int)a;
		System.out.println("a: "+a);
		System.out.println("d: "+d);
		/* This is explicit casting in which we are casting from larger data type to the smaller data type
		there is the losing of the data orr the information.
		The data is loss because we converting long size memory size datatype to the small size datatype.*/
	}	
}