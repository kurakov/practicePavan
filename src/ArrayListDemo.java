import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// how to declare array list
		
		//ArrayList<Integer>list = new ArrayList<Integer>();//only integer we can store
		
		ArrayList list=new ArrayList ();//if we want to store different type of data
		
		
		//Adding values into array list
		list.add(100);
		list.add("welcome");
		list.add(10.5);
		list.add('A');
		list.add(true);
		
		//find size of arrayList
		
		System.out.println(list.size());//5
		
		//print values of array list
		System.out.println(list);//[100, welcome, 10.5, A, true]
		
		//remove item from arraylist
		
		list.remove(2);
		System.out.println("after removing second element from arraylist "+list);//[100, welcome, A, true]
		
		//adding new element in exiting arraylist
		list.add("java");
		System.out.println("after adding a new value into arraylist "+list);//[100, welcome, A, true, java]
		
		//insert a new value into arraylist
		
		list.add(2,"selenium");
		System.out.println("After insertion a new value "+list);//[100, welcome, selenium, A, true, java]
		
		//read specific value fromm arrayList
		
		//list.get(2);
		System.out.println(list.get(2));//selenium
		
		//read all values from arraylist - normal for loop
		
		for(int i=0; i<=list.size()-1; i++) {
			System.out.print(list.get(i)+"\t");
		}
		
		//enhanced for loop
		
		for(Object x:list) {
			System.out.println(x);
		}
		
		//how to sort arrayList
	ArrayList<Integer> list1= new ArrayList<Integer>();
	list1.add(500);
	list1.add(400);
	list1.add(200);
	list1.add(100);
	list1.add(600);
	System.out.println(list1);
	
	Collections.sort(list1);
	System.out.println("arraylist ater sorting"+list1);
	
		
		
		list.clear();
	}

}
