import java.util.ArrayList;
import java.util.Scanner;

public class CollegeData
	{
		static ArrayList <CollegeInputs> colleges = new ArrayList <CollegeInputs>();
		static Scanner intInput = new Scanner(System.in);
		static Scanner doubleInput = new Scanner(System.in);
		
		public static void cityWarmColleges()
		{
			
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
					System.out.println("Warm large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "Santa Clara"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Math & Science colleges:", "UCLA, USC, UC Berkely"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
					
				}
			else if (favoriteClass == 3 || favoriteClass == 4)
				{
					System.out.println("Warm large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("English & History colleges:", "Occidental College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("English & History colleges:", "U of Richmond"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
			else 
				{
					System.out.println("Warm large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "Guilford College, Millsaps College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Language Arts colleges:", "Rhodes College"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
	
		}
		
		public static void countrysideWarmColleges()
		{
			
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
					System.out.println("Warm countryside colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "Westmont College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Math & Science colleges:", "Cal Tech, Stanford, Duke, Cal Poly"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
			else if (favoriteClass == 3 || favoriteClass == 4)
				{
					System.out.println("Warm countryside colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("English & History colleges:", "Scripps College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("English & History colleges:", "Pomona College, Harvey Mudd"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
			else 
				{
					System.out.println("Warm countryside colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Liberal Arts colleges:", "Biola University"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Language Arts colleges:", "Wake Forest University"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
		
		}
		
		public static void cityColdColleges()
		{
			
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
					System.out.println("Cold large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "U Illinois"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Math & Science colleges:", "MIT, Carnegie Mellon, Columbia University"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
			else if (favoriteClass == 3 || favoriteClass == 4)
				{
					System.out.println("Cold large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("English & History colleges:", "Trinity College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("English & History colleges:", "Columbia University, Harvard, U Chicago"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}
			else 
				{
					System.out.println("Cold large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "U of Evansville, Assumption College"));
					System.out.println(colleges.get(0).getCategories());
					System.out.println(colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Language Arts colleges:", "Emerson College"));
							System.out.println(colleges.get(0).getCategories());
							System.out.println(colleges.get(0).getUniversities());
						}
					
				}

		}
		
		public static void countrysideColdColleges()
			{
				
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
						System.out.println("Cold countryside colleges!");
						System.out.println("What is your gpa?");
						double unweightedGpa = doubleInput.nextDouble();
						if (unweightedGpa < 3.5)
							{
						colleges.add(new CollegeInputs ("Math & Science colleges:", "Purdue"));
						System.out.println(colleges.get(0).getCategories());
						System.out.println(colleges.get(0).getUniversities());
							}
						else 
							{	
								colleges.add(new CollegeInputs ("Math & Science colleges:", "Cornell, Dartmouth, Princeton"));
								System.out.println(colleges.get(0).getCategories());
								System.out.println(colleges.get(0).getUniversities());
							}
					}
				else if (favoriteClass == 3 || favoriteClass == 4)
					{
						System.out.println("Cold countryside colleges!");
						System.out.println("What is your gpa?");
						double unweightedGpa = doubleInput.nextDouble();
						if (unweightedGpa < 3.5)
							{
						colleges.add(new CollegeInputs ("English & History colleges:", "Amherst College"));
						System.out.println(colleges.get(0).getCategories());
						System.out.println(colleges.get(0).getUniversities());
							}
						else 
							{	
								colleges.add(new CollegeInputs ("English & History colleges:", "Bowdoin, Williams College"));
								System.out.println(colleges.get(0).getCategories());
								System.out.println(colleges.get(0).getUniversities());
							}
						
					}
				else 
					{
						System.out.println("Cold countryside colleges!");
						System.out.println("What is your gpa?");
						double unweightedGpa = doubleInput.nextDouble();
						if (unweightedGpa < 3.5)
							{
						colleges.add(new CollegeInputs ("Language Arts colleges:", "Goshen College"));
						System.out.println(colleges.get(0).getCategories());
						System.out.println(colleges.get(0).getUniversities());
							}
						else 
							{	
								colleges.add(new CollegeInputs ("Language Arts colleges:", "Carleton College"));
								System.out.println(colleges.get(0).getCategories());
								System.out.println(colleges.get(0).getUniversities());
							}
						
					}
				
			}
			
			

	}
