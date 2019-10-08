
public class CollegeInputs
	{
		private String categories;
		private String universities;
		
		public CollegeInputs (String c, String u)
		{
			categories = c;
			universities = u;
		}

		public String getCategories()
			{
				return categories;
			}

		public void setCategories(String categories)
			{
				this.categories = categories;
			}

		public String getUniversities()
			{
				return universities;
			}

		public void setUniversities(String universities)
			{
				this.universities = universities;
			}

	}
