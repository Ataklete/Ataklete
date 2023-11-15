package airlines;

public class EconomyClass implements BoardingTime {
	private double time;

	public EconomyClass(double time) {
		super();
		this.time = time;
	}



	public double computeBoardingTime(){

		return time;

	}
}
