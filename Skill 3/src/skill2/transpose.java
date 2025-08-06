package skill2;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		int r,c;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		int a[][]=new int [r][c];
		int b[][]=new int [r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		// TODO Auto-generated method stub
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=a[j][i];
				System.out.printf(" "+b[i][j]);
				
			}
			System.out.print("\n");
		}
		
		s.close();

	}

}
