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
		 static int favoriteSeason;
		 
		public static void userData()
		{
			JOptionPane.showMessageDialog(frame, "Hello and welcome to the College Matcher! ");
			 name = JOptionPane.showInputDialog("Please enter your name:");		
			
			
			likes();
			
		}
		
		public static void likes()
		{
			
			Object[] options = {"Spring", "Summer", "Fall", "Winter"};
			favoriteSeason = JOptionPane.showOptionDialog(frame, name + ", what is your favorite season of the year?",
					 name, JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options[3]);
			
			//Summer:
			if (favoriteSeason == 1)
				{
					
					ImageIcon summer = new ImageIcon(("summer.jpg"));
					JOptionPane.showMessageDialog(frame, summer);
					
					JOptionPane.showMessageDialog(frame, "Summer and... sun!! ");
					Object[] cityOrCountry = {"city", "country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the city or the countryside?",
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
			if (favoriteSeason == 2 )
				{
					
					ImageIcon fall = new ImageIcon(("fall.jpg"));
					JOptionPane.showMessageDialog(frame, fall);
					
					JOptionPane.showMessageDialog(frame, "Fall and... frosting!! ");
					Object[] cityOrCountry = {"city", "country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the city or the countryside?",
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
			if (favoriteSeason == 3)
				{
					
					ImageIcon winter = new ImageIcon(("winter.png"));
					JOptionPane.showMessageDialog(frame, winter);
					
					JOptionPane.showMessageDialog(frame, "Winter and... wilting!! ");
					Object[] cityOrCountry = {"city", "country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the city or the countryside?",
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
			if (favoriteSeason == 0)
				{
					
					ImageIcon spring = new ImageIcon(("spring.jpg"));
					JOptionPane.showMessageDialog(frame, spring);
					
					JOptionPane.showMessageDialog(frame, "Spring and... surprise!! ");
					Object[] cityOrCountry = {"city", "country"};
					int countryOrCity  = JOptionPane.showOptionDialog(frame, "Do you like the city or the countryside?",
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
