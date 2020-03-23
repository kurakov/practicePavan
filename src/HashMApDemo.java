import java.util.HashMap;

public class HashMApDemo {

	
	
	public static void main(String[] args) {
		//declare hashmap
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		//Add pairs to the HashMAp, Keys should be unique
		
		hm.put(101,	"Denys");
		hm.put(1012,	"Deny");
		hm.put(1021,	"Den");
		hm.put(10221,	"De");
		hm.put(1011,	"D");
		
		//print hashmap
		System.out.println(hm);
		
		//size of the hashmap
		
		System.out.println((hm.size()));
		
		//remove a pair
		
		hm.remove(101);
		System.out.println(hm);
		
		//extract/read value of key
		
		System.out.println(hm.get(1012));
		
		//print only values from hasmap
		
		for(String x:hm.values()) {
				System.out.println(x);
		}
		
		
		//print only keys from hasmap
		
				for(Integer x:hm.keySet()) {
						System.out.println(x+" "+hm.get(x));
				}
				
		//clear hashmap
				
				hm.clear();
				System.out.println(hm);
	}

}
