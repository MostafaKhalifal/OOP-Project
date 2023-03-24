package sum;
import java.util.Random;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		
		int a = ra.nextInt(10)+0 ;
		int b = ra.nextInt(10)+0 ;
		
		int c = a+b ;
		
		System.out.println( a + " + "+ b + " = ");
		 int x = sc.nextInt();
		 
		 if (c == x) {
			 System.out.println("Correct");
		 }
		 else {
			 System.out.println("Wrong"); 
		 };
		
		
		
		

	}

}
