package inf2;
import java.util.Scanner;
public class zad0411 {

	public static void main(String[] args) {
		Scanner imp=new Scanner(System.in);
int c=imp.nextInt();
int b=0;
int sum=0;
int min=c;
int max=c;
int chetno=0;
int pr=1;
	pr=pr*c;
int average;


	while (c!=0)
		{
			if (c%2==0)chetno++;
			if (min>c)min=c;
			if (min<c)max=c;
		pr=pr*c;
		c=imp.nextInt();b=b+1;
		}
	average=sum/b;
	System.out.print("broi chetni:"+chetno+" minimalna stoinost:"+min+" max stoinost:"+max+" proizvedenie:"+pr+" sredno:"+average);	
		
		

	}

}
