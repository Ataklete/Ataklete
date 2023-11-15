package airlines;

public class BusinessClass implements BoardingTime{

	private double time;
	public BusinessClass(double time) {
		super();
		this.time = time;
	}

	public double computeBoardingTime() {
	
		return time%10 + time/10;
		}
	}


