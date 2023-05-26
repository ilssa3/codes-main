package inf2;
import java.util.Scanner;
public class zad1111 {

	public static void main(String[] args) {
		Scanner imp=new Scanner(System.in);
int m=imp.nextInt();
int n=imp.nextInt();
int ed,des,stot,hil;
int i;
int m1=m;
int novo;
for(i=m;i<n;i++)
	{ int a=i;
	ed=a%10;//edinici
	a=a/10;
	
	des=a%10;
	a=a/10;//desetici
	
	stot=a%10;
	a=a/10;//stotici
	
	hil=a;
	//hilqdni
	
	novo=hil*100+des*10+ed;
	if (novo%11==0)System.out.println(i);
		}	

	}

}
