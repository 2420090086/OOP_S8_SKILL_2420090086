package skill2;

import java.util.Scanner;

public class multimat {

	public static void main(String[] args) {
		int r,c;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		int a[][]=new int [r][c];
		int b[][]=new int [r][c];
		int d[][]=new int [r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		// TODO Auto-generated method stub
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=s.nextInt();
			}
		}
		s.close();
		
		for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                for (int k=0;k<c;k++) {
                    d[i][j]+=a[i][k]*b[k][j];
                    
                }
            }
            
        }
		 for (int i=0;i<r;i++) {
	            for (int j=0;j<c;j++) {
	                System.out.print(d[i][j]+" ");
	            }
	            System.out.println();
	        }

	}

}
