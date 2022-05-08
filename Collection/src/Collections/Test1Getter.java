package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1Getter {
	public static void main(String[] args) {
		
		List<Students> Std= new ArrayList<>();
		Std.add(new Students(5, "Anna", "Bijapur"));
		Std.add(new Students(80, "Anand", "Sangola"));
		Std.add(new Students(8, "Rushikesh", "Manglaweda"));
		
		Collections.sort(Std);
		
		for (Students S: Std) {
			System.out.println(S);
		}
		
	}

}
