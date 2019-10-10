import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CollegeData
	{
		static ArrayList <CollegeInputs> colleges = new ArrayList <CollegeInputs>();
		static Scanner intInput = new Scanner(System.in);
		static Scanner doubleInput = new Scanner(System.in);
		static JFrame frame = new JFrame();
		static String name;
		static String gpa;
		
		public static void cityWarmColleges()
		{
		
			
			String[] subjects = {"Math", "Science", "English", "History", "Language", "Religion", "Art", "PE"};
			
		    String favoriteSubject = (String) JOptionPane.showInputDialog(frame, 
		            "What is your favorite subject?",
		            "Subjects",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            subjects, 
		            subjects[0]);
			
			if (favoriteSubject.equals("Math")|| favoriteSubject.equals("Science") )
				{
					JOptionPane.showMessageDialog(frame, "Warm large city colleges!");
					System.out.println("What is your gpa?");
				
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "Santa Clara"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Math & Science colleges:", "UCLA, USC, UC Berkely"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
					
				}
			else if (favoriteSubject.equals("English") || favoriteSubject.contentEquals("History"))
				{
					JOptionPane.showMessageDialog(frame, "Warm large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("English & History colleges:", "Occidental College"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("English & History colleges:", "U of Richmond"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
			else 
				{
					JOptionPane.showMessageDialog(frame, "Warm large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "Guilford College, Millsaps College"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Language Arts colleges:", "Rhodes College"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
	
		}
		
		public static void countrysideWarmColleges()
		{
			String[] subjects = {"Math", "Science", "English", "History", "Language", "Religion", "Art", "PE"};
			
		    String favoriteSubject = (String) JOptionPane.showInputDialog(frame, 
		            "What is your favorite subject?",
		            "Subjects",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            subjects, 
		            subjects[0]);
			
			if (favoriteSubject.equals("Math")|| favoriteSubject.equals("Science"))
				{
					JOptionPane.showMessageDialog(frame, "Warm countryside colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "Westmont College"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Math & Science colleges:", "Cal Tech, Stanford, Duke, Cal Poly"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
			else if (favoriteSubject.equals("English") || favoriteSubject.contentEquals("History"))
				{
					JOptionPane.showMessageDialog(frame, "Warm countryside colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("English & History colleges:", "Scripps College"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("English & History colleges:", "Pomona College, Harvey Mudd"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
			else 
				{
					JOptionPane.showMessageDialog(frame, "Warm countryside colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Liberal Arts colleges:", "Biola University"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Language Arts colleges:", "Wake Forest University"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
		
		}
		
		public static void cityColdColleges()
		{
			String[] subjects = {"Math", "Science", "English", "History", "Language", "Religion", "Art", "PE"};
			
		    String favoriteSubject = (String) JOptionPane.showInputDialog(frame, 
		            "What is your favorite subject?",
		            "Subjects",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            subjects, 
		            subjects[0]);
			
			if (favoriteSubject.equals("Math")|| favoriteSubject.equals("Science"))
				{
					JOptionPane.showMessageDialog(frame, "Cold large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Math & Science colleges:", "U Illinois"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Math & Science colleges:", "MIT, Carnegie Mellon, Columbia University"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
			else if (favoriteSubject.equals("English") || favoriteSubject.contentEquals("History"))
				{
					JOptionPane.showMessageDialog(frame, "Cold large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("English & History colleges:", "Trinity College"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("English & History colleges:", "Columbia University, Harvard, U Chicago"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}
			else 
				{
					JOptionPane.showMessageDialog(frame, "Cold large city colleges!");
					System.out.println("What is your gpa?");
					double unweightedGpa = doubleInput.nextDouble();
					if (unweightedGpa < 3.5)
						{
					colleges.add(new CollegeInputs ("Language Arts colleges:", "U of Evansville, Assumption College"));
					JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
					JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					else 
						{	
							colleges.add(new CollegeInputs ("Language Arts colleges:", "Emerson College"));
							JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
							JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
						}
					
				}

		}
		
		public static void countrysideColdColleges()
			{
			String[] subjects = {"Math", "Science", "English", "History", "Language", "Religion", "Art", "PE"};
			
		    String favoriteSubject = (String) JOptionPane.showInputDialog(frame, 
		            "What is your favorite subject?",
		            "Subjects",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            subjects, 
		            subjects[0]);
				
				if (favoriteSubject.equals("Math")|| favoriteSubject.equals("Science"))
					{
						JOptionPane.showMessageDialog(frame, "Cold countryside colleges!");
						System.out.println("What is your gpa?");
						double unweightedGpa = doubleInput.nextDouble();
						if (unweightedGpa < 3.5)
							{
						colleges.add(new CollegeInputs ("Math & Science colleges:", "Purdue"));
						JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
						JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
							}
						else 
							{	
								colleges.add(new CollegeInputs ("Math & Science colleges:", "Cornell, Dartmouth, Princeton"));
								JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
								JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
							}
					}
				else if (favoriteSubject.equals("English") || favoriteSubject.contentEquals("History"))
					{
						JOptionPane.showMessageDialog(frame, "Cold countryside colleges!");
						System.out.println("What is your gpa?");
						double unweightedGpa = doubleInput.nextDouble();
						if (unweightedGpa < 3.5)
							{
						colleges.add(new CollegeInputs ("English & History colleges:", "Amherst College"));
						JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
						JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
							}
						else 
							{	
								colleges.add(new CollegeInputs ("English & History colleges:", "Bowdoin, Williams College"));
								JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
								JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
							}
						
					}
				else 
					{
						JOptionPane.showMessageDialog(frame, "Cold countryside colleges!");
						System.out.println("What is your gpa?");
						double unweightedGpa = doubleInput.nextDouble();
						if (unweightedGpa < 3.5)
							{
						colleges.add(new CollegeInputs ("Language Arts colleges:", "Goshen College"));
						JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
						JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
							}
						else 
							{	
								colleges.add(new CollegeInputs ("Language Arts colleges:", "Carleton College"));
								JOptionPane.showMessageDialog(frame, colleges.get(0).getCategories());
								JOptionPane.showMessageDialog(frame, colleges.get(0).getUniversities());
							}
						
					}
				
			}
			
			

	}
