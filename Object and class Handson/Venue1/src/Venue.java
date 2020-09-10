class Venue

{

	private String name;

	private String city;

	Venue(String name,String city)
	{
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	void displayVenue()

	{
		System.out.println("Venue details");
		System.out.println("Venue name:" + name);

		System.out.println("City name:" + city);
		
		
	}
	
	void showVenue()
	{
		System.out.println("Verify and Update Venue Details\nMenu\n1.Update Venue Name\n2.Update City Name\n3.All informations Correct/Exit\nType 1 or 2 or 3");
	}

}