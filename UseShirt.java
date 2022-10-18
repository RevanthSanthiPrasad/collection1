package collection_1;

import java.util.ArrayList;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1 = new Shirt("Polo", 400, "Red", true);
		Shirt s2 = new Shirt("Otto", 1500, "blue", false);
		Shirt s3 = new Shirt("Ramraj", 700, "green", true);
		
		
		ArrayList <Shirt> shirts = new ArrayList <> () ;
		
		shirts.add(s1); shirts.add(s2); shirts.add(s3); 
		
		shirts.add(new Shirt("Winter", 300, "pink", false));
		shirts.add(new Shirt("Jockey", 1900, "peach", true));
		
		// for
		for(Shirt z : shirts) {
			System.out.println(z);
		}
		System.out.println("===========forEach ==========================");
		//forEach
		shirts.forEach(z ->  {  System.out.println("Brand = "+z.getBrand());  }  );
		
		
		System.out.println("===========refVariable.forEach(Object or Wrapper class    forRefVariable  :  refVariable)  ================");
		
		ArrayList <Shirt> checkedShirt = new ArrayList <> ();
		
		for(Shirt z : shirts) {
			if(z.getChecked() == true ) {
				checkedShirt.add(z);
			}
		}
		checkedShirt.forEach(x -> System.out.println(x));
		
		
		//ArrayList <> () ;   =   it is a default constructor;
		
		// this is without angular bracket <> is also run, but it is not a proper way & show warning
		/*ArrayList  li = new ArrayList () ;
		li.add(17);
		li.add("revanth");
		li.add('s');
		
		System.out.println(li);*/
	}
}
