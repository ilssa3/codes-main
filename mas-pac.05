package inf2;
import java.util.Scanner;
public class zad2101 {

	public static void main(String[] args) {
		
/*Задача 1. Да се състави програма, в която е даден масив от цели числа с дължина 15
а) да се въведат стойности на елементите на масива 
б) да се намери и изведе максималното четно и неговият индекс в масива 
в) да се намери произведението на най – малкото и най-голямото число в масива 
г) да се изведат елементите на масива – 1 т.*/
		
		Scanner sc=new Scanner(System.in);	
	
		
	int mas [] = new int[15];
	int max = mas[0];
	int min;
	int sum = 0;
	int i;
		for (i = 0 ; i < 15 ; i++)
			
	{
			mas[i] = sc.nextInt(); //a)
			 min=mas[0];
				if (mas[i] > max && mas[i]%2==0)max = mas[i]; //b)
				if (mas[i] < min)min = mas[i]; 
				
				sum = min + max;
						
		} 
		System.out.println("maximalna chetna stoinost= "+max);
		System.out.println("sbor= "+sum);
			
		for (i = 0 ; i < 15 ; i++)System.out.print(mas[i]+" ");
			
	}

}
