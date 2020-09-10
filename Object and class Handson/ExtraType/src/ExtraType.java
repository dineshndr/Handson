class ExtraType
{
	private String name;
	
	private long runs;

	ExtraType(String name,long runs) {
		super();
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {

		this.runs = runs;
	}
	
	public void displayExtra()
	{
		System.out.println("ExtraType Details");
		System.out.println("Extra Type:"+name);
		System.out.println("Runs:"+runs);
	}
}
