package inf22;
import java.util.Scanner;
public class matrixzad2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();//redove
		int m=sc.nextInt();//koloni

			int [][] a = new int [n][m];
			int i;
			int j;
			int s1=0;
			int s2=0;
			int s3=0;
			int s4=0;
			
			
			 for (i=0;i<n;i++){	 
		         for( j=0;j<m;j++)
		              a[i][j]=sc.nextInt();
		         
		         }	
															
			 for ( i=0;i<n;i++){
			        System.out.println();
			            for( j=0;j<m;j++)
			                System.out.print(a[i][j]+" ");}
			

	}

}
