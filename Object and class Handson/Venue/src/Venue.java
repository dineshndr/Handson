class Venue

{

	String name;

	String city;

	Venue(String name, String city)

	{

		this.name = name;

		this.city = city;

	}

	void displayVenue()

	{
		System.out.println("Venue details");
		System.out.println("Venue name:" + name);

		System.out.println("City name:" + city);

	}

}