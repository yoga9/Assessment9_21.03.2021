package pack1;
import java.util.*;
public class StackEg {
	
     public static void main(String[] args) {
    	 Stack<Integer> st = new Stack<Integer>();
    	 System.out.println("Insert Values to Stack");
    	 st.push(40);
    	 st.push(60);
    	 st.push(30);
    	 st.push(70);
    	 st.push(10);
    	 st.push(60);
    	 System.out.println("Elements in stack1 : "+st);
    	 System.out.println("Element at top of the stack: "+st.peek());
    	 System.out.println("First Removed element from stack: "+st.pop());
    	 System.out.println("Find the element in stack: "+st.search(70)); //not indexing
    	 System.out.println("Is stack is Empty : "+st.empty());
    	 System.out.println("The size of the stack: "+st.size());
    	 System.out.println("The capacity of the stack: "+st.capacity());
    	 
    	 Iterator<Integer> i = st.iterator();
 		while(i.hasNext()) {
 			System.out.println(i.next());
 		}
 System.out.println();	
 	    System.out.println("Second Removed element from stack: "+st.pop());
 		for(Integer i1 : st) {
			System.out.println(i1);}
 		
 		st.removeAllElements();
 		System.out.println("All the elements removed from stack : "+st);
 		System.out.println("Is the stack is empty : "+st.isEmpty()); 
    	 
 		st.add(0,90);
 		//st.add(2,60);  //here 2>1 Exception
 		st.add(1,50);
 		st.add(2,60);
 		st.addElement(null);
 		st.add(30);
 		//st.replace(2,20);     undefined
 		
 		System.out.println(st);
 		System.out.println("The stack has : "+st.search(null));   
 		System.out.println("The stack has : "+st.search(70)); //-1
 		System.out.println("The stack contains : "+st.contains(50));
 		
 		Stack<Integer> st1 = new Stack<Integer>();
 		st1.add(90);
 		st1.add(50);
 		st1.add(60);
 		st1.add(null);
 		System.out.println("Elements in stack : "+st1);
 		System.out.println("stack1 & stack2 are equals : "+st.equals(st1));
 		
 		ListIterator<Integer> l = st1.listIterator(st1.size());   //Iterate top 2 bottom
 		while(l.hasPrevious()) {
 			Integer a = l.previous();
 			System.out.println(a);
 		}
     }}

