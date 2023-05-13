
package uprajnenie;
import java.util.Scanner;
public class zad2riopit {

	public static void main(String[] args){
		Scanner imp=new Scanner(System.in);
		int k,i,j,min,max,sr,sbor=0,buf,brsr=0;
		k=imp.nextInt();
	int []mas=new int[k];
		min=mas[0];
		max=mas[0];
	for (i=0;i<k;i++)
		{mas[i]=imp.nextInt();
		sbor=sbor+mas[i];
		if(mas[i]<min)min=mas [i];
		if(mas[i]>max)max=mas[i];}
	for (i=0;i<k-1;i++)
		{for (j=i+1;j<k;j++)
			{if (mas[j]>mas[i])
				{buf=mas[i];mas[i]=mas[j];mas[j]=buf;
					}
				}
			}
	sr=sbor/k;
	for(i=0;i<k;i++)
		{if (mas[i]>sr)brsr++;}

				System.out.println("klasirane= ");
					for(i=0;i<k;i++)
			System.out.println(mas[i]);
		System.out.println(" minimalen="+min+" maximalen="+max+" sreden="+sr+" broi nad sredniq="+brsr);
		
		
		
		}

	  }


