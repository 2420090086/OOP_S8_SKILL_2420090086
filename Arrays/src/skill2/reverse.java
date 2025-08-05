package skill2;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
	
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(" "+a[i]);
					
		}
		
		// TODO Auto-generated method stub
		

	}

}
