package pack1;
import java.util.*;

public class TreeMapEg {
	public static void main(String args[]) {
		
		TreeMap<Integer,Integer> T = new TreeMap<Integer,Integer>();
		
		System.out.println("Inserting Elements in TreeMap");
		T.put(3, 4000);     //Ascending order-Key
		T.put(1, 1000);         
		T.put(5, 3000);
		T.put(3, 5000);
		T.put(1, 7000);
		T.put(5, 6000);  //takes overwritten one-key
		System.out.println("Elements in TreeMap are : " +T);
		
		for(Map.Entry<Integer,Integer> m : T.entrySet()) {     
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		T.remove(5);
		System.out.println("After removing : " +T);
		
		System.out.println("DesendingMap : "+T.descendingMap());
		System.out.println("The size of the Treemap is : "+T.size());
		System.out.println("The Value of key is : "+T.get(3));
		
System.out.println();

		TreeMap<Integer,Integer> T1 = new TreeMap<Integer,Integer>();
		T1.putAll(T);
		System.out.println("The New Map are : " +T1);
		System.out.println("The least key are : " +T1.firstKey());
		System.out.println("The Highest key are : " +T1.lastKey());
 }

}
