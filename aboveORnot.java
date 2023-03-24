
package aboveORnot;
import java.util.Scanner;
import java.util.*;
public class aboveORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = ((43*y)+(25*x));
		
		if(z/25 > 88) {
			System.out.println("the ball is above the line");
		}
		else if(z/25 == 88) {
			System.out.println("the ball on the line");
		}
		
		else {
			System.out.println("the ball is not above the line");
		}
		
	}

}
