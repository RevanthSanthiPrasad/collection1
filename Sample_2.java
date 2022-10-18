package collection_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample_2 {
	public static void main(String[]args) {
		ArrayList <String> names = new ArrayList <> (Arrays.asList("Uthay","RevanthPrasad","Varun")) ;
		
		names.add("Malini");
		names.add("SanthiPrasad");
		names.add("Zzzzzzz");
		names.add("MonicaPrasad");
		names.add("Rohith"); 
		names.add("RupaShree");
		names.add("Kasthuri");
		
		names.remove("Rohith");
		names.set(5,"RajaSekaran");
		
		names.forEach(x  ->  {  System.out.println(x); }  );
		
		System.out.println("---------------------Enhanced for-----------------------");
		//enhanced for
		for(String n : names) {
			System.out.println(n);
		}
	}
}
