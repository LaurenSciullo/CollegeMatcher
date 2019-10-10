import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class userInputs
	{
		 static Scanner stringInput = new Scanner (System.in);
		 static Scanner intInput = new Scanner (System.in);
		 static String name;
		 static JFrame frame = new JFrame();
		 
		 
		public static void userData()
		{
			JOptionPane.showMessageDialog(frame, "Hello and welcome to the College Matcher! ");
			 name = JOptionPane.showInputDialog("Please enter your name:");		
			
			
			likes();
			
		}
		
		public static void likes()
		{
			
			
			 String[] seasons = { "Spring", "Summer", "Fall", "Winter" };
		
		    String seasonType = (String) JOptionPane.showInputDialog(frame, 
		            "What is your favorite season?",
		            "Seasons",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            seasons, 
		            seasons[0]);
			
			//Summer:
			if (seasonType.equals("Summer"))
				{
					
					ImageIcon summer = new ImageIcon(("summer.jpg"));
					JOptionPane.showMessageDialog(frame, summer);
					
					JOptionPane.showMessageDialog(frame, "Summer and... sun!! ");
					Object[] cityOrCountry = {"City", "Country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the City or the Countryside?",
							 name, JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, cityOrCountry, cityOrCountry[1]);
					
					
					if (countryOrCity == 0)
						{
							
									CollegeData.cityWarmColleges();
	
						}
					else if (countryOrCity == 1)
						{
							CollegeData.countrysideWarmColleges();				
						}
				}
			//Fall:
			if (seasonType.equals("Fall") )
				{
					
					ImageIcon fall = new ImageIcon(("fall.jpg"));
					JOptionPane.showMessageDialog(frame, fall);
					
					JOptionPane.showMessageDialog(frame, "Fall and... frosting!! ");
					Object[] cityOrCountry = {"City", "Country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the City or the Countryside?",
							 name, JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, cityOrCountry, cityOrCountry[1]);
					
					
					if (countryOrCity == 0)
						{
							
									CollegeData.cityColdColleges();
	
						}
					else if (countryOrCity == 1)
						{
							CollegeData.countrysideColdColleges();				
						}
					
								
						
				}
			//Winter:
			if (seasonType.equals("Winter"))
				{
					
					ImageIcon winter = new ImageIcon(("winter.png"));
					JOptionPane.showMessageDialog(frame, winter);
					
					JOptionPane.showMessageDialog(frame, "Winter and... wilting!! ");
					Object[] cityOrCountry = {"City", "Country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the City or the Countryside?",
							 name, JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, cityOrCountry, cityOrCountry[1]);
					
					
					if (countryOrCity == 0)
						{
							
									CollegeData.cityColdColleges();
	
						}
					else if (countryOrCity == 1)
						{
							CollegeData.countrysideColdColleges();				
						}
					
					
				}
			//Spring:
			if (seasonType.equals("Spring"))
				{
					
					ImageIcon spring = new ImageIcon(("spring.jpg"));
					JOptionPane.showMessageDialog(frame, spring);
					
					JOptionPane.showMessageDialog(frame, "Spring and... surprise!! ");
					Object[] cityOrCountry = {"City", "Country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the City or the Countryside?",
							 name, JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, cityOrCountry, cityOrCountry[1]);
					
					
					if (countryOrCity == 0)
						{
							
									CollegeData.cityWarmColleges();
	
						}
					else if (countryOrCity == 1)
						{
							CollegeData.countrysideWarmColleges();				
						}
					
					
				}
			
			
		
		}
		
		
		
		

	}
