package collection_1;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
	public static void main(String [] args) {
		ArrayList <Integer> ages = new ArrayList <> (Arrays.asList(10,20,30)) ;
		
		ages.add(28);
		ages.add(26);
		ages.add(27);
		ages.add(25);
		ages.add(26);
		ages.add(26); 
		ages.add(24);
		ages.add(27);
		ages.add(27);
		ages.add(26);
		
		ages.remove(3);
		ages.set(8,99);
		ages.add(3,57);
		for(int i=0; i<ages.size(); i++) {
			System.out.println(ages.get(i));
		}
	}
}
