
public class ReverseString {

	public static void main(String[] args) {
	
		String s="comeem";
		String revstrg="";
		s.length();
		System.out.println(s.length());//4
		
		int l=s.length()-1;
		for(int i=l;  i>=0; i--) {
			revstrg=revstrg+s.charAt(i);
	}
		System.out.println(revstrg);
		
		if(s.equals(revstrg)) {
			System.out.println(s+ " This is palindrome");
		}
		else {
			System.out.println(s + " is NOT Palindrome Number");
		}
		
		//using stringbuffr class
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
		
		if(s.equals(sf)) {
			System.out.println(s+ " This is palindrome");
		}
		else {
			System.out.println(s + " is NOT Palindrome Number");
		}
	}

	}
