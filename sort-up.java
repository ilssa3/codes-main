package sht;
import java.util.Scanner;
public class masivi2804 {

	public static void main(String[] args) {
		Scanner imp=new Scanner(System.in);
		int i,j,buf;
		int n=imp.nextInt();
		int []mas=new int[n];
		for(i=0;i<n;i++)
			mas[i]=imp.nextInt();
	
	   for (i=0;i<mas.length-1;i++)
		{for (j=i+1;j<mas.length;j++)
		 { if (mas[j]<mas[i])
		  {buf=mas[i];mas[i]=mas[j];mas[j]=buf;}
		
		 
	}		}  System.out.print("podredeni= ");	
	for (i=0;i<mas.length;i++)System.out.println(mas[i]);
	}
		
}
