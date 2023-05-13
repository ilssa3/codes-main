package uprajnenie;
import java. util.Scanner;
public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imp=new Scanner(System.in);
int brg=0,brm=0,brgl=0,brc=0,N=imp.nextInt(),i;
char c;
for (i=0;i<=N;i++) { c=imp.next().charAt(0);
	if(c>='A' && c<='Z')brg++;
	if(c>='a' && c<='z')brm++;
	if(c>='0' && c>='9')brc++;
	if(c=='a' ||c=='A' ||c=='u' ||c=='U'|| c=='i' ||c=='I' ||c=='e' ||c=='E' ||c=='o' ||c=='O')brgl++;
}
	System.out.println(brg+" "+brm+" "+brgl+" "+brc);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
