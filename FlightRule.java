package Java;

public abstract class FlightRule {
	public void Seats()
	{
		System.out.println("Must Be 200 Seats");
	}
	public void pilot()
	{
		System.out.println("Must be 2 pilot and 4 Cabin crew");
	}
	public abstract void Color();
}