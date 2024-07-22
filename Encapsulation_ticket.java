class Movie
{
	private double price=150;
	private String moviename;
	private int no_of_tickets;
	private String language;
	private int availabletickets=100;
	private int remaining_tickets;

	
	public void setmoviename(String moviename)
	{
		this.moviename=moviename;
	}
	public void setno_of_tickets(int no_of_tickets)
	{
		this.no_of_tickets=no_of_tickets;
	}
	public void setlanguage(String language)
	{
		this.language=language;
	}
	public String getlanguage()
	{
		return language;
	}
	public String getmoviename()
	{
		return moviename;
	}
	public double gettotalprice()
	{
		return price*no_of_tickets;
	}
	
    public int getremaining_tickets()
	{
		return availabletickets-no_of_tickets;
	}
	public int getavailabletickets()
	{
		return availabletickets;
	}



}




class Encapsulation_ticket 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to BookmyShow");
		Movie m=new Movie();
		System.out.println("Available tickets = " + m.getavailabletickets());
		m.setmoviename("Movie name = A");
		System.out.println(m.getmoviename());
		m.setlanguage("Language = Kannada");
		System.out.println(m.getlanguage());
		m.setno_of_tickets(5);
		System.out.println("Total price = " + m.gettotalprice());
		System.out.println("Remaining tickets = " +m.getremaining_tickets());


		

	}
}
