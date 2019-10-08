import java.util.ArrayList;
import java.util.Scanner;

public class CollegeData
	{
		static ArrayList <CollegeInputs> colleges = new ArrayList <CollegeInputs>();
		static Scanner intInput = new Scanner(System.in);
		
		public static void cityWarmColleges()
		{
			System.out.println("Warm large city colleges!");
			System.out.println("\nWhat is your favorite subject in school? "
					+ "\n1) Math"
					+ "\n2) Science"
					+ "\n3) English"
					+ "\n4) History"
					+ "\n5) Language "
					+ "\n6) Religion"
					+ "\n7) Art"
					+ "\n8) PE");
			int favoriteClass = intInput.nextInt();
			if (favoriteClass == 1 || favoriteClass == 2)
				{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "UCLA, USC, UC Berkely"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
			else if (favoriteClass == 3 || favoriteClass == 4)
				{
					colleges.add(new CollegeInputs ("English & History colleges:", "U of Richmond, Occidental College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
			else 
				{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "Guilford College, Millsaps College, Rhodes College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
	
		}
		
		public static void countrysideWarmColleges()
		{
			System.out.println("Warm countryside colleges!");
			System.out.println("\nWhat is your favorite subject in school? "
					+ "\n1) Math"
					+ "\n2) Science"
					+ "\n3) English"
					+ "\n4) History"
					+ "\n5) Language "
					+ "\n6) Religion"
					+ "\n7) Art"
					+ "\n8) PE");
			int favoriteClass = intInput.nextInt();
			if (favoriteClass == 1 || favoriteClass == 2)
				{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "Cal Tech, Stanford, Duke, Cal Poly"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
			else if (favoriteClass == 3 || favoriteClass == 4)
				{
					colleges.add(new CollegeInputs ("English & History colleges:", "Pomona College, Harvey Mudd, Scripps College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
			else 
				{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "Wake Forest University, Biola University"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
		
		}
		
		public static void cityColdColleges()
		{
			System.out.println("Cold large city colleges!");
			System.out.println("\nWhat is your favorite subject in school? "
					+ "\n1) Math"
					+ "\n2) Science"
					+ "\n3) English"
					+ "\n4) History"
					+ "\n5) Language "
					+ "\n6) Religion"
					+ "\n7) Art"
					+ "\n8) PE");
			int favoriteClass = intInput.nextInt();
			if (favoriteClass == 1 || favoriteClass == 2)
				{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "MIT, Carnegie Mellon, University Illinois, Columbia University"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
			else if (favoriteClass == 3 || favoriteClass == 4)
				{
					colleges.add(new CollegeInputs ("English & History colleges:", "Columbia, Harvard, U Chicago"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}
			else 
				{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "Emerson College, U of Evansville, Assumption College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
				}

		}
		
		public static void countrysideColdColleges()
			{
				System.out.println("Cold countryside colleges!");
				System.out.println("\nWhat is your favorite subject in school? "
						+ "\n1) Math"
						+ "\n2) Science"
						+ "\n3) English"
						+ "\n4) History"
						+ "\n5) Language "
						+ "\n6) Religion"
						+ "\n7) Art"
						+ "\n8) PE");
				int favoriteClass = intInput.nextInt();
				if (favoriteClass == 1 || favoriteClass == 2)
					{
						colleges.add(new CollegeInputs ("Math & Science colleges", "Cornell, Dartmouth, Princeton, Purdue"));
						System.out.println(colleges.get(0).getCategories());
						System.out.println(colleges.get(0).getUniversities());
					}
				else if (favoriteClass == 3 || favoriteClass == 4)
					{
						colleges.add(new CollegeInputs ("English & History colleges:", "Bowdoin, Williams College, Amherst College"));
						System.out.println(colleges.get(0).getCategories());
						System.out.println(colleges.get(0).getUniversities());
					}
				else 
					{
						colleges.add(new CollegeInputs ("Language Arts colleges:", "Goshen College, Carleton College"));
						System.out.println(colleges.get(0).getCategories());
						System.out.println(colleges.get(0).getUniversities());
					}
				
			}
			
			

	}
