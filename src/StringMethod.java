
public class StringMethod {

	public static void main(String[] args) {
		String s="welcome";
		//length
		//int l=s.length;
		
		System.out.println("length of variable is: "+s.length());//7 returns number of characters in a string/length of a string
		
		
		String s1="welcome";
		String s2=" to java";
		String s3 = " selenium";
		System.out.println(s1+s2);//welcome to java
		System.out.println("welcome"+" to java");//welcome to java
		System.out.println(s1 + " to java");//welcome to java	
		System.out.println(s1.concat(s2));//welcome to java
	    System.out.println("welcome".concat(" to java"));//welcome to java
		System.out.println(s1.concat(s2).concat(s3));//welcome to java selenium
		
		//trim - trimming spaces
		
		s="      welcome     ";
		System.out.println("Before trimming: "+s);
		System.out.println(s.length());//18
		System.out.println("After trimming: "+s.trim());//welcome
		System.out.println(s.trim().length());//7

		//charAt()
		System.out.println(s1.charAt(4));//0
		System.out.println(s2.contains("ja"));//true
		System.out.println(s3.equals(" selenium"));//true
		System.out.println(s3.equals("selenium"));//false
		
		System.out.println(s1.equalsIgnoreCase("WELCOME"));//true
		System.out.println(s1.equalsIgnoreCase("WelcomE"));//true
		System.out.println(s1.equalsIgnoreCase("welcame"));//false
		
		
		System.out.println(s1.replace('w', 'z'));//w replaced on z = zelcome
		System.out.println(s1.replace("welcome", "bye bye"));// welcome replaced on bye bye
		
		System.out.println(s1.substring(1,3));//el
		System.out.println(s2.substring(2,7));//o jav
		
		System.out.println(s1.toUpperCase());//WELCOME
		System.out.println(s2.toLowerCase());
		
		//swaping of two strings
		System.out.println("Before swapping: ".concat(s1).concat(s2));
		//append s1 and s2
		s1=s1+s2;//welcometojava
		
		//store initial string s1 in string s2
		s2=s1.substring(0,s1.length()-s2.length());//welcome
		
		//store initial string s2 in string s1
		s1=s1.substring(s2.length());//to java
		System.out.println("After swapping: ".concat(s1).concat(s2));
		
		
		
	}

}
