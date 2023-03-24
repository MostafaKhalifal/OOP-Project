import java.util.Scanner;
public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Angel => ");
		Double a = sc.nextDouble();
		Double y = 90-a;
		Double sine=(4*a*(180-a))/(40500-a*(180-a));
		Double cos=(4*y*(180-y))/(40500-y*(180-y));
		System.out.println("Sine"+a+"="+sine);
		System.out.println("cos"+a+"="+cos);
		

	}

}
