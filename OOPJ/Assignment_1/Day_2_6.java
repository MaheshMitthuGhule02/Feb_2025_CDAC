class Day_2_6{ 

	//Write a program to display character and string literals along with their ASCII values.

	public static void main(String args[]){
		char ch1='a';
		char ch2='&';
		char ch3='K';
		
		String str="Mahesh";
		String str1="Hello";
		
		System.out.println("Character Literals ASCII Values");
		System.out.println("Char: "+ch1+" Ascii: "+(int)ch1);
		System.out.println("Char: "+ch2+" Ascii: "+(int)ch2);
		System.out.println("Char: "+ch3+" Ascii: "+(int)ch3);
		
		System.out.println("String Literals ASCII Values");
		System.out.println("String: "+str1);
		System.out.println("String: "+str);
	}
}