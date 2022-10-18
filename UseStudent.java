package collection_1;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Revanth", "Male", 30000);
		Student s2 = new Student("SanthiPrasad", "Male", 35000);
		Student s3 = new Student("Malini", "female", 56000);
		Student s4 = new Student("Monica", "female", 27000);
		Student s5 = new Student("Rupa", "female", 20000);
		
		/*Student s6 = new Student("Rohith", "Male", 90000);
		Student s7 = new Student("Varun", "Male", 12000);
		Student s8 = new Student("Santhosh", "Male", 27000);
		Student s9 = new Student("Kass", "female", 44000);
		Student s10 = new Student("Bhuvana", "female", 68000);*/
		
		ArrayList <Student> s = new ArrayList <> () ;
		
		s.add(s1); s.add(s2); s.add(s3); s.add(s4); s.add(s5);
		/*s.add(s6); s.add(s7); s.add(s8); s.add(s9); s.add(s10);*/
		
		// no need above constructor student
		s.add(new Student("Bhuvana", "female", 35000));
		// s.add(new Student("Malini", "female", 56000));
		
		
		//normal for loop
		
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
			System.out.println(s.get(i).getName()+"\n");
		}
		
		System.out.println("==================Enhanced for===================");
		
		// enhanced for
		for(Student z : s) {
			System.out.println(z);
			System.out.println(z.getName().startsWith("S")+"\n");
		}
		
		System.out.println(" ");
		System.out.println("===================forEach==============================");
		//forEach
		s.forEach(z -> { System.out.println(z); } );
		
		System.out.println(" ");
		System.out.println("===================forEach getName()========================");
		
		s.forEach(z -> { System.out.println(z.getName()); }  );
		System.out.println("===================forEach getGender()========================");
		
		s.forEach(z -> {  System.out.println(z.getGender());  }  );
		System.out.println("===================forEach getFees()===========================");
		
		s.forEach(z -> {  System.out.println(z.getFees());  }  );
		System.out.println("==============forEach equalsIgnoreCase=====================");
		
		
		s.forEach(z -> {
			if(z.getName().equalsIgnoreCase("Revanth")) {
				System.out.println(z.getName());
			}
		});
		
		System.out.println("===============forEach getFees() == equals equals method  ============");
		
		// fees
		s.forEach(z -> {
			if(z.getFees() == 27000) {
				System.out.println(z.getFees());
			}
		});
		System.out.println("============only female details have to be printed====================");
		
		// only female details
		ArrayList <Student> females = new ArrayList <> () ;
		
		for (Student f : s) {
			if (f.getGender().equalsIgnoreCase("female")) {
				females.add(f);
			}
		}
		females.forEach(z ->  {  System.out.println(z);  }  );
		
		System.out.println("========String length() less than 5 & those all details to be printed==========");
		
		// name length more than 5
		ArrayList <Student> name = new ArrayList <> () ;
		for (Student x : s ) {
			if(x.getName().length()>5) {
				name.add(x);
			}
		}
		name.forEach(z ->  {  System.out.println(z);  }  );
	}
}