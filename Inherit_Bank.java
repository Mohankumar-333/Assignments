class Rbi
{

	void Rbi()
	{
	System.out.println("Follow RBI rules");
	}
}

class Sbi extends Rbi
{   
	
	void sbi()
	{
    System.out.println("SBI Follows rbi rules");
	}
}
class canara extends Rbi
{   
	
	void can()
	{
    
	System.out.println("Canara bank follows RBI rules");
	}
}
class HDFC extends Rbi
{   
	
	void hdfc()
	{
    
	System.out.println("HDFC Bank follow RBI rules" );
	}
}

	
	
	class Inherit_Bank 
{
	public static void main(String[] args) 
	{   
		Rbi r = new Rbi();
		r.Rbi();
		System.out.println("*******");
		Sbi s = new Sbi();
		s.Rbi();
		s.sbi();
		System.out.println("*******");

		canara c = new canara();
		c.Rbi();
		c.can();
		System.out.println("*******");

		HDFC h = new HDFC();
	    h.Rbi();
		h.hdfc();


	}
}
