package logical;
import java.util.Scanner;
public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean x = true;
		boolean y = false;
		boolean z = (x&&y);
		
		System.out.println("AND Logic (true|false) : "+ z);
		
	    x = false;
		y = true;
		z = (x&&y);
		
		System.out.println("AND Logic (false|true) : "+ z);
		
		x = false;
		y = false;
		z = (x&&y);
		
		System.out.println("AND Logic (false|false) : "+ z);
		
		x = true;
		y = true;
		z = (x&&y);
		
		System.out.println("AND Logic (true|true) : "+ z);
		
		System.out.println("------------------------------------------");
		
		x = true;
		y = false;
		z = (x||y);
		
		System.out.println("OR Logic (true|false) : "+ z);

		x = false;
		y = true;
		z = (x||y);
		
		System.out.println("OR Logic (false|true) : "+ z);
		
		x = false;
		y = false;
		z = (x||y);
		
		System.out.println("OR Logic (false|false) : "+ z);
		
		x = true;
		y = true;
		z = (x||y);
		
		System.out.println("OR Logic (true|true) : "+ z);

		System.out.println("------------------------------------------");
		
		x = true;
		y = false;
		z = (x^y);
		
		System.out.println("XOR Logic (true|false) : "+ z);

		x = false;
		y = true;
		z = (x^y);
		
		System.out.println("XOR Logic (false|true) : "+ z);
		
		x = false;
		y = false;
		z = (x^y);
		
		System.out.println("XOR Logic (false|false) : "+ z);
		
		x = true;
		y = true;
		z = (x^y);
		
		System.out.println("XOR Logic (true|true) : "+ z);

		

	}

}
