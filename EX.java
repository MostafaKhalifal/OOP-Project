
package ex;
import java.util.Scanner;
public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     int s = 0;
	         int p = 1;
	         int i =0;
	         Scanner sc = new Scanner (System.in);
	         System.out.println("Enter value => ");
	         int a = sc.nextInt();
	         System.out.println("Enter Q to quit or X to continue => ");
	         String b = sc.next();
	         while (!b.equals("q")) {
	        	 s+=a;
	        	 p+=a;
	        	 i++;
	        	 System.out.println("Enter value => ");
		         a = sc.nextInt();
		         System.out.println("Enter Q to quit or X to continue => ");
		          b = sc.next();
		          if(b.equals("q")) {
		        	  break;
		          }
		       
		          System.out.println("Average is "+s/i);
			       System.out.println("the proud is "+p);
	         }
	      

	}

}
