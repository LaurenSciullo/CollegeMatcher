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
							System.out.println("Interesting. What is your favorite subject in school? "
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
									CollegeData.cityWarmColleges();
								}
							else if (favoriteClass == 3 || favoriteClass == 4)
								{
									CollegeData.cityWarmColleges();
								}
							else 
								{
									CollegeData.cityWarmColleges();
								}
						}
					else if (countryOrCity.equals("countryside"))
						{
							
									System.out.println("Interesting. What is your favorite subject in school? "
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
											CollegeData.countrysideWarmColleges();
										}
									else if (favoriteClass == 3 || favoriteClass == 4)
										{
											CollegeData.countrysideWarmColleges();
										}
									else 
										{
											CollegeData.countrysideWarmColleges();
										}
						}
				}
			
			if (favoriteSeason.equals("Fall"))
				{
					System.out.println("Fall and... frosting!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
							System.out.println("Interesting. What is your favorite subject in school? "
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
									CollegeData.cityColdColleges();
								}
							else if (favoriteClass == 3 || favoriteClass == 4)
								{
									CollegeData.cityColdColleges();
								}
							else 
								{
									CollegeData.cityColdColleges();
								}
						}
					else if (countryOrCity.equals("countryside"))
						{
							
									System.out.println("Interesting. What is your favorite subject in school? "
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
											CollegeData.countrysideColdColleges();
										}
									else if (favoriteClass == 3 || favoriteClass == 4)
										{
											CollegeData.countrysideColdColleges();
										}
									else 
										{
											CollegeData.countrysideColdColleges();
										}
						}
				}
			
			if (favoriteSeason.equals("Winter"))
				{
					System.out.println("Winter and... wilting!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
							System.out.println("Interesting. What is your favorite subject in school? "
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
									CollegeData.cityColdColleges();
								}
							else if (favoriteClass == 3 || favoriteClass == 4)
								{
									CollegeData.cityColdColleges();
								}
							else 
								{
									CollegeData.cityColdColleges();
								}
						}
					else if (countryOrCity.equals("countryside"))
						{
							
									System.out.println("Interesting. What is your favorite subject in school? "
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
											CollegeData.countrysideColdColleges();
										}
									else if (favoriteClass == 3 || favoriteClass == 4)
										{
											CollegeData.countrysideColdColleges();
										}
									else 
										{
											CollegeData.countrysideColdColleges();
										}
						}
				}
			
			if (favoriteSeason.equals("Spring"))
				{
					System.out.println("Spring and... surprise!! Do you like the city or the countryside?");
					String countryOrCity = stringInput.nextLine();
					if (countryOrCity.equals("city"))
						{
							System.out.println("Interesting. What is your favorite subject in school? "
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
									CollegeData.cityWarmColleges();
								}
							else if (favoriteClass == 3 || favoriteClass == 4)
								{
									CollegeData.cityWarmColleges();
								}
							else 
								{
									CollegeData.cityWarmColleges();
								}
						}
					else if (countryOrCity.equals("countryside"))
						{
							
									System.out.println("Interesting. What is your favorite subject in school? "
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
											CollegeData.countrysideWarmColleges();
										}
									else if (favoriteClass == 3 || favoriteClass == 4)
										{
											CollegeData.countrysideWarmColleges();
										}
									else 
										{
											CollegeData.countrysideWarmColleges();
										}
						}
				}
			
			
		
		}
		
		public static void dislikes()
		{
			
		}
		
		

	}
