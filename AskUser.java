import java.util.Scanner;
public class AskUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers => ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1<=n2 && n1<=n3) {
			if (n2<=n3) {
				System.out.println(" "+n1+" "+n2+" "+n3);
			}
			else {
				System.out.println(" "+n1+" "+n3+" "+n2);
			}
		}
		if(n2<=n1 && n2<=n3) {
			if (n1<=n3) {
				System.out.println(" "+n2+" "+n1+" "+n3);
			}
			else {
				System.out.println(" "+n2+" "+n3+" "+n1);
			}
		}
		if(n3<=n2 && n3<=n1) {
			if (n2<=n1) {
				System.out.println(" "+n3+" "+n2+" "+n1);
			}
			else {
				System.out.println(" "+n3+" "+n1+" "+n2);
			}
		}

	}

}
