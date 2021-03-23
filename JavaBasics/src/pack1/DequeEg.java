package pack1;
import java.util.*;

public class DequeEg {
     public static void main(String args[]) {
    	 
    	 Deque<String> d = new ArrayDeque<String>();
    	 
    	 System.out.println("Deque elements are: ");
    	 d.add("Ram");
    	 d.add("Sara");
    	 d.add("Deepz");
    	 d.add("Surya");
    	 System.out.println("The added elements are: "+d);
    	 
    	 d.addFirst("Goma");
    	 d.addLast("Vizhag");
    	 System.out.println("The newly added elements are: "+d);
    	 
    	 System.out.println("Pop the element:" +d.pop());
    	 
    	 System.out.println("Poll the element:" +d.poll());
    	 System.out.println("Poll the 1st element:" +d.pollFirst());
    	 System.out.println("Poll the last element:" +d.pollLast());
    	 
    	 System.out.println("Get the 1st element:" +d.getFirst());
    	 System.out.println("Get the last element:" +d.getLast());
    	 
    	 System.out.println("Peek element:" +d.peek());
    	 System.out.println("Peek 1st element:" +d.peekFirst());
    	 System.out.println("Peek last element:" +d.peekLast());  
    	 
    	 System.out.println("Remove the element:" +d.remove());
    	 
    	 System.out.println("The current elements are: "+d);
    	 d.offer("Yalz");
    	 d.offer("Moni");
    	 d.offerFirst("Yasmin");
    	 d.offerLast("Vicky");
    	 System.out.println("The updated elements are: "+d); 
    	 
    	 for(String s : d) {
    		 System.out.println(s); 
    	 }
    		 
    	
    			 
  }
}
