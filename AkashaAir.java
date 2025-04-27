package Java;

public class AkashaAir extends FlightRule{
	public static void main(String[] args)
	{
		AkashaAir air = new AkashaAir();
		air.Color();
		air.pilot();
		air.Seats();
	}
	@Override
	public void Color() {
		System.out.println("Based on Company chose must be define");
		
	}
}
