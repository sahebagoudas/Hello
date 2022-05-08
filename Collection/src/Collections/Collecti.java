package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Collecti {
	 
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 ArrayList<Integer> arr= new ArrayList<>();
		 System.out.println("Enter 8 Integers");
		 for (int i=0; i<8; i++) {
			 int s=sc.nextInt();
			 arr.add(s);
		 	 
		 }
		 
		 Collections.addAll(arr);
		System.out.println(arr);
		 
		 //LinkedHashSet<Integer> tr= new LinkedHashSet<>(arr);
		 
		 //System.out.println("Your Treeset is as follows"+"\n");
		 
		// for(int val:tr) {
			 
		//	 System.out.println(val);
		// }
		 
		 
		 
		 
		
		}
		
		
	}


 