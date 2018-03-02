package javaPrac;

public class StringPalindrome {

	public static void main(String[] args) {

		String str1="ABCDCBA";
		String str2="Subash";
		
		System.out.println(str1 + " is a palindrome: "+ isPalindrome(str1));
		System.out.println(str2 + " is a palindrome: "+ isPalindrome(str2));

	}

	private static boolean isPalindrome(String str) {
		
		//initialize a boolean value to false. Will be set to true if the 'string' is equal to 'reverse of string'
		boolean val=false;
		
		//Initialize the 'reverse of string' as blank
		String revStr="";
		
		//find length of the original string
		int len=str.length();
		
		//reverse the string
		for(int i=len-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		
		//if string is equal to its reverse, return true
		if(str.equals(revStr)) 
			val=true;			
		return val;		
	}
}