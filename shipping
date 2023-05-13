package inf2;
import java.util.Scanner;
public class zad1811 {

	public static void main(String[] args) {
		Scanner imp=new Scanner (System.in);
	 double suma=0;//kolko struva pratkata
	 int i=0;
	 for (i=0;i<3;i++)
	 {
		 char p=imp.next().charAt(0);//purva poziciq
		 char v=imp.next().charAt(0);//vtora poziciq
		 double t=imp.nextDouble();//teglo
		 t=t/10;
		 t=Math.ceil(t);
		 if (p=='E'&&v=='U')suma=suma+(t*0.85);
		 if (p=='A'&&v=='M')suma=suma+(t*1.45);
		 if (p=='A'&&v=='F')suma=suma+(t*1.10);
		 if (p=='A'&&v=='A')suma=suma+(t*1.30);
		 if (p=='E'&&v=='C')suma=suma+(t*0.65);
		 if (p=='A'&&v=='U')suma=suma+(t*2.44);
	 }
	 			suma=Math.ceil(suma);
	 		System.out.println("stoinost na pratkata: "+suma);
	 
	 
   }
}
