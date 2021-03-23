package pack1;
import java.util.*;

public class VectorEg {
        
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		
		System.out.println("List of Top 5 Technologies in IT Industry - 2021 - Vector1");
		v1.add("Cloud Computing");
		v1.add("Big Data Analytics");
		v1.add("Automation");
		v1.add("Artificial Intelligence");
		v1.add("Mobile Apps");
		System.out.println("Top 5 list are : "+v1);
		
		Iterator<String> i = v1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Size is "+v1.size());
		System.out.println("Capacity is "+v1.capacity());
		
		v1.addElement("Blockchain Data");
		v1.addElement("Virtual Reality");
		v1.addElement("Augmented Reality");
		
		//System.out.println("Newly added list are : "+v);
		
		System.out.println("Now Size is "+v1.size());
		System.out.println("Now Capacity is "+v1.capacity());
				
		System.out.println("The First Element is : "+v1.firstElement())	;
		System.out.println("The Last Element is : "+v1.lastElement());
		
 System.out.println();
 
		System.out.println("List of Top 5 Programming languages in IT Industry - 2021 - Vector2");
		Vector<String> v2 = new Vector<String>();
		v2.add("Java");
		v2.add("Python");
		v2.add("JavaScript");
		v2.add("C#");
		v2.add("Java");
		v2.add("PHP");
		v2.add(null);
		System.out.println("Top 5 list are :" +v2);
		
		for(String s : v2) {
			System.out.println("Top 5 list are : "+s);
		}
		
		System.out.println("Remove element at index 4 : " +v2.remove(4));
		System.out.println("After Removal "+v2);
		System.out.println("Hash code of Vector2 : "+v2.hashCode());
		
		v2.insertElementAt("C++",2);
		System.out.println("Insert new element : "+v2);
		
//		v2.insertElementAt("C++",9);                            //Exception 9>5
//		System.out.println("Insert new element : "+v2);
		
		v1.addAll(v2);
		System.out.println("The Combined Vector list are : "+v1);
		
		System.out.println("Is the vector empty :" +v2.isEmpty());
		
		if(v2.contains("C++")) 
			System.out.println("C++ is contain at the index of : "+v2.indexOf("C++"));
			{
				if(v2.contains("php")) 
					System.out.println(v2.contains("php"));
				
					else
						System.out.println("Not present");
			}
			
		System.out.println("Cloned Vector2 : " +v2.clone());
		
		v2.clear();
		System.out.println("Size of the vector2 : " +v2);
}
			
}

	

