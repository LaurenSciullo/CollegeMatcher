import java.util.Scanner;

public class userInputs
	{
		 static Scanner stringInput = new Scanner (System.in);
		 static Scanner intInput = new Scanner (System.in);
		 static String name;
		 
		public static void userData()
		{
			System.out.println("Hello and welcome to the College Matcher! Please enter your name: ");
			 name = stringInput.nextLine();		
			
			
			likes();
			dislikes();
			
		}
		
		public static void likes()
		{
			System.out.println(name + ", what is your favorite season of the year? Please enter your answer with the first letter capitalized:");
			String favoriteSeason = stringInput.nextLine();
			
			if (favoriteSeason.equals("Summer"))
				{
					System.out.println("Summer and... sun!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
							
									CollegeData.cityWarmColleges();
	
						}
					else if (countryOrCity.equals("countryside"))
						{
							CollegeData.countrysideWarmColleges();				
						}
				}
			
			if (favoriteSeason.equals("Fall"))
				{
					System.out.println("Fall and... frosting!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
							CollegeData.cityColdColleges();
							
						}
					else if (countryOrCity.equals("countryside"))
						{
							CollegeData.countrysideColdColleges();
						}
								
						
				}
			
			if (favoriteSeason.equals("Winter"))
				{
					System.out.println("Winter and... wilting!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
								CollegeData.cityColdColleges();
						
						}
					else if (countryOrCity.equals("countryside"))
						{
								CollegeData.countrysideColdColleges();
									
						}
				}
			
			if (favoriteSeason.equals("Spring"))
				{
					System.out.println("Spring and... surprise!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
							CollegeData.cityWarmColleges();
							
						}
					else if (countryOrCity.equals("countryside"))
						{
								CollegeData.countrysideWarmColleges();
									
						}
				}
			
			
		
		}
		
		public static void dislikes()
		{
			
		}
		
		

	}
