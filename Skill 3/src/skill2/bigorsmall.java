package skill2;
import java.util.Scanner;

public class bigorsmall {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();	
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
		}
		int big=a[0],small=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>big) {
				big=a[i];
			}
			else if(a[i]<small) {
				small=a[i];
			}
		}
		s.close();

		
		System.out.println("Smallest is: "+small);
		System.out.println("Biggest is: "+big);
		
		// TODO Auto-generated method stub

	}

}
