package airlines;

public class Main {

	public static void main(String[] args) {

		FirstClass fc = new FirstClass(500);
		BusinessClass bc = new BusinessClass(250);
		EconomyClass ec = new EconomyClass(150);
		BoardingTime [] objs = {fc, bc, ec};
		System.out.println(computeAverageBoardingTime(objs));

	}

  public static double computeAverageBoardingTime(Object [] objs) {
		double total = 0;
		for(Object obj : objs) {
			total += ((BoardingTime)obj).computeBoardingTime();
			System.out.println(obj.getClass().getSimpleName() +"  " +((BoardingTime)obj).computeBoardingTime());
		}
		System.out.print("Total = ");
		return (int)total/objs.length;
	}
}
