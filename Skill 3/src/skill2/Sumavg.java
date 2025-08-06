package skill2;
import java.util.Scanner;

public class Sumavg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,sum=0;
		double avg;
		n=s.nextInt();	
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum+=a[i];
		}
		s.close();

		avg=sum/n;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);
		
		// TODO Auto-generated method stub

	}

}
