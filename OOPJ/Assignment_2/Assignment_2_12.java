/*    :  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
		Hint  : Use bitwise left shift (  <<  */
class Assignment_2_12{
	public static void main(String[] args){
		check(7);
		check(20);
		check(-9);
	}
	
	public static void check(int a){
		//Use bitwise left shift (  <<  ) 
		int result = a << 3;
		System.out.println(result);
	} 
}