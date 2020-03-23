package AssignmentsDenys;
import java.util.HashSet;

///https://www.youtube.com/watch?v=X_NfqtyG4Bs
public class DuplicateElementsArray {

	public static void main(String[] args) {
	String arr[]= {"java", "C", "C++", "Python", "java"};
		//First approach
	/*boolean flag=false;
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println("Found Duplicate Element: "+arr[i]);
				flag=true;
			}
			
		}
	}
	if(flag==false) {
		System.out.println("Duplicate element not found");
	}
	

	}*/
	
	//approach # 2 HashSet
	boolean flag=false;
	HashSet <String> langs=new HashSet();
	
	/*System.out.println(langs.add("java"));
	System.out.println(langs.add("Python"));
	System.out.println(langs.add("java"));*/
	
	for(String l:arr) {
		if(langs.add(l)==false) {
		System.out.println("Found Duplicate Element "+l);
		flag=true;
	}
	}
	if(flag==false) {
		System.out.println("Duplicate element not found");
	}
}
	
}

