package airlines;

public class FirstClass implements BoardingTime {

	private double time;

	public FirstClass(double time) {
		super();
		this.time = time;
	}

	public double computeBoardingTime() {
		
		return time;
		}
	}

